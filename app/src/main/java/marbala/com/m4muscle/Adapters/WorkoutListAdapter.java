package marbala.com.m4muscle.Adapters;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import marbala.com.m4muscle.Model.WorkoutModel.WorkoutModel;
import marbala.com.m4muscle.R;

/**
 * Created by Mahir on 24/03/2018.
 */

public class WorkoutListAdapter extends RecyclerView.Adapter<WorkoutListAdapter.WorkoutListHolder> {
    List workoutList;

    public WorkoutListAdapter(List workoutList) {
        this.workoutList = workoutList;
    }

    @Override
    public WorkoutListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new WorkoutListHolder(parent);
    }

    @Override
    public void onBindViewHolder(WorkoutListHolder holder, int position) {
        WorkoutModel obj = (WorkoutModel) workoutList.get(position);
        holder.setIcon(obj.getIcon());
        holder.setName(obj.getName());

    }

    @Override
    public int getItemCount() {
        return workoutList.size();
    }


    public class WorkoutListHolder extends RecyclerView.ViewHolder {
        String name;
        int icon;

        public WorkoutListHolder(View itemView) {
            super(itemView);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIcon() {
            return icon;
        }

        public void setIcon(int icon) {
            this.icon = icon;
        }
    }
}
