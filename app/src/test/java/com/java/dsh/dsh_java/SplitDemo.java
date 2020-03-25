package com.java.dsh.dsh_java;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author dongshuhuan
 * date 2019-10-31
 * version
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));
    }
}
