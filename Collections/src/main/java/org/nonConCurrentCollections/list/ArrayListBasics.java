package org.nonConCurrentCollections.list;

import java.util.*;

public class ArrayListBasics {
    /*
      1).null insertion is allowed you can insert null value in ArrayList.
      2).ArrayList is having default capacity --- 10. note :- if you have idea that you have to store specific amount of value try to set this for optimization.
      3).Enlarge the default capacity automatically by adding the value.
          (ArrayList create a new array with another value of the length)
      4).Not good for frequent changes like remove,add at specific index // cost of shifting is O(n)
      5).for searching is good -- you can get element at any index in O(n) time.
      6).ArrayList use behind array.
      7).it's not a synchronised(not thread safe)
      8).Random access is possible based on the index(it's implemnted RandomAccess interface).
      9).it can store Heterogeneous values in nin-generic Arraylist
      10).it's implementes Clonable & serializable interface
     */
    public static void main(String[] args) {

        //Initialization
        List<String> list = Arrays.asList("AAA", "BBB", "CCC", "D");

        Collection list3 = new ArrayList();  // can store anything in it

        Collection<String> list2 = Arrays.asList("AAA", "BBB", "CCC", "D");

        //might be supported in JDK 13
        //ArrayList<String> list3 = Arrays.asList("AAA","BBB","CCC","D"); -->because default d=return type is list

        //Empty array list -- Default capacity is 10
        ArrayList<Integer> lis = new ArrayList<>();
        List<Long> timeTankentoInsert = new LinkedList<>();
        long start;
        long finish;
        for (int i = 0; i < 1000; i++) {
            start = System.nanoTime();
            lis.add(i);
            finish = System.nanoTime();
            long timeElapsed = finish - start;
            timeTankentoInsert .add(timeElapsed);
        }
        System.out.println(lis);
        System.out.println(timeTankentoInsert);
        System.out.println(lis.set(0, 99));
        lis.

        // to iterate a list
//        for (Integer i :arr){
//            System.out.println(i);
//        }

//        Iterator<Integer> iterator = lis.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next()); //fetch + move to next index
//        }
//        lis.forEach(x-> System.out.println(x));
//        lis.forEach(System.out::println);



    }
}
