package com.taskorganizer.model;

public class Task {
    private String name;
    private String description;
    private TaskPriority priority;
    private TaskStatus status;

    // Constructor
    public Task(String name, String description, TaskPriority priority, TaskStatus status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "Task{name='" + name + "', description='" + description + "', priority=" + priority + ", status=" + status + '}';
    }
}


