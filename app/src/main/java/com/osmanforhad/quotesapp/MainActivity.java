package com.osmanforhad.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* initial the string file
         * where i was write my Quotes **/
        String[] allQuotes = getResources().getStringArray(R.array.popularQuote);

        /* initial the recycler view **/
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        /* setup LayoutManager **/
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        /* setup Adapter which i was create
        * name as
        * MyAdapter**/
        recyclerView.setAdapter(new MyAdapter(allQuotes));

    }//end of the onCreate method

}//end of the class
