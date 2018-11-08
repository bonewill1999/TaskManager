package com.example.johnnybahama.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        ArrayList<Acount> acounts = new ArrayList<Acount>();
        final TextView createAcount = (TextView) findViewById(R.id.CreateAcount);

        acounts.add(new Acount("John"));
        acounts.add(new Acount("Jack"));
        acounts.add(new Acount("Jason"));


        Spinner acountSelection = findViewById(R.id.AcountSelection);

        ArrayAdapter<Acount> adapter = new ArrayAdapter<Acount>(this, android.R.layout.simple_spinner_dropdown_item, acounts);

        acountSelection.setAdapter(adapter);




        createAcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginScreen.this, AcountCreation.class);
                startActivity(intent);


            }
        });





    }
}
