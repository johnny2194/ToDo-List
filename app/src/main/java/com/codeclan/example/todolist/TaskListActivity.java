package com.codeclan.example.todolist;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TaskListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_list);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(ResourcesCompat.getDrawable(getResources(), R.drawable.resize, null));
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        TaskList defaultList = new TaskList();
        ArrayList<Task> list = defaultList.getList();

        TaskListAdapter taskAdapter = new TaskListAdapter(this, list);


        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(taskAdapter);
    }
}