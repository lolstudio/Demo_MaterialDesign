package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {

//        System.out.println(String.format("old %1$s yeas %2$s", 12, 19));
//        System.out.println(sanmu());
//        testCollectionAddAll();
//        testCollectionCopy();
//        tsetNumberFormat();
//        System.out.println(getRandom(5,10));
        System.out.println(test());

    }

    public static int test()
    {
        try {
            return 0;
        }
        finally {
            System.out.println("finally trumps return.");
        }
    }

    /**
     * 返回指定的随机数
     * @param min 最小范围
     * @param max 最大返回
     * @return  返回值
     */
    private static int getRandom(int min,int max){
        return  min + (int)(Math.random() * (max-min+1));
    }

    private static void tsetNumberFormat() {
        String temp="12abc";
        int i=0;
        try {
            i=Integer.parseInt(temp);
        } catch (NumberFormatException e) {
        }
        System.out.println(i);
    }

    private static void testCollectionAddAll() {
        Integer[] array = {1,2,3};
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,array);
        System.out.println(list.size());
    }

    private static void testCollectionCopy() {
        List<String> srclst = new ArrayList<String>(5);
        List<String> destlst = new ArrayList<String>(10);

        // populate two lists
        srclst.add("Java");
        srclst.add("is");
        srclst.add("best");

        destlst.add("C++");
        destlst.add("is");
        destlst.add("older");


        // copy into dest list
        Collections.copy(destlst, srclst);

        System.out.println("Value of source list: "+srclst);
        System.out.println("Value of destination list: "+destlst);
    }

    public static int sanmu() {
        return 1 > 2 ? 10 : 11;
    }
}
