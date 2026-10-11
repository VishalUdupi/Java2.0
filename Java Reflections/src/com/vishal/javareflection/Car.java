package com.vishal.javareflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Car {
    public Car() {
        System.out.println("Car Created");
    }
    

    public static void utility(){
        String className = "com.vishal.javareflection.Car";
        Class<?> clazz = null;

        {
            try {
                clazz = Class.forName(className);
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found");
            }
        }
        System.out.println(clazz.getSimpleName());

        try {
            Constructor<?> constructor = clazz.getConstructor();
            System.out.println(constructor.getParameterCount());
            Object object = constructor.newInstance();
            System.out.println(object.getClass().getSimpleName());
        } catch (NoSuchMethodException e) {
            System.out.println("No such constructor");
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        utility();
    }
}
