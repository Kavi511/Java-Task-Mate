package com.taskorganizer.service;

import com.taskorganizer.model.Task;
import com.taskorganizer.model.TaskPriority;
import com.taskorganizer.model.TaskStatus;
import com.taskorganizer.observer.TaskNotificationService;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList = new ArrayList<>();
    private TaskNotificationService notificationService = new TaskNotificationService();

    // Add task
    public void addTask(String name, String description, TaskPriority priority) {
        Task task = new Task(name, description, priority, TaskStatus.TO_DO);
        taskList.add(task);
        notificationService.update(task);
    }

    // Update task status
    public void updateTaskStatus(Task task, TaskStatus status) {
        task.setStatus(status);
        notificationService.update(task);
    }

    // View tasks
    public List<Task> getTasks() {
        return taskList;
    }
}
