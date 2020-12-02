package com.protexcreative.physicscalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.protexcreative.physicscalapp.Adapter.CategoryAdapter;
import com.protexcreative.physicscalapp.Adapter.FormulaAdapter;
import com.protexcreative.physicscalapp.DataBase.DataBaseHelper;
import com.protexcreative.physicscalapp.Model.Formula;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    private List<Formula> allCategory;
    private TextView category_name;

    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        dataBaseHelper = new DataBaseHelper(getApplicationContext());

        recyclerView = findViewById(R.id.recycler_view);
        category_name = findViewById(R.id.category_name);

        Intent intent = getIntent();
        String fcat = intent.getStringExtra("fcat");

        category_name.setText(fcat);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        allCategory = new ArrayList<>();
        allCategory = dataBaseHelper.getAllCatFormulas(fcat);
        Toast.makeText(getApplicationContext(), allCategory.toString(), Toast.LENGTH_SHORT).show();
        categoryAdapter = new CategoryAdapter(getApplicationContext(), allCategory);
        recyclerView.setAdapter(categoryAdapter);
    }
}