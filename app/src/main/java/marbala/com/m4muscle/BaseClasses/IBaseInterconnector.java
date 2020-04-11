package marbala.com.m4muscle.BaseClasses;

import io.reactivex.Observable;

/**
 * Created by Mahir on 18/03/2018.
 */

public interface IBaseInterconnector {

    interface LoadingIndicators {

        void onStartLoading();

        void onSuccess(Observable result);

        void onFailed(String message);
    }

    void LoadDataModel(BaseModel model,LoadingIndicators indicators);
    void saveDataModel(Observable saveData);

}
