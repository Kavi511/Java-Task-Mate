package com.taskorganizer.main;

import com.taskorganizer.model.Task;
import com.taskorganizer.model.TaskPriority;
import com.taskorganizer.model.TaskStatus;
import com.taskorganizer.service.TaskManager;

public class TaskOrganizerApplication {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add new tasks
        manager.addTask("Complete Homework", "Math homework", TaskPriority.HIGH);
        manager.addTask("Buy Groceries", "Get fruits and veggies", TaskPriority.MEDIUM);

        // Check if there are any tasks before accessing the list
        if (!manager.getTasks().isEmpty()) {
            Task task = manager.getTasks().get(0);
            // Update task status
            manager.updateTaskStatus(task, TaskStatus.IN_PROGRESS);
        }

        // View all tasks
        manager.getTasks().forEach(System.out::println);
    }
}
