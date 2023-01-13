package com.example.parkiory;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView imgEX;
    TextView capEX, desEX;

    public MyHolder(@NonNull @androidx.annotation.NonNull View itemView) {
        super(itemView);

        this.imgEX = itemView.findViewById(R.id.ex1);
        this.capEX = itemView.findViewById(R.id.captionEX1);
        this.desEX = itemView.findViewById(R.id.descEX1);
    }
}
