package com.codeclan.example.todolist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by johnny on 29/05/2017.
 */
public class TaskListTest {

    @Test
    public void getListTest() {
        TaskList defaultList = new TaskList();
        assertEquals(3, defaultList.getList().size());
    }
}