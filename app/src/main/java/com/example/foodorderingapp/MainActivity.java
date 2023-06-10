package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;


import com.example.foodorderingapp.Adapters.MainAdapter;
import com.example.foodorderingapp.Modelss.MainModel;
import com.example.foodorderingapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.larbur , "Double Burger" , "5" , "Extra Double Cheezee with double patty"));
        list.add(new MainModel(R.drawable.hotdg , "Hot Dogs Chilli" , "10" , "Extra Double Cheezee with double patty"));
        list.add(new MainModel(R.drawable.dlbr , "Beef Burger" , "15" , "Extra Double Cheezee with double patty"));
        list.add(new MainModel(R.drawable.hotdg , "Special Pizza" , "25" , "Extra Double Cheezee with double patty"));
        list.add(new MainModel(R.drawable.larbur , "Zinger Pizza" , "35" , "Extra Double Cheezee with double patty"));

        MainAdapter adapter = new MainAdapter(list , this);
        binding.recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager =  new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);

    }
}