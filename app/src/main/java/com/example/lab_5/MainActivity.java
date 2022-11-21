package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

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

    // linked to the button in the XML
    public void GoToProfileSelect(View view){
        Intent intent = new Intent(MainActivity.this, ProfileActivty.class);
        startActivity(intent);
    }

    // linked to the button in the XML
    public void OpenGoogleMaps(View view){
        EditText address = (EditText) findViewById(R.id.AddressEdit);

        Uri gmUrl = Uri.parse("https://www.google.com/maps?q=" + address.getText());

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmUrl);

        mapIntent.setPackage("com.google.android.apps.maps");

        startActivity(mapIntent);
    }
}