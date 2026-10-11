package com.vishal.javareflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Student {
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study(){}

    private void sleep(){}

    public static void inspectClass(Class<?> clazz){

        System.out.println("Class Name: " + clazz.getSimpleName());
        System.out.println("Fields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields){
            System.out.println(f.getName());
        }
        System.out.println("Constructors: ");
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> c : constructors){
            Class<?>[] parametersClass = c.getParameterTypes();
            String[] params = new String[parametersClass.length];
            for (int i=0; i< parametersClass.length; i++){
                params[i] = parametersClass[i].getSimpleName();
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(clazz.getSimpleName() + "(");
            for (int j = 0; j< params.length; j++){
                if(j!=params.length-1){
                    stringBuffer.append(params[j]);
                    stringBuffer.append(",");
                }
                else if (j==params.length-1) {
                    stringBuffer.append(params[j]);
                }
            }
            stringBuffer.append(")");
            System.out.println(stringBuffer);
        }
        System.out.println("Methods: ");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods){
            if(!(m.getName().equals("main") || m.getName().equals("inspectClass"))){
                System.out.println(m.getName());
            }
        }
    }

    public static void main(String[] args) {
        inspectClass(Student.class);
    }

}
