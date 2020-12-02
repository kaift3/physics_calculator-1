package com.protexcreative.physicscalapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.protexcreative.physicscalapp.CalculateActivity;
import com.protexcreative.physicscalapp.Calculation.Calculate;
import com.protexcreative.physicscalapp.DataBase.DataBaseHelper;
import com.protexcreative.physicscalapp.MainActivity;
import com.protexcreative.physicscalapp.Model.Formula;
import com.protexcreative.physicscalapp.R;

import java.util.List;

public class FavouriteAdapter extends RecyclerView.Adapter<FavouriteAdapter.ViewHolder> {

    public Context mContext;
    public List<Formula> mFormula;
    public DataBaseHelper dataBaseHelper;

    public FavouriteAdapter(Context mContext, List<Formula> mFormula) {
        this.mContext = mContext;
        this.mFormula = mFormula;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.formula_item, viewGroup, false);
        return new FavouriteAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        final Formula formula = mFormula.get(i);

        dataBaseHelper = new DataBaseHelper(mContext);

        viewHolder.fname.setText(formula.getFname());
        viewHolder.fcat.setText(formula.getFcat());

        viewHolder.fcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, CalculateActivity.class);
                intent.putExtra("fid", formula.getFid());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mFormula.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView fname, fcat;
        public CardView fcard;
        public ImageView ffav;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            fname = itemView.findViewById(R.id.ft);
            fcat = itemView.findViewById(R.id.fc);
            fcard = itemView.findViewById(R.id.f);
        }
    }
}