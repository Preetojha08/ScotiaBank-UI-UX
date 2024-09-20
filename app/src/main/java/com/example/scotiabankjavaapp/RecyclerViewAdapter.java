package com.example.scotiabankjavaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {

    LayoutInflater layoutInflater;
    List<String> text;
    List<Integer> Images;



    public RecyclerViewAdapter(Context context, List<String> text, List<Integer> images) {
        this.text = text;
        Images = images;
        this.layoutInflater =LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.settinglayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.viewHolder holder, int position) {
        holder.tv.setText(text.get(position));
        holder.imgview.setImageResource(Images.get(position));
    }

    @Override
    public int getItemCount() {
        return text.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView tv;
        ImageView imgview;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imgview = itemView.findViewById(R.id.setting_rv_imageview);
            tv = itemView.findViewById(R.id.setting_rv_textview);
        }
    }


}
