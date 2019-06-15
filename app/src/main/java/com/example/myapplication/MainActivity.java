package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    public void clickFunction(View view){
        ImageView imgView = (ImageView) findViewById(R.id.jokerImageView);
        if(count==0){
            imgView.setImageResource(R.drawable.madtitan);
            count=1;
        }else{
            imgView.setImageResource(R.drawable.joker);
            count=0;
        }
        Toast.makeText(this, "Image Changed!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
