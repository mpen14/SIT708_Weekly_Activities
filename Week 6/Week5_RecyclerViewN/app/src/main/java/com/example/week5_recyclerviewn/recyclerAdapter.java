package com.example.week5_recyclerviewn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.ViewHolder> {

    String[] data;
    Context context;

    public recyclerAdapter(Context context, String[] data) {
        this.data = data;
        this.context = context;
    }

//    private ViewGroup parent;
//    private ViewHolder holder;


    @NonNull
    @Override
    public recyclerAdapter.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.property_layout,viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@androidx.annotation.NonNull recyclerAdapter.ViewHolder viewHolder, @SuppressLint("RecyclerView") int i) {

        viewHolder.textView.setText(data[i]);
        viewHolder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicked on " +data[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return data.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(@androidx.annotation.NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textName);

        }
    }
}
