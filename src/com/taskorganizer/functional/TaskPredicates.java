package com.taskorganizer.functional;

import com.taskorganizer.model.Task;
import com.taskorganizer.model.TaskPriority;
import com.taskorganizer.model.TaskStatus;

import java.util.List;
import java.util.function.Predicate;

public class TaskPredicates {

    // Predicate to check if a task is completed
    public static Predicate<Task> isCompleted() {
        return task -> task.getStatus() == TaskStatus.COMPLETED;
    }

    // Predicate to check if a task is in progress
    public static Predicate<Task> isInProgress() {
        return task -> task.getStatus() == TaskStatus.IN_PROGRESS;
    }

    // Method to filter tasks based on the given condition
    public static void filterTasks(List<Task> tasks, Predicate<Task> condition) {
        tasks.stream()
                .filter(condition)
                .forEach(task -> System.out.println(task));  // Prints each task that matches the condition
    }

    public static void main(String[] args) {
        // Create some sample tasks
        List<Task> tasks = List.of(
                new Task("Complete Homework", "Math homework", TaskPriority.HIGH, TaskStatus.IN_PROGRESS),
                new Task("Buy Groceries", "Get fruits and veggies", TaskPriority.MEDIUM, TaskStatus.TO_DO),
                new Task("Read a Book", "Chapter 1", TaskPriority.LOW, TaskStatus.COMPLETED)
        );

        // Print completed tasks
        System.out.println("Completed tasks:");
        filterTasks(tasks, isCompleted());

        // Print in-progress tasks
        System.out.println("\nIn-progress tasks:");
        filterTasks(tasks, isInProgress());
    }
}


