package marbala.com.m4muscle.Model.WorkoutModel;

import java.util.List;
import java.util.Map;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Mahir on 18/03/2018.
 */

@Data
@Builder
public class WorkoutModel {
    private int icon;
    private String Name;
    private Map Game;
    private String Workout;

}
