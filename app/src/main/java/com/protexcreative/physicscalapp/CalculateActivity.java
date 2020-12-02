package com.protexcreative.physicscalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.protexcreative.physicscalapp.Calculation.Calculate;
import com.protexcreative.physicscalapp.DataBase.DataBaseHelper;

public class CalculateActivity extends AppCompatActivity {

    private TextView formula_name;
    private ImageView favourite;

    private TextView fdesc;
    private ImageView fimg;
    private Button cal;
    private TextView resBox;

    private RelativeLayout speed;
    private EditText distVal;
    private EditText timeVal;

    private DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        dataBaseHelper = new DataBaseHelper(getApplicationContext());

        Intent intent = getIntent();
        String fid = intent.getStringExtra("fid");

        formula_name = findViewById(R.id.formula_name);
        favourite = findViewById(R.id.favourite);
        fdesc = findViewById(R.id.fdesc);
        fimg = findViewById(R.id.fimg);
        cal = findViewById(R.id.cal);
        resBox = findViewById(R.id.resBox);

        speed = findViewById(R.id.speed);
        distVal = findViewById(R.id.distVal);
        timeVal = findViewById(R.id.timeVal);

        Calculate calObj = new Calculate();
        resBox.setVisibility(View.GONE);

        if(fid.equals("f1")){
            formula_name.setText("Speed Formula");
            fdesc.setText("The formula for speed is speed = distance ÷ time. To work out what the units are for speed, you need to know the units for distance and time. In this example, distance is in metres (m) and time is in seconds (s), so the units will be in metres per second (m/s).");
//            fimg.setImageResource(R.drawable.ic_fspeed);
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.VISIBLE);
        } else if(fid.equals("f2")){
            formula_name.setText("Formula 2");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
        } else if(fid.equals("f3")){
            formula_name.setText("Formula 3");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
        } else if(fid.equals("f4")){
            formula_name.setText("Formula 4");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
        } else if(fid.equals("f5")){
            formula_name.setText("Formula 5");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
        }

        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dataBaseHelper.checkFav(fid)){
                    dataBaseHelper.setFav(false, fid);
                    Toast.makeText(getApplicationContext(), "Formula removed from Favourites", Toast.LENGTH_LONG).show();
                    favourite.setImageResource(R.drawable.ic_favourite_3);
                }
                else{
                    dataBaseHelper.setFav(true, fid);
                    Toast.makeText(getApplicationContext(), "Formula added to Favourites", Toast.LENGTH_LONG).show();
                    favourite.setImageResource(R.drawable.ic_favourite_2);
                }
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fid.equals("f1")){
                    String distStr = distVal.getText().toString();
                    String timeStr = timeVal.getText().toString();
                    if(!distStr.matches("") && !timeStr.matches("")){
                        float dist = Integer.parseInt(distStr);
                        float time = Integer.parseInt(timeStr);
                        float result = calObj.calSpeed(dist, time);
                        resBox.setText(result + " m/s");
                        resBox.setVisibility(View.VISIBLE);
                    }else{
                        Toast.makeText(getApplicationContext(), "Enter Values to get Result", Toast.LENGTH_LONG).show();
                    }
                } else if(fid.equals("f2")){
                    Toast.makeText(getApplicationContext(), "Calculated", Toast.LENGTH_LONG).show();
                } else if(fid.equals("f3")){
                    Toast.makeText(getApplicationContext(), "Calculated", Toast.LENGTH_LONG).show();
                } else if(fid.equals("f4")){
                    Toast.makeText(getApplicationContext(), "Calculated", Toast.LENGTH_LONG).show();
                } else if(fid.equals("f5")){
                    Toast.makeText(getApplicationContext(), "Calculated", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}