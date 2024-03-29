package com.codeclan.example.todolist;

import java.io.Serializable;

/**
 * Created by johnny on 29/05/2017.
 */

public class Task implements Serializable{

    private String title;
    private Boolean status;
    private String description;

    public Task (String title, Boolean status, String description) {
        this.title = title;
        this.status = status;
        this.description = description;
    }

    public String getTitle() { return title; }

    public Boolean getStatus() {return status; }

    public String getDescription() { return description; }
}


