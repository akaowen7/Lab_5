package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {
    EditText inputTxt;

    Button submitB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

//        inputTxt = findViewById(R.id.inputTxt);
//        submitB = findViewById(R.id.submitB);
//
//        submitB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//
//
//            public void onClick(view v){
//                Intent returnIntent = new Intent();
//                returnIntent.putExtra("txtData", inputTxt.getText().toString);
//                setResult(RESULT_OK,returnIntent);
//                finish();
//            }
//
//        });

    }


    // I link this to the images in the XML
    public void SelectTeamIcon (View view){
        Intent intent = new Intent();
        ImageView selectImage = (ImageView) view;

        intent.putExtra("ImageID", selectImage.getId());
        setResult(RESULT_OK, intent);

        finish();
    }
}