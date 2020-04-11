package marbala.com.m4muscle.InterConnector;

import android.support.annotation.StringRes;

import java.util.Arrays;

import io.reactivex.Observable;
import marbala.com.m4muscle.BaseClasses.BaseModel;
import marbala.com.m4muscle.BaseClasses.IBaseInterconnector;
import marbala.com.m4muscle.R;

/**
 * Created by Mahir on 24/03/2018.
 */

public class WorkoutInterconnectorImpl implements IBaseInterconnector {


    @Override
    public void LoadDataModel(BaseModel model, LoadingIndicators indicators) {
        indicators.onStartLoading();
        indicators.onSuccess(Observable.fromArray(Arrays.asList("Chest","Back","Legs","Biceps","Triceps","Shoulders","Abs")));
    }

    @Override
    public void saveDataModel(Observable saveData) {

    }
}
