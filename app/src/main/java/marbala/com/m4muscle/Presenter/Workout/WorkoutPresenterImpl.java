package marbala.com.m4muscle.Presenter.Workout;

import android.os.Handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import marbala.com.m4muscle.BaseClasses.BaseModel;
import marbala.com.m4muscle.BaseClasses.IBaseInterconnector;
import marbala.com.m4muscle.InterConnector.WorkoutInterconnectorImpl;
import marbala.com.m4muscle.Model.WorkoutModel.WorkoutModel;
import marbala.com.m4muscle.View.Workout.IWorkout;

/**
 * Created by Mahir on 18/03/2018.
 */

public class WorkoutPresenterImpl extends WorkoutPresenter implements IBaseInterconnector.LoadingIndicators {
    IWorkout view;
    WorkoutInterconnectorImpl interconnector;


    public WorkoutPresenterImpl(IWorkout view) {
        this.view = view;
        this.interconnector = new WorkoutInterconnectorImpl();
        loadData(new BaseModel(WorkoutModel.class, "workout", false), this);
    }

    @Override
    public void loadData(BaseModel obj, IBaseInterconnector.LoadingIndicators loadingIndicators) {
        interconnector.LoadDataModel(obj, loadingIndicators);
    }

    @Override
    public void SaveData(BaseModel saveData) {

    }

    @Override
    void selectWorkout(WorkoutModel workout) {

    }

    @Override
    public void onStartLoading() {
        view.showProgress();
    }

    @Override
    public void onSuccess(Observable result) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                result.subscribe(list -> view.setAdapter((List) list));
                view.hideProgress();

            }
        },5000);

    }

    @Override
    public void onFailed(String message) {
        view.hideProgress();
        view.showMessage(message);
    }
}
