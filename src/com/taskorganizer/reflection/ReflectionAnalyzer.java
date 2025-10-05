package com.taskorganizer.reflection;

import com.taskorganizer.model.Task;
import java.lang.reflect.Field;

public class ReflectionAnalyzer {

    public static void analyzeClass(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Fields in class " + clazz.getName() + ":");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    public static void main(String[] args) {
        analyzeClass(Task.class);
    }
}
