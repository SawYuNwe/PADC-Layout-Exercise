package com.examplelayout.sawyunwe297.padclayout.activities;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.examplelayout.sawyunwe297.padclayout.R;
import com.examplelayout.sawyunwe297.padclayout.fragments.LinkedInFragment;
import com.examplelayout.sawyunwe297.padclayout.fragments.BookFragment;
import com.examplelayout.sawyunwe297.padclayout.fragments.PulseFragment;
import com.examplelayout.sawyunwe297.padclayout.fragments.MovieFragment;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }





        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        Menu menuItem = navigationView.getMenu();

        navigationView.setNavigationItemSelectedListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        if (savedInstanceState == null) {

            LinkedInFragment fragment = new LinkedInFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
        }

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.action_settings:
                return true;

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(final MenuItem item) {
        item.setChecked(true);
        drawerLayout.closeDrawers();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (item.getItemId()) {
                    case R.id.left_menu_movie:
                        navigateToMovie();
                        break;
                    case R.id.left_menu_book:
                        navigateToBook();
                        break;
                    case R.id.left_menu_pulse:
                        navigateToPulse();
                        break;
                    case R.id.left_menu_linkedin:
                        navigateToLinkedIn();
                        break;



                }
            }
        }, 100);

        return true;
    }

    private void navigateToMovie() {
        MovieFragment fragment = new MovieFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
    }

    private void navigateToBook() {
        BookFragment fragment = new BookFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
    }
    private void navigateToLinkedIn() {
        LinkedInFragment fragment = new LinkedInFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
    }
    private void navigateToPulse() {
        PulseFragment fragment = new PulseFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
    }



    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
