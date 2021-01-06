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

    private RelativeLayout law1;
    private EditText uVal, aVal, tVal;

    private RelativeLayout law2;
    private EditText s1Val, u1Val, t1Val, a1Val;

    private RelativeLayout law3;
    private EditText u2Val, a2Val, s2Val, s3Val;

    private RelativeLayout cf;
    private EditText zVal, rVal, t3Val;

    private RelativeLayout afr;
    private EditText maVal, mfVal;

    private RelativeLayout ri;
    private EditText cVal, vVal;

    private RelativeLayout lmf;
    private EditText muVal, r1Val, r2Val;

    private RelativeLayout work;
    private EditText fVal, dVal, degVal;

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

//        SPEED
        speed = findViewById(R.id.speed);
        distVal = findViewById(R.id.distVal);
        timeVal = findViewById(R.id.timeVal);

//        LAW 1
        law1 = findViewById(R.id.law1);
        uVal = findViewById(R.id.uVal);
        aVal = findViewById(R.id.aVal);
        tVal = findViewById(R.id.tVal);

//        LAW 2
        law2 = findViewById(R.id.law2);
        s1Val = findViewById(R.id.s1Val);
        u1Val = findViewById(R.id.u1Val);
        t1Val = findViewById(R.id.t1Val);
        a1Val = findViewById(R.id.a1Val);

//        LAW 3
        law3 = findViewById(R.id.law3);
        u2Val = findViewById(R.id.u2Val);
        a2Val = findViewById(R.id.a2Val);
        s2Val = findViewById(R.id.s2Val);
        s3Val = findViewById(R.id.s3Val);

//        CF
        cf = findViewById(R.id.cf);
        zVal = findViewById(R.id.zVal);
        rVal = findViewById(R.id.rVal);
        t3Val = findViewById(R.id.t3Val);

//        AFR
        afr = findViewById(R.id.afr);
        maVal = findViewById(R.id.maVal);
        mfVal = findViewById(R.id.mfVal);

//        RI
        ri = findViewById(R.id.ri);
        cVal = findViewById(R.id.cVal);
        vVal = findViewById(R.id.vVal);

//        LMF
        lmf = findViewById(R.id.lmf);
        muVal = findViewById(R.id.muVal);
        r1Val = findViewById(R.id.r1Val);
        r2Val = findViewById(R.id.r2Val);

