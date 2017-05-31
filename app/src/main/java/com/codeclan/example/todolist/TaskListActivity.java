package com.codeclan.example.todolist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TaskListActivity extends AppCompatActivity {

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_list);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(ResourcesCompat.getDrawable(getResources(), R.drawable.resize, null));
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        TaskList defaultList = new TaskList();


        String sharedPrefsKey = getString(R.string.pref_key);
        prefs = getSharedPreferences(sharedPrefsKey, Context.MODE_PRIVATE);

        ArrayList<Task> list = Prefs.getTasks(prefs);
        TaskListAdapter taskAdapter = new TaskListAdapter(this, list);


        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(taskAdapter);


    }

    public void getTask(View listItem) {
        Task task = (Task) listItem.getTag();
        Log.d("Task Title: ", task.getTitle());
        Intent intent = new Intent(this, TaskDetailActivity.class);
        intent.putExtra("Task", task);
        startActivity(intent);
    }

    public void setNewTask(View view) {
        Intent intent = new Intent(this, NewTaskActivity.class);
        startActivity(intent);
    }

}