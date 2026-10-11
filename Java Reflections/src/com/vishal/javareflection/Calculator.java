package com.vishal.javareflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

}

class Utility{
    public static void main(String[] args) {

        Class<?> clazz = Calculator.class;
        try {
            Object object = clazz.getDeclaredConstructor().newInstance();
            Method method = clazz.getDeclaredMethod("add", int.class, int.class);
            System.out.println(method.invoke(object,10,20));
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
