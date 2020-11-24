package com.protexcreative.physicscalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.protexcreative.physicscalapp.Fragments.CalculatorFragment;
import com.protexcreative.physicscalapp.Fragments.CategoryFragment;
import com.protexcreative.physicscalapp.Fragments.FavouriteFragment;
import com.protexcreative.physicscalapp.Fragments.HomeFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // declare bottom navigation view
    BottomNavigationView bottomNavigationView;
    // set selected fragment to null
    Fragment selectedFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get UI ids
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        // set navigation selector method
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

        // create bundle intent and the extras
        Bundle intent = getIntent().getExtras();
        // if intent is null
        if(intent != null){

        } else{
            // if intent is null then home fragment will be shown
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        }
    }

    // method to select a fragment from bottom navigation
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    // switch case for menu.xml file menu
                    switch(menuItem.getItemId()){
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;

                        case R.id.nav_category:
                            selectedFragment = new CategoryFragment();
                            break;

                        case R.id.nav_favourite:
                            selectedFragment = new FavouriteFragment();
                        break;

                        case R.id.nav_calculator:
                            selectedFragment = new CalculatorFragment();
                            break;

                    }
            // if the selected fragment is not null
            if(selectedFragment != null){
                // go to a selected fragment
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            }
            return true;
        }
    };

    @Override
    public void onBackPressed(){


        ActivityManager mngr = (ActivityManager) getSystemService( ACTIVITY_SERVICE );

        List<ActivityManager.RunningTaskInfo> taskList = mngr.getRunningTasks(10);

        if(taskList.get(0).numActivities == 1 &&
                taskList.get(0).topActivity.getClassName().equals(this.getClass().getName())) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

            builder.setTitle("Exit Physics Calculator?");
            builder.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    MainActivity.super.onBackPressed();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.dismiss();
                }
            });
            builder.show();
        }
        else
        {
            super.onBackPressed();
        }
    }

}