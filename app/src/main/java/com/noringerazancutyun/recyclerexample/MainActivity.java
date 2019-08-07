package com.noringerazancutyun.recyclerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyRecycler recycler;
    private List<Model> listItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        recyclerView =findViewById(R.id.my_recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        recycler = new MyRecycler(this, listItems);
        recyclerView.setAdapter(recycler);
    }
    private  void init(){
        listItems = new ArrayList<>();
        listItems.add(new Model("Armenia", R.drawable.armenia));
        listItems.add(new Model("Germany", R.drawable.germany));
        listItems.add(new Model("Russia", R.drawable.russia));
        listItems.add(new Model("England", R.drawable.england));
        listItems.add(new Model("Belgium", R.drawable.belgium));
        listItems.add(new Model("Holand", R.drawable.niderland));
    }
}
