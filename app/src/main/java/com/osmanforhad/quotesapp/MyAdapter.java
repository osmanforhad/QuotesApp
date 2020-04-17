package com.osmanforhad.quotesapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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
        /* create view **/
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row, parent, false);
        return new MyViewHolder(view);
    }//end of the onCreateViewHolder method

    /* onBindViewHolder method for Binding data with View **/
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        /* for geting position **/
        final String mydata = data[position];
        holder.textView.setText(mydata);

        /* implementing the share button **/
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, mydata);
                intent.setType("text/plain");
                intent = Intent.createChooser(intent,"share by");
                /* for starting the activity **/
                holder.itemView.getContext().startActivity(intent);

            }//end of the onClick method

        });//end of the setOnClickListener method

    }//end of the onBindViewHolder method

    @Override
    public int getItemCount() {
        return data.length;
    }//end of the getItemCount method

    /* Making Inner or sub Class for viewHolder **/
    public class MyViewHolder extends RecyclerView.ViewHolder {

        /* variable declaration **/
        TextView textView;
        Button button;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            /* Initial the view id from row.xml UI **/
            textView = itemView.findViewById(R.id.txt);
            button = itemView.findViewById(R.id.share_btn);

        }//end of the MyViewHolder constructor

    }//end of the MyViewHolder Inner or Sub Class

}//end of the class Main or Super Class
