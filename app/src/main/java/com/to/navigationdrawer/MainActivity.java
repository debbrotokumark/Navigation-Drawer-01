package com.to.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerlayout;
    MaterialToolbar materialToolbar;
    FrameLayout frameLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerlayout = findViewById(R.id.drawerlayout);
        materialToolbar = findViewById(R.id.toolbar);
        frameLayout = findViewById(R.id.Framlayout);
        navigationView = findViewById(R.id.navigationview);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                MainActivity.this, drawerlayout, materialToolbar, R.string.close, R.string.open);
        drawerlayout.addDrawerListener(toggle);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                    if(item.getItemId()==R.id.mHome){
                        Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                        drawerlayout.closeDrawer(GravityCompat.START);
                        }
                else if(item.getItemId()==R.id.mShare){
                        Toast.makeText(MainActivity.this, "Facebook", Toast.LENGTH_SHORT).show();
                        drawerlayout.closeDrawer(GravityCompat.START);
                }



                return true;
            }
        });

    }
}