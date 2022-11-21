package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
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