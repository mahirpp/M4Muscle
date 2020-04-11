package marbala.com.m4muscle.Presenter.Workout;

import java.util.List;
import java.util.Map;

import marbala.com.m4muscle.BaseClasses.IBasePresenter;
import marbala.com.m4muscle.Model.WorkoutModel.WorkoutModel;


/**
 * Created by Mahir on 18/03/2018.
 */

public abstract class WorkoutPresenter implements IBasePresenter {

    abstract void selectWorkout(WorkoutModel workout);

}
