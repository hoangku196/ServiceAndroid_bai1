package com.example.androidservice;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Intent myService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = new Bundle();

        bundle.putInt("StuId", 1);
        bundle.putString("StuName", "Hoàng");
        bundle.putString("Class", "PH09371");

        myService = new Intent(MainActivity.this, MyService.class);

        myService.putExtra("student", bundle);

    }

    public void startMyService(View view) {
        startService(myService);
    }

    public void stopMyService(View view) {
        stopService(myService);
    }

}
