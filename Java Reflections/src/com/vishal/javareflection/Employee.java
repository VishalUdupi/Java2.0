package com.vishal.javareflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Employee {

    private String salary = "50000";

}
class Test{
    public static void main(String[] args) {
        Employee employee = new Employee();

        Class<?> clazz = employee.getClass();
        try {
            Field field = clazz.getDeclaredField("salary");
            field.setAccessible(true);
            field.set(employee, "100000");
            System.out.println(field.get(employee));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}

