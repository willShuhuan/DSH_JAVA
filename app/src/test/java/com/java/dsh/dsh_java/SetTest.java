package com.java.dsh.dsh_java;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author dongshuhuan
 * date 2020-01-14
 * version
 */
public class SetTest {
    public static void main(String[] args) {
        SortedSet<String> sortedset = new TreeSet<String>();
        Collections.addAll(sortedset,"one two three four five six seven eight".split(" "));
        System.out.println(sortedset);
        String low = sortedset.first();
        String high = sortedset.last();
        System.out.println(low);
        System.out.println(high);
        Iterator<String> it = sortedset.iterator();
        for (int i = 0; i <= 6; i++) {
            if (i==3) low = it.next();
            if (i==6) high = it.next();
            else it.next();
        }
        System.out.println(low);
        System.out.println(high);
        System.out.println(sortedset.subSet(low,high));
        System.out.println(sortedset.headSet(high));
        System.out.println(sortedset.tailSet(low));

    }
}



