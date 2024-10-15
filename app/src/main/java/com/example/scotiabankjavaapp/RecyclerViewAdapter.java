package com.example.scotiabankjavaapp;

import android.content.Context;
<<<<<<< HEAD
import android.util.Log;
=======
>>>>>>> origin/master
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
<<<<<<< HEAD
    int layout_number ;

    List<Integer> Images;

    public RecyclerViewAdapter(Context context, List<String> text, int layout_number) {
        this.text = text;
        this.layout_number = layout_number;
        this.layoutInflater =LayoutInflater.from(context);
    }
=======
    List<Integer> Images;

>>>>>>> origin/master

    public RecyclerViewAdapter(Context context, List<String> text, List<Integer> images) {
        this.text = text;
        Images = images;
        this.layoutInflater =LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
<<<<<<< HEAD

        View view;
        if (layout_number == 10) {
            view = layoutInflater.inflate(R.layout.textlayout, parent, false);
        } else {
            view = layoutInflater.inflate(R.layout.settinglayout, parent, false);
        }

        return new viewHolder(view);


=======
        View view = layoutInflater.inflate(R.layout.settinglayout,parent,false);
        return new viewHolder(view);
>>>>>>> origin/master
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.viewHolder holder, int position) {
        holder.tv.setText(text.get(position));
<<<<<<< HEAD
        if (layout_number == 0 )
        {
            holder.imgview.setImageResource(Images.get(position));
        }

=======
        holder.imgview.setImageResource(Images.get(position));
>>>>>>> origin/master
    }

    @Override
    public int getItemCount() {
        return text.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView tv;
        ImageView imgview;
<<<<<<< HEAD

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imgview = itemView.findViewById(R.id.setting_rv_imageview);
            if (layout_number == 10)
            {
                tv = itemView.findViewById(R.id.textlayout_rv_textview);
            }
            else
            {
                tv = itemView.findViewById(R.id.setting_rv_textview);
            }


=======
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imgview = itemView.findViewById(R.id.setting_rv_imageview);
            tv = itemView.findViewById(R.id.setting_rv_textview);
>>>>>>> origin/master
        }
    }


}
