package com.codeclan.example.todolist;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NewTaskActivity extends AppCompatActivity {

    private EditText titleInput;
    private EditText additionalNotesInput;
    private SharedPreferences prefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        titleInput = (EditText) findViewById(R.id.titleInput);
        additionalNotesInput = (EditText) findViewById(R.id.additionalNotesInput);

        String sharedPrefsKey = getString(R.string.pref_key);
        prefs = getSharedPreferences(sharedPrefsKey, Context.MODE_PRIVATE);


    }

    public void onButtonClick(View view){
        String title = titleInput.getText().toString();
        String additionalNotes = additionalNotesInput.getText().toString();

        Task newTask = new Task(title, false, additionalNotes);

        ArrayList<Task> allTasks = Prefs.getTasks(prefs);
        allTasks.add(newTask);

        Prefs.savePrefs(prefs, allTasks);

        Intent intent = new Intent(this, TaskListActivity.class);
        startActivity(intent);


    }
}
