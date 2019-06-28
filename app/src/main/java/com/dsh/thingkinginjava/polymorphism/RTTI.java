package com.dsh.thingkinginjava.polymorphism;

/**
 * @author dongshuhuan
 * date 2019/6/24
 * version
 * RTTI 运行时类型识别缩写
 */
public class RTTI {

    public static void main(String[] args){
        Useful[] u = {new Useful(),new MoreUseful()};
        u[0].f();
        u[1].g();
        Useful uu = new MoreUseful();
        //((MoreUseful) uu).x();//父类对象转成子类对象 向下转型
        //MoreUseful mu = (MoreUseful) new Useful();//不能用子类创造父类，因为父类并不具备子类的一些拓展方法
        //这有点像父类可以造出子孙类，但是子孙类不能创造父类的道理

        System.out.println(u[0].filed);
        System.out.println(u[1].filed);//域访问不能多态，所以打印出来的不是MoreUseful
        ((MoreUseful)u[1]).x();//向下转型，可以调用导出类方法x();
        //((MoreUseful)u[0]).x();//无法向下转型，抛出ClassCastException编译时出错信息
    }
}
