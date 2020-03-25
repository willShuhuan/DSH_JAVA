package com.java.dsh.dsh_java;

import java.lang.reflect.Method;

/**
 * @author dongshuhuan
 * date 2020-01-17
 * version
 */
public class EnumTestClass {
    public static void main(String[] args) {
        for (EnumTest s : EnumTest.values()){
            System.out.println(s+"ordinal"+s.ordinal());
            System.out.println(s.compareTo(EnumTest.ORANGE)+"");
            System.out.println(s.equals(EnumTest.APPLE)+"");
            System.out.println(s==EnumTest.BANANA);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("---------------");
        }
        for (String s : "APPLE BANANA ORANGE".split(" ")){
            EnumTest enumTest = Enum.valueOf(EnumTest.class,s);
            System.out.println(enumTest);
        }
        EnumTestClass enumTestClass = new EnumTestClass();
        for (Method method : enumTestClass.getClass().getMethods()){
            System.out.println(method.getName());
        }

    }
}
