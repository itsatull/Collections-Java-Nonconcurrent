package org.nonConCurrentCollections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetvsListDifference {
    /*
    List        vs          Set
    -----------------------------------------------------
    indexed                  not Indexed
    ordered                  not ordered but in some case like LinkedHashSet ordered
    duplicate allowed        doesn't allow duplicate.
     */
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); //not oedered and not sorted
        set.add("a");
        set.add("ab");
        set.add("abc");
        set.add("abcd");
        set.add("abcde");
        set.add("abcdef");
        System.out.println(set);
        System.out.println(getSortedSet());
        System.out.println(getSortedSet().hashCode());
        System.out.println(getSortedSet().hashCode());
        SetvsListDifference obj = new SetvsListDifference();
        System.out.println(obj.getSortedSet1());


        //Set<Integer> set1 = Set.of(1,2,3,4,5,1); // this will throw an exception run time

    }
    public static SortedSet<Integer> getSortedSet(){
        SortedSet<Integer> treeSet = new TreeSet<>(); // tree set also extends Sorted set Interface.
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        return treeSet;

    }
    public SortedSet<Integer> getSortedSet1(){
        SortedSet<Integer> treeSet = new TreeSet<>(); // tree set also extends Sorted set Interface.
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        return treeSet;
    }
}
