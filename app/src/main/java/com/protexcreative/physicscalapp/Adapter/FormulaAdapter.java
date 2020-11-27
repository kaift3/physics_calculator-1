package com.protexcreative.physicscalapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.protexcreative.physicscalapp.Model.Formula;
import com.protexcreative.physicscalapp.R;

import java.util.List;

public class FormulaAdapter extends RecyclerView.Adapter<FormulaAdapter.ViewHolder> {

    public Context mContext;
    public List<Formula> mFormula;

    public FormulaAdapter(Context mContext, List<Formula> mFormula) {
        this.mContext = mContext;
        this.mFormula = mFormula;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.formula_item, viewGroup, false);
        return new FormulaAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        final Formula formula = mFormula.get(i);
        }

        @Override
        public int getItemCount() {
            return mFormula.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView fid, name;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                fid = itemView.findViewById(R.id.fid);
            name = itemView.findViewById(R.id.name);
        }
    }
}