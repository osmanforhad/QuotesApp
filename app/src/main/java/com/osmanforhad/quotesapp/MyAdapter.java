package com.osmanforhad.quotesapp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    /* variable declaration **/
    private String[] data;

    /* constructor method for main class **/
    public MyAdapter(String[] data) {
        this.data = data;
    }//end of the constructor method

    /* onCreateViewHolder method for creating view **/
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }//end of the onCreateViewHolder method

    /* onBindViewHolder method for Binding data with View **/
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }//end of the onBindViewHolder method

    @Override
    public int getItemCount() {
        return data.length;
    }//end of the getItemCount method

    /* Making Inner or sub Class for viewHolder **/
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }//end of the MyViewHolder constructor

    }//end of the MyViewHolder Inner or Sub Class

}//end of the class Main or Super Class
