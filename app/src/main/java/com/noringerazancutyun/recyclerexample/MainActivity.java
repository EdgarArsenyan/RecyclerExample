package com.noringerazancutyun.recyclerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyRecycler adapter;
    private List<String> listItems = new ArrayList<>();
    private List<String> list = new ArrayList<>();
    private ImageView addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findMe();
        init();
        clickFloat();
        deleteListener();
    }

    public void findMe(){

        addButton = findViewById(R.id.floatingActionButton);
        recyclerView =findViewById(R.id.my_recycler);
        adapter = new MyRecycler(MainActivity.this, list);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }

    private  void init(){
        listItems.add("Armenia");
        listItems.add("Germany");
        listItems.add("Japan");
        listItems.add("Russia");
        listItems.add("China");
        listItems.add("England");
        listItems.add("USA");
        listItems.add("Canada");
        listItems.add("Nigeria");
        listItems.add("Egipt");
    }

    public void clickFloat(){

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int count =random.nextInt(10);
                if(count ==0){
                    list.add((listItems.get(count)));
                }else{
                    list.add((listItems.get(count-1)));
                }
                recyclerView.setAdapter(adapter);
            }
        });
    }

    public void removeItem(int position) {

        list.remove(position);
        adapter.notifyItemRemoved(position);
    }

    public void deleteListener() {

        adapter.setOnItemClickListener(new MyRecycler.OnItemClickListener() {
            @Override
            public void onDeleteClick(int position) {
                removeItem(position);
            }
        });
    }
}
