package com.codeclan.example.todolist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by johnny on 29/05/2017.
 */
public class TaskTest {
    @Test
    public void canGetTitle() {
        Task task = new Task("Create a badass project", true, "Notes");
        assertEquals("Create a badass project", task.getTitle());
    }

    @Test
    public void canGetStatus() {
        Task task = new Task("Create a badass project", true, "Notes");
        assertEquals(true, task.getStatus());
    }

    @Test
    public void canGetDescription() {
        Task task = new Task("Create a badass project", true, "Notes");
        assertEquals("Notes", task.getDescription());
    }

}