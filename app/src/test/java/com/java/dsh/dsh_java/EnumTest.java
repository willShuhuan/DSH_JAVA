package com.java.dsh.dsh_java;

/**
 * @author dongshuhuan
 * date 2020-01-17
 * version
 */
public enum EnumTest  {
    APPLE{
        @Override String getInfo() {
            return "I'm 苹果";
        }
    },
    ORANGE{
        @Override String getInfo() {
            return "I'm 橘子";
        }
        //可以覆盖常量方法
        @Override void f() {
            System.out.println("Overridden method");
        }
    },
    BANANA{
        @Override String getInfo() {
            return "I'm 香蕉";
        }
    },
    OTHERS{
        @Override String getInfo() {
            return "I'm 其他水果";
        }
    };

    //可以定义抽象方法，且每个枚举值都要实现
    abstract String getInfo();

    void f(){
        System.out.println("default method");
    }

    //重写toString方法
    @Override public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0)+lower;
    }

    public static void main(String[] args) {
        for (EnumTest s :values()){
            System.out.println(s);
            System.out.println(s.getInfo());
            s.f();
        }
    }
}
