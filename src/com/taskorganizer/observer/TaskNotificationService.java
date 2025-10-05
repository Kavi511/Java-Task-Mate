package com.taskorganizer.observer;

import com.taskorganizer.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskNotificationService implements TaskObserver {
    private List<Task> taskList = new ArrayList<>();

    @Override
    public void update(Task task) {
        taskList.add(task);
        System.out.println("Task Updated: " + task);
    }
}

