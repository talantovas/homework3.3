package com.geeks.homework33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FlowersViewHolder extends RecyclerView.ViewHolder {

    private TextView tvFlower;
    public FlowersViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFlower = itemView.findViewById(R.id.tv_flower);
    }

    public void onBind(String flowersName){
        tvFlower.setText(flowersName);

    }
}
