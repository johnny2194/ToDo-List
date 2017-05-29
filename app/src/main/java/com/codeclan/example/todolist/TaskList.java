package com.codeclan.example.todolist;

import java.util.ArrayList;

/**
 * Created by johnny on 29/05/2017.
 */

public class TaskList {


    private ArrayList<Task> list;

    public TaskList() {
            list = new ArrayList<Task>();
            list.add(new Task("Create a badass project", false, "Notes"));
            list.add(new Task("Take out the trash", false, "Make sure to take out on Tuesdays/Fridays"));
            list.add(new Task("Cook dinner for Bella", true, "Thai Yellow Curry"));

     }

    public ArrayList<Task> getList() {
            return new ArrayList<Task>(list);
        }

}
