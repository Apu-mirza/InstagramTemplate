package com.example.instagramc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String[] countryNames;

    public MyAdapter(Context context, String[] countryNames) {

        this.context = context;
        this.countryNames = countryNames;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.story_sample, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(countryNames[position]);

    }

    @Override
    public int getItemCount() {
        return countryNames.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.storyImage);
            name = itemView.findViewById(R.id.countryNameId);

        }
    }
}

