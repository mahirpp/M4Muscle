package marbala.com.m4muscle.InterConnector;

import android.support.annotation.StringRes;

import java.util.Arrays;

import io.reactivex.Observable;
import marbala.com.m4muscle.BaseClasses.BaseModel;
import marbala.com.m4muscle.BaseClasses.IBaseInterconnector;
import marbala.com.m4muscle.Model.WorkoutModel.WorkoutModel;
import marbala.com.m4muscle.R;

/**
 * Created by Mahir on 24/03/2018.
 */

public class WorkoutInterconnectorImpl implements IBaseInterconnector {


    @Override
    public void LoadDataModel(BaseModel model, LoadingIndicators indicators) {
        indicators.onStartLoading();
        indicators.onSuccess(Observable.fromArray(Arrays.asList(
                WorkoutModel.builder().icon(R.drawable.ic_workouts).Name("Chest").build(),
                WorkoutModel.builder().icon(R.drawable.ic_workouts).Name("Back").build(),
                WorkoutModel.builder().icon(R.drawable.ic_workouts).Name("Legs").build(),
                WorkoutModel.builder().icon(R.drawable.ic_workouts).Name("Biceps").build(),
                WorkoutModel.builder().icon(R.drawable.ic_workouts).Name("Triceps").build(),
                WorkoutModel.builder().icon(R.drawable.ic_workouts).Name("Shoulders").build(),
                WorkoutModel.builder().icon(R.drawable.ic_workouts).Name("Abs").build())));
    }

    @Override
    public void saveDataModel(Observable saveData) {

    }
}
