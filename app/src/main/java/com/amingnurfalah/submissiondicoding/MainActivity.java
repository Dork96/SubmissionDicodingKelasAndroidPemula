package com.amingnurfalah.submissiondicoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private RecyclerView rvAnimal;
    private ArrayList<Animal>listAnimal;
    private ArrayList<Animal>list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimal = findViewById(R.id.rv_animal);
        rvAnimal.setHasFixedSize(true);
        list.addAll(HewanData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvAnimal.setLayoutManager(new LinearLayoutManager(this));
        ListHewanAdapter listHeroAdapter = new ListHewanAdapter(this);
       listHeroAdapter.setList(list);
        rvAnimal.setAdapter(listHeroAdapter);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rv_animal:
                Intent moveIntent = new Intent(MainActivity.this, FormDetail.class);
                startActivity(moveIntent);
                break;
        }
    }
    private ArrayList<Animal> getListAnimal(){
        return listAnimal;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent in = new Intent(getApplicationContext(),
                        About.class);
                startActivity(in);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    }
