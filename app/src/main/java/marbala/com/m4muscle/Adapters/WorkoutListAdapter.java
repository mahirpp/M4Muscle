package marbala.com.m4muscle.Adapters;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import marbala.com.m4muscle.Model.WorkoutModel.WorkoutModel;
import marbala.com.m4muscle.R;

/**
 * Created by Mahir on 24/03/2018.
 */

public class WorkoutListAdapter extends RecyclerView.Adapter<WorkoutListAdapter.WorkoutListHolder> {
    List<WorkoutModel> workoutList;

    public WorkoutListAdapter(List<WorkoutModel> workoutList) {
        this.workoutList = workoutList;
    }

    @Override
    public WorkoutListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_workout, parent, false);
        return new WorkoutListHolder(view);
    }

    @Override
    public void onBindViewHolder(WorkoutListHolder holder, int position) {
        WorkoutModel obj = (WorkoutModel) workoutList.get(position);
        holder.workoutIcon.setImageResource(obj.getIcon());
        holder.workoutName.setText(obj.getName());

    }

    @Override
    public int getItemCount() {
        return workoutList.size();
    }


    public class WorkoutListHolder extends RecyclerView.ViewHolder {
        ImageView workoutIcon ;
        TextView workoutName;

        public WorkoutListHolder(View itemView) {
            super(itemView);
            workoutIcon= (ImageView) itemView.findViewById(R.id.workoutIcon);
            workoutName = (TextView) itemView.findViewById(R.id.workoutName);

        }

    }
}
