package com.osmanforhad.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* initial the recycler view **/
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

    }//end of the onCreate method

}//end of the class
