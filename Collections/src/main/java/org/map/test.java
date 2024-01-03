package org.map;

import java.util.*;

public class test {
    /*
        *.Map is a part of collection framework but not colleection InterFace Hirerchy.
     */
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        System.out.println(ans);

        //map doesnt maintains order of elements in which you have added elements.
        Map<Integer,String> map = new HashMap<>();

        //it maintains order(key ke according) of elements in which you have added elements.
        Map<Integer,String> map1 = new LinkedHashMap<>();

        //sort the element based upon key
        Map<Integer,String> map2 = new TreeMap<>();

        //key can not be duplicate
        //value can be duplicate
        map.put(5,"atul");
        map.put(10,"atul");
        map.put(5,"java"); // override the value at the 5
        map.put(18,"rahul");
        map.put(99,"ravi");
        map.put(9,"ravi");
        map.put(10,"RAJAT");

        System.out.println(map);

        //duplicate key not recomended.
        //value can be duplicate
        //cant maintain order,no sorting.
        map1.put(5,"atul");
        map1.put(10,"atul");
        map1.put(5,"java"); // override the value at the 5 key
        map1.put(18,"rahul");
        map1.put(99,"ravi");
        map1.put(9,"ravi");
        map1.put(10,"RAJAT");

        System.out.println(map1);

        //duplicate key not recomended.
        //value can be duplicate.
        //sorting.
        map2.put(5,"atul");
        map2.put(10,"atul");
        map2.put(5,"java"); // override the value at the 5 key
        map2.put(18,"rahul");
        map2.put(99,"ravi");
        map2.put(9,"ravi");
        map2.put(10,"RAJAT");

        System.out.println(map2);
        String i = map.get(5);

        System.out.println(map.get(5));//o(1) operation
        System.out.println(map1.get(5));//o(1) operation
        System.out.println(map2.get(5));//o(log n) operation


    }
}
