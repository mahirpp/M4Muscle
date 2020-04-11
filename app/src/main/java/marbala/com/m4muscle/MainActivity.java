package marbala.com.m4muscle;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import marbala.com.m4muscle.View.GeneralRoutines.GeneralRoutinesFragment;
import marbala.com.m4muscle.View.GymTimer.GymTimerFragment;
import marbala.com.m4muscle.View.home.HomeFragment;
import marbala.com.m4muscle.View.MyRoutines.MyRoutinesFragment;
import marbala.com.m4muscle.View.Nutrition.NutritionFragment;
import marbala.com.m4muscle.View.Support.SupportFragment;
import marbala.com.m4muscle.View.Workout.WorkoutFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    NavigationView navigationViewRight;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawer;

    RelativeLayout rl_workout;
    RelativeLayout rl_routines;
    RelativeLayout rl_my_routines;
    RelativeLayout rl_gymTimer;
    RelativeLayout rl_nutrition;
    RelativeLayout rl_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationSelected();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
    }

    private void navigationSelected() {
        rl_workout = (RelativeLayout) findViewById(R.id.rl_workout);
        rl_routines = (RelativeLayout) findViewById(R.id.rl_routines);
        rl_my_routines = (RelativeLayout) findViewById(R.id.rl_my_routines);
        rl_gymTimer = (RelativeLayout) findViewById(R.id.rl_gymTimer);
        rl_nutrition = (RelativeLayout) findViewById(R.id.rl_nutrition);
        rl_help = (RelativeLayout) findViewById(R.id.rl_help);

        TextView tv_workout = (TextView) findViewById(R.id.tv_workout);
        TextView tv_routine = (TextView) findViewById(R.id.tv_routine);
        TextView tv_my_routine = (TextView) findViewById(R.id.tv_my_routine);
        TextView tv_gymtimer = (TextView) findViewById(R.id.tv_gymtimer);
        TextView tv_nutrition = (TextView) findViewById(R.id.tv_nutrition);
        TextView tv_help = (TextView) findViewById(R.id.tv_help);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Condensed.ttf");
        tv_workout.setTypeface(tf);
        tv_routine.setTypeface(tf);
        tv_my_routine.setTypeface(tf);
        tv_gymtimer.setTypeface(tf);
        tv_nutrition.setTypeface(tf);
        tv_help.setTypeface(tf);

        setClickListeners();

    }

    private void setClickListeners() {

        rl_workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.closeDrawer(Gravity.LEFT);
                getSupportFragmentManager().beginTransaction().addToBackStack("WorkoutFragment").replace(R.id.fragment_container, new WorkoutFragment()).commit();
            }
        });
        rl_routines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.closeDrawer(Gravity.LEFT);
                getSupportFragmentManager().beginTransaction().addToBackStack("GeneralRoutinesFragment").replace(R.id.fragment_container, new GeneralRoutinesFragment()).commit();
            }
        });
        rl_my_routines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.closeDrawer(Gravity.LEFT);
                getSupportFragmentManager().beginTransaction().addToBackStack("MyRoutinesFragment").replace(R.id.fragment_container, new MyRoutinesFragment()).commit();
            }
        });
        rl_gymTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.closeDrawer(Gravity.LEFT);
                getSupportFragmentManager().beginTransaction().addToBackStack("GymTimerFragment").replace(R.id.fragment_container, new GymTimerFragment()).commit();
            }
        });
        rl_nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.closeDrawer(Gravity.LEFT);
                getSupportFragmentManager().beginTransaction().addToBackStack("NutritionFragment").replace(R.id.fragment_container, new NutritionFragment()).commit();
            }
        });
        rl_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.closeDrawer(Gravity.LEFT);
                getSupportFragmentManager().beginTransaction().addToBackStack("SupportFragment").replace(R.id.fragment_container, new SupportFragment()).commit();
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(navigationView)) {
            drawer.closeDrawer(navigationView);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if (toggle.onOptionsItemSelected(item)) {
            if (drawer.isDrawerVisible(navigationView) != false) {
                System.out.println("left navigation");
                drawer.closeDrawer(navigationView);
            } else if (drawer.isDrawerVisible(navigationViewRight) != false) {
                System.out.println("right navigation");
                drawer.closeDrawer(navigationViewRight);
            }
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        System.out.println("selected navigation drawer is :" + id);
        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
