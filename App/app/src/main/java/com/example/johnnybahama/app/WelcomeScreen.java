package com.example.johnnybahama.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity {

    private static final String Title = "TASK MANAGER";


    @Override
    protected void onCreate(Bundle savedInstanceState) {





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        final ImageView swipeUp = (ImageView) findViewById(R.id.SwipeUp);


        final TextView title = (TextView) findViewById(R.id.Title);
        title.setText(Title);


        swipeUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(WelcomeScreen.this, LoginScreen.class);
                startActivity(intent);


            }
        });





    }
}
