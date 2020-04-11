package marbala.com.m4muscle.BaseClasses;

import io.reactivex.Observable;

/**
 * Created by Mahir on 24/03/2018.
 */

public interface IBasePresenter {
    void loadData(BaseModel obj, IBaseInterconnector.LoadingIndicators loadingIndicators);

    void SaveData(BaseModel saveData);
}
