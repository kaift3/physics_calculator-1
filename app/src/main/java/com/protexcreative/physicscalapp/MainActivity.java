package com.protexcreative.physicscalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.protexcreative.physicscalapp.DataBase.DataBaseHelper;
import com.protexcreative.physicscalapp.Fragments.AboutFragment;
import com.protexcreative.physicscalapp.Fragments.CategoryFragment;
import com.protexcreative.physicscalapp.Fragments.FavouriteFragment;
import com.protexcreative.physicscalapp.Fragments.HomeFragment;
import com.protexcreative.physicscalapp.Model.Formula;

public class MainActivity extends AppCompatActivity {

    // declare bottom navigation view
    BottomNavigationView bottomNavigationView;
    // set selected fragment to null
    Fragment selectedFragment = null;

    DataBaseHelper dataBaseHelper;
    Formula formula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataBaseHelper = new DataBaseHelper(getApplicationContext());
//        formula = new Formula("f1", "Motion", "Speed Formula",  "Description", "", false, true);
//        dataBaseHelper.addOne(formula);
//        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_SHORT).show();

//        dataBaseHelper.deleteAll();
//        dataBaseHelper.dropTable();
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
                        case R.id.nav_about:
                            selectedFragment = new AboutFragment();
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
}