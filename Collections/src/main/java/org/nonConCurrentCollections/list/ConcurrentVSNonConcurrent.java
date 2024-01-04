package org.nonConCurrentCollections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class ConcurrentVSNonConcurrent {



    public static Integer sumOfArray(List<Integer> list){
        System.out.println(list.hashCode());    //--same array list with reference is being passesd
        int sum = 0;
        for(int i = 0;i < list.size();i++){
            sum = sum + list.get(i);
            list.set(i,sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        // for nonConcurrent collection
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(20);
        arr.add(20);
        arr.add(20);
        arr.add(20);
        System.out.println(arr.hashCode());
//        int result = sumOfArray(arr);
//        System.out.println(result);
//        arr.forEach(x-> System.out.println("arry wavlue has been mutated"+x)); // the reason it should be taken care of wile working with threads

        int result1 = sumOfArray(new ArrayList<>(arr));// apply this logic when witing prmutation logic
        System.out.println(result1);
        arr.forEach(x-> System.out.println(x));


    }
}
