package marbala.com.m4muscle.View.MyRoutines;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import marbala.com.m4muscle.R;

/**
 * Created by Mahir on 23/04/2016.
 */
public class MyRoutinesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_routines,null);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("My Routines");
        return view;
    }
}
