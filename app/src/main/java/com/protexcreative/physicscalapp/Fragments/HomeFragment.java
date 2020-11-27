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
import android.widget.ImageView;
import android.widget.Toast;

import com.protexcreative.physicscalapp.Adapter.FormulaAdapter;
import com.protexcreative.physicscalapp.CalculateActivity;
import com.protexcreative.physicscalapp.MainActivity;
import com.protexcreative.physicscalapp.Model.Formula;
import com.protexcreative.physicscalapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeFragment extends Fragment {

//    private RecyclerView recyclerView;
    private FormulaAdapter formulaAdapter;
    private List<Formula> formulaList;

    private CardView f1, f2, f3, f4, f5;
    private ImageView ff1, ff2, ff3, ff4, ff5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

//        recyclerView = view.findViewById(R.id.recycler_view);
//
//        recyclerView.setHasFixedSize(true);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        linearLayoutManager.setReverseLayout(true);
//        linearLayoutManager.setStackFromEnd(true);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        formulaList = new ArrayList<>();
//        formulaAdapter = new FormulaAdapter(getContext(), formulaList);
//        recyclerView.setAdapter(formulaAdapter);
//
//        readFormulas();

        f1 = view.findViewById(R.id.f1);
        f2 = view.findViewById(R.id.f2);
        f3 = view.findViewById(R.id.f3);
        f4 = view.findViewById(R.id.f4);
        f5 = view.findViewById(R.id.f5);

        ff1 = view.findViewById(R.id.ff1);
        ff2 = view.findViewById(R.id.ff2);
        ff3 = view.findViewById(R.id.ff3);
        ff4 = view.findViewById(R.id.ff4);
        ff5 = view.findViewById(R.id.ff5);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CalculateActivity.class);
                intent.putExtra("fid", "f1");
                getContext().startActivity(intent);
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CalculateActivity.class);
                intent.putExtra("fid", "f2");
                getContext().startActivity(intent);
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CalculateActivity.class);
                intent.putExtra("fid", "f3");
                getContext().startActivity(intent);
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CalculateActivity.class);
                intent.putExtra("fid", "f4");
                getContext().startActivity(intent);
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CalculateActivity.class);
                intent.putExtra("fid", "f5");
                getContext().startActivity(intent);
            }
        });

        ff1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ff1.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.ic_favourite_3).getConstantState())
                {
                    Toast.makeText(getContext(), "Formula Added to Favourites!", Toast.LENGTH_LONG).show();
                    ff1.setImageResource(R.drawable.ic_favourite_2);
                }
                else
                {
                    Toast.makeText(getContext(), "Formula Removed from Favourites", Toast.LENGTH_LONG).show();
                    ff1.setImageResource(R.drawable.ic_favourite_3);
                }
            }
        });

        ff2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ff2.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.ic_favourite_3).getConstantState())
                {
                    Toast.makeText(getContext(), "Formula Added to Favourites!", Toast.LENGTH_LONG).show();
                    ff2.setImageResource(R.drawable.ic_favourite_2);
                }
                else
                {
                    Toast.makeText(getContext(), "Formula Removed from Favourites", Toast.LENGTH_LONG).show();
                    ff2.setImageResource(R.drawable.ic_favourite_3);
                }
            }
        });

        ff3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ff3.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.ic_favourite_3).getConstantState())
                {
                    Toast.makeText(getContext(), "Formula Added to Favourites!", Toast.LENGTH_LONG).show();
                    ff3.setImageResource(R.drawable.ic_favourite_2);
                }
                else
                {
                    Toast.makeText(getContext(), "Formula Removed from Favourites", Toast.LENGTH_LONG).show();
                    ff3.setImageResource(R.drawable.ic_favourite_3);
                }
            }
        });

        ff4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ff4.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.ic_favourite_3).getConstantState())
                {
                    Toast.makeText(getContext(), "Formula Added to Favourites!", Toast.LENGTH_LONG).show();
                    ff4.setImageResource(R.drawable.ic_favourite_2);
                }
                else
                {
                    Toast.makeText(getContext(), "Formula Removed from Favourites", Toast.LENGTH_LONG).show();
                    ff4.setImageResource(R.drawable.ic_favourite_3);
                }
            }
        });

        ff5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ff5.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.ic_favourite_3).getConstantState())
                {
                    Toast.makeText(getContext(), "Formula Added to Favourites!", Toast.LENGTH_LONG).show();
                    ff5.setImageResource(R.drawable.ic_favourite_2);
                }
                else
                {
                    Toast.makeText(getContext(), "Formula Removed from Favourites", Toast.LENGTH_LONG).show();
                    ff5.setImageResource(R.drawable.ic_favourite_3);
                }
            }
        });

        return view;
    }

//    private void readFormulas(){
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("fid", "F01");
//        hashMap.put("name", "Speed Formula");
//        Formula formula = new Formula(hashMap);
//        formulaList.add(formula);
//        formulaList.add(formula);
//        formulaList.add(formula);
//
//        formulaAdapter.notifyDataSetChanged();
//    }
}