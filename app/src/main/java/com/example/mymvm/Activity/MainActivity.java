package com.example.mymvm.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.mymvm.Fragement.Discover_Fragement;
import com.example.mymvm.Fragement.Favorios_Fragement;
import com.example.mymvm.Fragement.Home_Fragement;
import com.example.mymvm.Fragement.Profile_Fragement;
import com.example.mymvm.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView navigationView;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView=findViewById(R.id.bottomnavigation);


        BottomNavigationView navigation = findViewById(R.id.bottomnavigation);
        navigation.setOnNavigationItemSelectedListener(this);
        loadFragment(new Discover_Fragement());


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_discover:
                fragment = new Discover_Fragement();
                break;

            case R.id.navigation_home:
                fragment = new Home_Fragement();
                break;

            case R.id.navigation_favorios:
                fragment = new Favorios_Fragement();
                break;

            case R.id.navigation_profile:
                fragment = new Profile_Fragement();
                break;
        }
        return loadFragment(fragment);

    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.dashboard_frame, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}