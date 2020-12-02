package com.protexcreative.physicscalapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.protexcreative.physicscalapp.Adapter.FavouriteAdapter;
import com.protexcreative.physicscalapp.CalculateActivity;
import com.protexcreative.physicscalapp.CategoryActivity;
import com.protexcreative.physicscalapp.DataBase.DataBaseHelper;
import com.protexcreative.physicscalapp.Model.Formula;
import com.protexcreative.physicscalapp.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryFragment extends Fragment {

    private CardView c1, c2, c3, c4, c5, c6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);

        c1 = view.findViewById(R.id.c1);
        c2 = view.findViewById(R.id.c2);
        c3 = view.findViewById(R.id.c3);
        c4 = view.findViewById(R.id.c4);
        c5 = view.findViewById(R.id.c5);
        c6 = view.findViewById(R.id.c6);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("fcat", "Motion");
                getContext().startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("fcat", "Force");
                getContext().startActivity(intent);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("fcat", "Fluids");
                getContext().startActivity(intent);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("fcat", "Optics");
                getContext().startActivity(intent);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("fcat", "Thermodynamics");
                getContext().startActivity(intent);
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CategoryActivity.class);
                intent.putExtra("fcat", "Work and Energy");
                getContext().startActivity(intent);
            }
        });

        return view;
    }
}