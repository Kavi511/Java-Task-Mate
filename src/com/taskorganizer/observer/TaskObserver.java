package com.taskorganizer.observer;

import com.taskorganizer.model.Task;

public interface TaskObserver {
    void update(Task task);
}
