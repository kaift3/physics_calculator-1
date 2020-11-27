package com.protexcreative.physicscalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CalculateActivity extends AppCompatActivity {

    private TextView formula_name;
    private ImageView favourite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        Intent intent = getIntent();
        String fid = intent.getStringExtra("fid");

        formula_name = findViewById(R.id.formula_name);
        favourite = findViewById(R.id.favourite);

        if(fid.equals("f1")){
            formula_name.setText("Formula 1");
        } else if(fid.equals("f2")){
            formula_name.setText("Formula 2");
        } else if(fid.equals("f3")){
            formula_name.setText("Formula 3");
        } else if(fid.equals("f4")){
            formula_name.setText("Formula 4");
        } else if(fid.equals("f5")){
            formula_name.setText("Formula 5");
        }

        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (favourite.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.ic_favourite_3).getConstantState())
                {
                    Toast.makeText(getApplicationContext(), "Formula Added to Favourites!", Toast.LENGTH_LONG).show();
                    favourite.setImageResource(R.drawable.ic_favourite_2);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Formula Removed from Favourites", Toast.LENGTH_LONG).show();
                    favourite.setImageResource(R.drawable.ic_favourite_3);
                }
            }
        });

    }
}