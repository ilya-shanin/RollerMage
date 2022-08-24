package com.shanin.rollermage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavController navController;
    private NavigationView navigationView;
    private Fragment navHostFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupNavigation();
    }

    public void setupNavigation() {
        toolbar = findViewById(R.id.topAppBar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.sidebar_nav_view);
        navController = getNavController();

        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout);
        NavigationUI.setupWithNavController(navigationView, navController);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(Navigation.findNavController(this, R.id.nav_host_fragment), drawerLayout);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        menuItem.setChecked(true);
        drawerLayout.closeDrawers();

        int id = menuItem.getItemId();

        if(id == R.id.sidebar_main) {
            navController.navigate(R.id.sidebar_main);
        } else if (id == R.id.sidebar_settings) {
            navController.navigate(R.id.sidebar_settings);
        } else if (id == R.id.sidebar_profile) {
                navController.navigate(R.id.sidebar_profile);
        } else if (id == R.id.sidebar_upgrade) {
            navController.navigate(R.id.sidebar_upgrade);
        } else if (id == R.id.sidebar_report) {
            navController.navigate(R.id.sidebar_report);
        } else {
            navController.navigate(R.id.sidebar_main);
        }
        return true;
    }

    @NonNull
    private NavController getNavController() {
        navHostFragment = getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        if (!(navHostFragment instanceof NavHostFragment)) {
            throw new IllegalStateException("Activity" + this + "doesn't have a NavHostFragment");
        }
        return ((NavHostFragment) navHostFragment).getNavController();
    }
}