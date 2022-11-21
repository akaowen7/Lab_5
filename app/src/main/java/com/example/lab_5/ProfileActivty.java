package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {
    EditText inputTxt;

    Button submitB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ProfileActivity);

        inputTxt = findViewById(R.id.inputTxt);
        submitB = findViewById(R.id.submitB);

        submitB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }


            public void onClick(view v){
                Intent returnIntent = new Intent();
                returnIntent.putExtra("txtData", inputTxt.getText().toString);
                setResult(RESULT_OK,returnIntent);
                finish();
            }

        });

    }


}
