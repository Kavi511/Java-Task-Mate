package com.taskorganizer.service;

import com.taskorganizer.model.Task;
import com.taskorganizer.model.TaskPriority;
import com.taskorganizer.model.TaskStatus;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    // Method to add a task to the list
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to delete a task from the list
    public void deleteTask(Task task) {
        tasks.remove(task);
    }

    // Method to retrieve all tasks (return a copy of the list to prevent direct modification)
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    // Method to create sample tasks
    public List<Task> createSampleTasks() {
        Task task1 = new Task("Complete Homework", "Math homework", TaskPriority.HIGH, TaskStatus.IN_PROGRESS);
        Task task2 = new Task("Buy Groceries", "Get fruits and veggies", TaskPriority.MEDIUM, TaskStatus.TO_DO);

        List<Task> sampleTasks = new ArrayList<>();
        sampleTasks.add(task1);
        sampleTasks.add(task2);

        return sampleTasks;
    }

    // Main method to demonstrate the usage of TaskService
    public static void main(String[] args) {
        TaskService taskService = new TaskService();

        // Create sample tasks
        List<Task> sampleTasks = taskService.createSampleTasks();

        // Add tasks to the service
        sampleTasks.forEach(taskService::addTask);

        // Retrieve and print all tasks
        List<Task> allTasks = taskService.getAllTasks();
        System.out.println("All tasks:");
        allTasks.forEach(System.out::println);

        // Deleting a task
        taskService.deleteTask(sampleTasks.get(0)); // Deleting the first task (Complete Homework)

        // Retrieve and print all tasks after deletion
        allTasks = taskService.getAllTasks();
        System.out.println("\nTasks after deleting one task:");
        allTasks.forEach(System.out::println);
    }
}
