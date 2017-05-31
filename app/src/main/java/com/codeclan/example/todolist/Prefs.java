package com.codeclan.example.todolist;

import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * Created by johnny on 31/05/2017.
 */

public class Prefs {
    static Gson gson = new Gson();

    public static ArrayList<Task> getTasksFromJson(String json){
        TypeToken<ArrayList<Task>> taskArrayList = new TypeToken<ArrayList<Task>>(){};
        ArrayList<Task> myTasks = gson.fromJson(json, taskArrayList.getType());
        return myTasks;
    }

    public static String getAllTasksFromSharedPrefs(SharedPreferences prefs){
        String tasksJson = prefs.getString("myTasks", "[]");
        return tasksJson;
    }

    public static ArrayList<Task> getTasks(SharedPreferences prefs){
        return getTasksFromJson(getAllTasksFromSharedPrefs(prefs));
    }

    public static void savePrefs(SharedPreferences prefs, ArrayList<Task> tasks){
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("myTasks", gson.toJson(tasks));
        editor.apply();
    }
}
