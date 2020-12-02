package com.protexcreative.physicscalapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.protexcreative.physicscalapp.Adapter.FormulaAdapter;
import com.protexcreative.physicscalapp.CalculateActivity;
import com.protexcreative.physicscalapp.DataBase.DataBaseHelper;
import com.protexcreative.physicscalapp.MainActivity;
import com.protexcreative.physicscalapp.Model.Formula;
import com.protexcreative.physicscalapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private FormulaAdapter formulaAdapter;
    private List<Formula> allFormulas;

    DataBaseHelper dataBaseHelper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        dataBaseHelper = new DataBaseHelper(getContext());

        recyclerView = view.findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        allFormulas = new ArrayList<>();
        allFormulas = dataBaseHelper.getAllFormulas();
        Toast.makeText(getContext(), allFormulas.toString(), Toast.LENGTH_SHORT).show();
        formulaAdapter = new FormulaAdapter(getContext(), allFormulas);
        recyclerView.setAdapter(formulaAdapter);

        return view;
    }
}