package com.codeclan.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TaskListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_list);

        TaskList defaultList = new TaskList();
        ArrayList<Task> list = defaultList.getList();

        TaskListAdapter taskAdapter = new TaskListAdapter(this, list);


    ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(taskAdapter);
    }
}