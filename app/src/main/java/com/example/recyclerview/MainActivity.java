package com.example.recyclerview;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<item> items = new ArrayList<item>();
        items.add(new item("помидор" , "100р" ,R.drawable.pomi));
        items.add(new item("колбаса" , "150р" ,R.drawable.sosage));
        items.add(new item("сметана" , "120р" ,R.drawable.soacream));
        items.add(new item("огурец" , "10р" ,R.drawable.ogur));
        items.add(new item("масло" , "130р" ,R.drawable.oil));
        items.add(new item("молоко" , "100р" ,R.drawable.milc));
        items.add(new item("творог" , "80р" ,R.drawable.cotage_cheese));
        items.add(new item("сыр" , "90р" ,R.drawable.cheese));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new myAdapter(getApplicationContext(),items));

    }
}