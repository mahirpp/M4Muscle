package marbala.com.m4muscle.View.Workout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SearchView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import marbala.com.m4muscle.Adapters.WorkoutListAdapter;
import marbala.com.m4muscle.Presenter.Workout.WorkoutPresenter;
import marbala.com.m4muscle.Presenter.Workout.WorkoutPresenterImpl;
import marbala.com.m4muscle.R;

/**
 * Created by Mahir on 23/04/2016.
 */
public class WorkoutFragment extends Fragment implements IWorkout {
    private static final String TAG = "WorkoutFragment";
    @BindView(R.id.ll_progressLayout)
    LinearLayout ll_progressLayout;
    @BindView(R.id.rv_workout)
    RecyclerView rv_workout;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    private WorkoutPresenter presenter;
    WorkoutListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workout, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Workouts");
        ButterKnife.bind(this, view);

        rv_workout.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rv_workout.setHasFixedSize(true);
        presenter = new WorkoutPresenterImpl(this);

        return view;
    }

    @Override
    public void showProgress() {
        ll_progressLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        if (ll_progressLayout.isShown()) {
            ll_progressLayout.setVisibility(View.GONE);
        }
    }

    @Override
    public void showMessage(String message) {
        Snackbar.make(getView(), message, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void setAdapter(List workoutlist) {
        adapter = new WorkoutListAdapter(workoutlist);
        rv_workout.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
