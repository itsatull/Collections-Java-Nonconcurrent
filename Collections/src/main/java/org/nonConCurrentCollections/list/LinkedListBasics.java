package org.nonConCurrentCollections.list;

import java.util.LinkedList;

public class LinkedListBasics {

    /*
      1).null insertion is allowed you can insert null value in LinkedList.
      2).it is good for frequent changes like remove,add at specific index.
      3).for searching it is not good.
      4).Random access is not possible (it has not implemented Random access interFace).
      5).it can store heterogeneous values in non-Generic LinkedList
      6).it's implemented Cloneable & Serializable,Deque interface.
      7).Each object inside the LinkedList is node.
      8).Internally Represented by Doubly Linked list.

     */
    public static void main(String[] args) {
//        Collection list2 = new LinkedList();
        LinkedList list2 = new LinkedList();// perfereed to be initialized like this.
        // add work same as push_back() in cpp -- adding element at end off linked list is O(1) operation
        list2.add(null);
        list2.add(100);
        list2.add("sadsadsaas");
        list2.add(list2);
        System.out.println(list2);

        // addFirst work same as push_front() in cpp -- adding element at begning off linked list is O(1) operation
        list2.addFirst(100);
        list2.size();//o(1)
        System.out.println(list2);
        list2.getFirst();

        // removeFirst() -- work same as pop_front() in cpp -- removing element at begning off linked list is O(1) operation
        list2.removeFirst();
        System.out.println(list2);

        //removeLast() -- work same as pop_back() in cpp -- -- removing element at ending off linked list is O(1) operation
        System.out.println(list2.removeLast());

        // get() -- getting element at any specfic index is O(n) operation
        System.out.println(list2.get(1));

//        List<Integer> list = new LinkedList<>(); // type defined can only store Integer values
//        List<Long> timeTankentoInsert = new LinkedList<>();
//        List<Long> timeTankentoInsert1 = new LinkedList<>();
//        long start;
//        long finish;
//        for (int i = 0; i < 1000; i++) {
//            start = System.nanoTime();
//            list.add(i);
//            finish = System.nanoTime();
//            long timeElapsed = finish - start;
//            timeTankentoInsert .add(timeElapsed);
//        }
//        System.out.println(list);
//        System.out.println(timeTankentoInsert);
//        for (int i = 999;i > -1; i--){
//            start = System.nanoTime();
//            list.remove(i);
//            finish = System.nanoTime();
//            long timeElapsed = finish - start;
//            timeTankentoInsert1.add(timeElapsed);
//        }
//        System.out.println(timeTankentoInsert1);
    }
}
