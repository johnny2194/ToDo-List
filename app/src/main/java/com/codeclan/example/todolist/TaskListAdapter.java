package com.codeclan.example.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by johnny on 29/05/2017.
 */

class TaskListAdapter extends ArrayAdapter<Task> {
    public TaskListAdapter(Context context, ArrayList<Task> tasks) {
        super(context, 0, tasks);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.task_item, parent, false);
        }

        Task currentTask = getItem(position);


        CheckBox status = (CheckBox) listItemView.findViewById(R.id.checkBox);
        status.setChecked(currentTask.getStatus());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentTask.getTitle());


        listItemView.setTag(currentTask);

        return listItemView;
    }
}
