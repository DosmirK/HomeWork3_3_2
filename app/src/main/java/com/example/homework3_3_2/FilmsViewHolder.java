package com.example.homework3_3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilmsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFilmsName;
    public FilmsViewHolder(@NonNull View itemView) {
        super(itemView);

        initView();
    }

    private void initView() {
        tvFilmsName = itemView.findViewById(R.id.tv_films_name);
    }

    public void onBond(String filmsName){
        tvFilmsName.setText(filmsName);
    }
}
