package org.nonConCurrentCollections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorsBasics {
    public static void main(String[] args) {
        List<List<String>> lists = new Vector<>();
        Vector vector = new Vector<>();
        Vector<Integer> vector1 = new Vector<>();
        Vector<Integer> vector2 = new Vector<>(50);

        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();
//        vector.add(10);
//        vector.add(null);
//        vector.add("2e12e");
//        vector.add('e');
        int i = 0;
        while (i < 50){
            vector1.add(i);
            vector2.add(i);
            linkedList.addLast(vector1.capacity());
            linkedList1.addLast(vector2.capacity());
            i++;
        }
        //vector1.forEach( x -> System.out.println(x));
        //linkedList.forEach( x -> System.out.println(x));
        System.out.println(vector1);
        System.out.println(linkedList);
        System.out.println(linkedList1);
        System.out.println(linkedList.pollLast()); // poll work same as remove
        System.out.println(linkedList);
    }
}
