package com.example.lab_5;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ActivityResultLauncher<Intent> profileActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        ImageView avatarImage = (ImageView) findViewById(R.id.Flag);

                        String name = "flag_ca";
                        switch (data.getIntExtra("ImageID", R.id.Flag1)) {
                            case R.id.Flag1:
                                name = "flag_ca";
                                break;
                            case R.id.Flag2:
                                name = "flag_eg";
                                break;
                            case R.id.Flag3:
                                name = "flag_fr";
                                break;
                            case R.id.Flag4:
                                name = "flag_jp";
                                break;
                            case R.id.Flag5:
                                name = "flag_kr";
                                break;
                            case R.id.Flag6:
                                name = "flag_sp";
                                break;
                            case R.id.Flag7:
                                name = "flag_tr";
                                break;
                            case R.id.Flag8:
                                name = "flag_uk";
                                break;
                            case R.id.Flag9:
                                name = "flag_us";
                                break;
                        }
                        int resID = getResources().getIdentifier(name, "drawable", getPackageName());
                        avatarImage.setImageResource(resID);
                    }
                }
            });

    // linked to the image in the XML
    public void GoToProfileSelect(View view){
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    // linked to the button in the XML
    public void OnOpenInGoogleMaps(View view) {
        EditText teamAddress = (EditText) findViewById(R.id.AddressEdit);
        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q=" + teamAddress.getText());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

}
