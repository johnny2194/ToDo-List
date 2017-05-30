package com.codeclan.example.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class TaskDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        Intent intent = getIntent();
        Task task = (Task) intent.getSerializableExtra("Task");


        TextView titleView = (TextView)  findViewById(R.id.title);
        titleView.setText(task.getTitle());

        CheckBox status = (CheckBox) findViewById(R.id.checkBox2);
        status.setChecked(task.getStatus());

        TextView descriptionView = (TextView)  findViewById(R.id.description);
        descriptionView.setText(task.getDescription());


    }


}
