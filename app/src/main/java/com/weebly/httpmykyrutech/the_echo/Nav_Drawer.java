package com.weebly.httpmykyrutech.the_echo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public abstract class Nav_Drawer extends home
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.activity_home_nav_drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.activity_home_nav_drawer);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.activity_home_nav_drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_home_nav_drawer_drawer, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.Home) {
            Intent i = new Intent(this, home.class);
            startActivity(i);

        } else if (id == R.id.Locker_Room) {
            Intent i = new Intent(this, Locker_Room.class);
            startActivity(i);
            return true;

        } else if (id == R.id.calendar) {
            Intent i = new Intent(this, calendar.class);
            startActivity(i);
            return true;

        } else if (id == R.id.gossip) {
            Intent i = new Intent(this, gossip.class);
            startActivity(i);
            return true;

        } else if (id == R.id.birthday) {
            Intent i = new Intent(this, birthday.class);
            startActivity(i);
            return true;

        } else if (id == R.id.arts_and_entertainment) {
            Intent i = new Intent(this, arts_and_entertainment.class);
            startActivity(i);
            return true;

        } else if (id == R.id.content_current) {
            Intent i = new Intent(this, current_events.class);
            startActivity(i);
            return true;

        } else if (id == R.id.spotlight) {
            Intent i = new Intent(this, spotlight.class);
            startActivity(i);
            return true;

        } else if (id == R.id.KHS) {
            Intent i = new Intent(this, KHS_Exclusive.class);
            startActivity(i);
            return true;

        } else if (id == R.id.send) {
            return true;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.activity_home_nav_drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public abstract View onCreateView(LayoutInflater inflater, ViewGroup container);

    abstract void onDetach();
}
