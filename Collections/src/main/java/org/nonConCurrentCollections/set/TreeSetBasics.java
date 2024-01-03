package org.nonConCurrentCollections.set;

import java.util.*;

public class TreeSetBasics {
    /*
        *TreeSet is represented by Red-Black tree.
        *TreeSet id not a thread-safe
        *Treeset use default natual odering. // for literal values
     */

    public static void main(String[] args) {

        Set<Person> treeSet = new TreeSet<>(); // uses red black tree logic for implementaation
//        treeSet.add(10); // int float string are literal values though taken as objects so natural odering is threre
//        treeSet.add(6);
//        treeSet.add(999);
//        treeSet.add(22);
//        System.out.println(treeSet);

        treeSet.add(new Person("Atul",22)); // you will get class cast exception.
        treeSet.add(new Person("Vijay",23));
        treeSet.add(new Person("Rahul",24));
        treeSet.add(new Person("Ravi",25));
        treeSet.add(new Person("Ravindra",26));
        System.out.println(treeSet);
    }

}
