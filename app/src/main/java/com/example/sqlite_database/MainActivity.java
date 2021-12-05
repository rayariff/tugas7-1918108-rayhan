package com.example.sqlite_database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sqlite_database.MainCreate;
import com.example.sqlite_database.MainRead;
import com.example.sqlite_database.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void create(View view){
        Intent a = new
                Intent(MainActivity.this, MainCreate.class);
        startActivity(a);
    }
    public void read(View view){
        Intent b = new Intent(MainActivity.this, MainRead.class);
        startActivity(b);
    }
}