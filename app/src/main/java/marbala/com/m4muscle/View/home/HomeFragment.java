package marbala.com.m4muscle.View.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.HashMap;

import marbala.com.m4muscle.R;
import marbala.com.m4muscle.View.GeneralRoutines.GeneralRoutinesFragment;
import marbala.com.m4muscle.View.GymTimer.GymTimerFragment;
import marbala.com.m4muscle.View.MyRoutines.MyRoutinesFragment;
import marbala.com.m4muscle.View.Nutrition.NutritionFragment;
import marbala.com.m4muscle.View.Workout.WorkoutFragment;

/**
 * Created by Mahir on 31/10/2015.
 */
public class HomeFragment extends Fragment {
    View view;
    LinearLayout ll_Workouts, ll_GeneralRoutines, ll_MyRoutines, ll_Timer, ll_Nutrition, ll_Help;
    HashMap<String, Integer> GridContents = new HashMap<String, Integer>();
    ArrayList<String> contentList = new ArrayList<String>();
    LayoutInflater inflater;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, null);
        this.inflater = inflater;
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("M4 Muscle");

        intialiseAll();
        clickListeners();


        return view;
    }

    private void intialiseAll() {
        ll_Workouts = (LinearLayout) view.findViewById(R.id.ll_Workouts);
        ll_GeneralRoutines = (LinearLayout) view.findViewById(R.id.ll_GeneralRoutines);
        ll_MyRoutines = (LinearLayout) view.findViewById(R.id.ll_MyRoutines);
        ll_Timer = (LinearLayout) view.findViewById(R.id.ll_Timer);
        ll_Nutrition = (LinearLayout) view.findViewById(R.id.ll_Nutrition);
        ll_Help = (LinearLayout) view.findViewById(R.id.ll_Help);
    }

    private void clickListeners() {
        ll_Workouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new WorkoutFragment()).addToBackStack("Home").commit();
            }
        });
        ll_GeneralRoutines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GeneralRoutinesFragment()).addToBackStack("Home").commit();
            }
        });
        ll_MyRoutines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MyRoutinesFragment()).addToBackStack("Home").commit();
            }
        });
        ll_Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GymTimerFragment()).addToBackStack("Home").commit();
            }
        });
        ll_Nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new NutritionFragment()).addToBackStack("Home").commit();
            }
        });
        ll_Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GymTimerFragment()).addToBackStack("Home").commit();
            }
        });
    }


}
