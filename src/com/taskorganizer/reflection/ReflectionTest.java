package com.taskorganizer.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) {
        try {
            // Use reflection to get the Class object for the String class
            Class<?> clazz = String.class;

            // Display the name of the class
            System.out.println("Class Name: " + clazz.getName());

            // Fetch and print all declared fields of the String class
            Field[] classFields = clazz.getDeclaredFields();
            System.out.println("\nFields in String Class:");
            for (Field field : classFields) {
                System.out.println(" - " + field.getName() + " : " + field.getType());
            }

            // Fetch and print all declared methods of the String class
            Method[] classMethods = clazz.getDeclaredMethods();
            System.out.println("\nMethods in String Class:");
            for (Method method : classMethods) {
                System.out.println(" - " + method.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
