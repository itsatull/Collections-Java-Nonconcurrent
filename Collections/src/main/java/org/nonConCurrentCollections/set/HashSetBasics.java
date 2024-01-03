package org.nonConCurrentCollections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetBasics {
    /*
    1. Duplicates are not allowed.
    2. Implementd using HashTable
     */
    public static void main(String[] args) {

        Set set= new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();//preferred--not ordered and not shorted
        set1.add(10); // O(1) -- operations
        set1.add(20);
        set1.add(5);
        set1.add(1);
        set1.add(1);
        System.out.println(set1);

        System.out.println(set1.contains(10));
        System.out.println(set1.contains(10000)); // O(1) -- operation

        set1.forEach(x -> System.out.println(x));
        set1.remove(1); // O(1) -- operation
        System.out.println(set1);

        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        LinkedHashSet linkedHashSet = new LinkedHashSet<>(); // implemented using LinkedList and HashTable -- Slower thank hashSet
        linkedHashSet.add(12);
        linkedHashSet.add("Awdawd");
        linkedHashSet.add(13.00);
        System.out.println(linkedHashSet);


    }
}
