package com.example.manue.studentportal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PortalViewHolder extends RecyclerView.ViewHolder {

    public TextView textView;
    public View view;

    public PortalViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.titleText);
        view = itemView;
    }
}
