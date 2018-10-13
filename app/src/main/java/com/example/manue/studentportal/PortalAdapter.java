package com.example.manue.studentportal;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PortalAdapter extends RecyclerView.Adapter<PortalViewHolder> {

    private Context context;
    public List<Portal> listPortals;

    public PortalAdapter(Context context, List<Portal> listPortals){
        this.context = context;
        this.listPortals = listPortals;
    }

    @NonNull
    @Override
    public PortalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view = inflater.inflate(android.R.layout.simple_list_item_1, null);
        PortalViewHolder viewHolder = new PortalViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PortalViewHolder holder, int position) {
        final Portal portal = listPortals.get(position);
        holder.textView.setText(portal.getmTitleText());

        holder.textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, WebMain.class);
                intent.putExtra("Url", portal.getmUrlText());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPortals.size();
    }
}
