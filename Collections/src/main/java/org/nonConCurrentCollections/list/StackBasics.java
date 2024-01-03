package org.nonConCurrentCollections.list;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackBasics {
    // in java Stack is a child class of vector
    public static void main(String[] args) {
        Vector stack2 = new Stack();

        Stack stack = new Stack<>();//non generic stack
        Stack<Integer> stack1 = new Stack<>(); // generic stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        stack.add(25);
        //Note add,push work same in stack

        while (stack.size()>0){
//            System.out.println(stack.peek()); // peack is same as top() in cpp
//            stack.pop();
            System.out.println(stack.pop());
        }
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
