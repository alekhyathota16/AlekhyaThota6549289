package Reflection39;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Reflection39.Student");

        System.out.println("Methods in Student class:");

        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("Method Name: " + m.getName());

            Parameter[] params = m.getParameters();

            for (Parameter p : params) {
                System.out.println("Parameter: " + p.getType().getSimpleName());
            }

            System.out.println();
        }

        Object obj = cls.getDeclaredConstructor().newInstance();

        Method method = cls.getMethod("display");
        method.invoke(obj);
    }
}