package com.dsh.thingkinginjava.annotation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author dongshuhuan
 * date 2020-01-20
 * version
 */
public class TestableTest {

    @Test
    public void execute(){
        Testable testable = new Testable();
        //可以执行
        assert testable.execute().equals("Executing...");
        //测试失败
        //assert testable.execute().equals("Executing");
    }
}