//        WORK
        work = findViewById(R.id.work);
        fVal = findViewById(R.id.fVal);
        dVal = findViewById(R.id.dVal);
        degVal = findViewById(R.id.degVal);

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
            law1.setVisibility(View.GONE);
            law2.setVisibility(View.GONE);
            law3.setVisibility(View.GONE);
            work.setVisibility(View.GONE);
            lmf.setVisibility(View.GONE);
            afr.setVisibility(View.GONE);
            ri.setVisibility(View.GONE);
            cf.setVisibility(View.GONE);
        } else if(fid.equals("f2")){
            formula_name.setText("1st Law of Motion");
            fdesc.setText("Description");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
            law1.setVisibility(View.VISIBLE);
            law2.setVisibility(View.GONE);
            law3.setVisibility(View.GONE);
            work.setVisibility(View.GONE);
            lmf.setVisibility(View.GONE);
            afr.setVisibility(View.GONE);
            ri.setVisibility(View.GONE);
            cf.setVisibility(View.GONE);
        } else if(fid.equals("f3")){
            formula_name.setText("2nd Law of Motion");
            fdesc.setText("Description");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
            law1.setVisibility(View.GONE);
            law2.setVisibility(View.VISIBLE);
            law3.setVisibility(View.GONE);
            work.setVisibility(View.GONE);
            lmf.setVisibility(View.GONE);
            afr.setVisibility(View.GONE);
            ri.setVisibility(View.GONE);
            cf.setVisibility(View.GONE);
        } else if(fid.equals("f4")){
            formula_name.setText("3rd Law of Motion");
            fdesc.setText("Description");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
            law1.setVisibility(View.GONE);
            law2.setVisibility(View.GONE);
            law3.setVisibility(View.VISIBLE);
            work.setVisibility(View.GONE);
            lmf.setVisibility(View.GONE);
            afr.setVisibility(View.GONE);
            ri.setVisibility(View.GONE);
            cf.setVisibility(View.GONE);
        } else if(fid.equals("f5")){
            formula_name.setText("Work Formula");
            fdesc.setText("Description");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
            law1.setVisibility(View.GONE);
            law2.setVisibility(View.GONE);
            law3.setVisibility(View.GONE);
            work.setVisibility(View.VISIBLE);
            lmf.setVisibility(View.GONE);
            afr.setVisibility(View.GONE);
            ri.setVisibility(View.GONE);
            cf.setVisibility(View.GONE);
        } else if(fid.equals("f6")){
            formula_name.setText("Lens Maker's Formula");
            fdesc.setText("Description");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
            law1.setVisibility(View.GONE);
            law2.setVisibility(View.GONE);
            law3.setVisibility(View.GONE);
            work.setVisibility(View.GONE);
            lmf.setVisibility(View.VISIBLE);
            afr.setVisibility(View.GONE);
            ri.setVisibility(View.GONE);
            cf.setVisibility(View.GONE);
        } else if(fid.equals("f7")){
            formula_name.setText("Refractive Index Formula");
            fdesc.setText("Description");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
            law1.setVisibility(View.GONE);
            law2.setVisibility(View.GONE);
            law3.setVisibility(View.GONE);
            work.setVisibility(View.GONE);
            lmf.setVisibility(View.GONE);
            afr.setVisibility(View.GONE);
            ri.setVisibility(View.VISIBLE);
            cf.setVisibility(View.GONE);
        } else if(fid.equals("f8")){
            formula_name.setText("Air Fuel Formula");
            fdesc.setText("Description");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
            law1.setVisibility(View.GONE);
            law2.setVisibility(View.GONE);
            law3.setVisibility(View.GONE);
            work.setVisibility(View.GONE);
            lmf.setVisibility(View.GONE);
            afr.setVisibility(View.VISIBLE);
            ri.setVisibility(View.GONE);
            cf.setVisibility(View.GONE);
        } else if(fid.equals("f9")){
            formula_name.setText("Compressibility Factor Formula");
            fdesc.setText("Description");
            if(dataBaseHelper.checkFav(fid)){
                favourite.setImageResource(R.drawable.ic_favourite_2);
            }else{
                favourite.setImageResource(R.drawable.ic_favourite_3);
            }
            speed.setVisibility(View.GONE);
            law1.setVisibility(View.GONE);
            law2.setVisibility(View.GONE);
            law3.setVisibility(View.GONE);
            work.setVisibility(View.GONE);
            lmf.setVisibility(View.GONE);
            afr.setVisibility(View.GONE);
            ri.setVisibility(View.GONE);
            cf.setVisibility(View.VISIBLE);
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
                        String uStr = uVal.getText().toString();
                        String aStr = aVal.getText().toString();
                        String tStr = tVal.getText().toString();
                        if(!uStr.matches("") && !aStr.matches("") && !tStr.matches("")){
                            float ux = Integer.parseInt(uStr);
                            float ax = Integer.parseInt(aStr);
                            float tx = Integer.parseInt(tStr);
                            float result = calObj.calLaw1(ux, ax, tx);
                            resBox.setText(result + " m/s");
                            resBox.setVisibility(View.VISIBLE);
                    }else{
                        Toast.makeText(getApplicationContext(), "Enter Values to get Result", Toast.LENGTH_LONG).show();
                    }
                } else if(fid.equals("f3")){
                    String s1Str = s1Val.getText().toString();
                    String u1Str = u1Val.getText().toString();
                    String t1Str = t1Val.getText().toString();
                    String a1Str = a1Val.getText().toString();
                    if(!s1Str.matches("") && !u1Str.matches("") && !t1Str.matches("") && !a1Str.matches("")){
                        float s1x = Integer.parseInt(s1Str);
                        float u1x = Integer.parseInt(u1Str);
                        float t1x = Integer.parseInt(t1Str);
                        float a1x = Integer.parseInt(a1Str);
                        double result = calObj.calLaw2(s1x, u1x, t1x, a1x);
                        resBox.setText(result + " m");
                        resBox.setVisibility(View.VISIBLE);
                    }else{
                        Toast.makeText(getApplicationContext(), "Enter Values to get Result", Toast.LENGTH_LONG).show();
                    }
                } else if(fid.equals("f4")){
                    String u2Str = u2Val.getText().toString();
                    String a2Str = a2Val.getText().toString();
                    String s2Str = s2Val.getText().toString();
                    String s3Str = s3Val.getText().toString();
                    if(!u2Str.matches("") && !a2Str.matches("") && !s2Str.matches("") && !s3Str.matches("")){
                        float u2x = Integer.parseInt(u2Str);
                        float a2x = Integer.parseInt(a2Str);
                        float s2x = Integer.parseInt(s2Str);
                        float s3x = Integer.parseInt(s3Str);
                        double result = calObj.calLaw3(u2x, a2x, s2x, s3x);
                        resBox.setText(result + " m");
                        resBox.setVisibility(View.VISIBLE);
                    }else{
                        Toast.makeText(getApplicationContext(), "Enter Values to get Result", Toast.LENGTH_LONG).show();
                    }
                } else if(fid.equals("f5")){
                    String fStr = fVal.getText().toString();
                    String dStr = dVal.getText().toString();
                    String degStr = degVal.getText().toString();
                    if(!fStr.matches("") && !dStr.matches("") && !degStr.matches("")){
                        float fx = Integer.parseInt(fStr);
                        float dx = Integer.parseInt(dStr);
                        float degx = Integer.parseInt(degStr);
                        double result = calObj.calWork(fx, dx, degx);
                        resBox.setText(result + " J");
                        resBox.setVisibility(View.VISIBLE);
                    }else{
                        Toast.makeText(getApplicationContext(), "Enter Values to get Result", Toast.LENGTH_LONG).show();
                    }
                }else if(fid.equals("f6")){
                    String muStr = muVal.getText().toString();
                    String r1Str = r1Val.getText().toString();
                    String r2Str = r2Val.getText().toString();
                    if(!muStr.matches("") && !r1Str.matches("") && !r2Str.matches("")){
                        float mux = Integer.parseInt(muStr);
                        float r1x = Integer.parseInt(r1Str);
                        float r2x = Integer.parseInt(r2Str);
                        float result = calObj.calLMF(mux, r1x, r2x);
                        resBox.setText(result + " m/s");
                        resBox.setVisibility(View.VISIBLE);
                    }else{
                        Toast.makeText(getApplicationContext(), "Enter Values to get Result", Toast.LENGTH_LONG).show();
                    }
                } else if(fid.equals("f7")){
                    String cStr = cVal.getText().toString();
                    String vStr = vVal.getText().toString();
                    if(!cStr.matches("") && !vStr.matches("")){
                        float cx = Integer.parseInt(cStr);
                        float vx = Integer.parseInt(vStr);
                        float result = calObj.calRI(cx, vx);
                        resBox.setText(result + " ");
                        resBox.setVisibility(View.VISIBLE);
                    }else{
                        Toast.makeText(getApplicationContext(), "Enter Values to get Result", Toast.LENGTH_LONG).show();
                    }
                } else if(fid.equals("f8")){
                    String maStr = maVal.getText().toString();
                    String mfStr = mfVal.getText().toString();
                    if(!maStr.matches("") && !mfStr.matches("")){
                        float max = Integer.parseInt(maStr);
                        float mfx = Integer.parseInt(mfStr);
                        float result = calObj.calAFR(max, mfx);
                        resBox.setText(result + " ");
                        resBox.setVisibility(View.VISIBLE);
                    }else{
                        Toast.makeText(getApplicationContext(), "Enter Values to get Result", Toast.LENGTH_LONG).show();
                    }
                } else if(fid.equals("f9")){
                    String zStr = zVal.getText().toString();
                    String rStr = rVal.getText().toString();
                    String t3Str = t3Val.getText().toString();
                    if(!zStr.matches("") && !rStr.matches("") && !t3Str.matches("")){
                        float zx = Integer.parseInt(zStr);
                        float rx = Integer.parseInt(rStr);
                        float t3x = Integer.parseInt(t3Str);
                        float result = calObj.calCF(zx, rx, t3x);
                        resBox.setText(result + " m/s");
                        resBox.setVisibility(View.VISIBLE);
                    }else{
                        Toast.makeText(getApplicationContext(), "Enter Values to get Result", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}