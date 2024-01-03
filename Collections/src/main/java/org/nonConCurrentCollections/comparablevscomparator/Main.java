package org.nonConCurrentCollections.comparablevscomparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    /*
    Comparable ==> compareTo(T ob); -- Comparable is a function interface
    Comparator ==> compare(T ob1, T obj2); Comparator is a functional interface
     */
    public static void main(String[] args) {
        Comparator<Student> comparator = (obj1,obj2) -> obj1.getAge() - obj2.getAge(); // ascending
        Comparator<Student> comparator1 = (obj1,obj2) -> obj2.getAge() - obj1.getAge(); // descending
        Comparator<Student> comparator2 = (obj1,obj2) -> obj1.getName().compareTo(obj2.getName());//ascending order of name.
        Comparator<Student> comparator3 = (obj1,obj2) -> obj2.getName().compareTo(obj1.getName());//descending order of name.
        Set<Student> students = new TreeSet<>(comparator2);
        students.add(new Student("atul",25));
        students.add(new Student("rohan",26));
        students.add(new Student("rahul",27));
        students.add(new Student("ravi",28));
        students.add(new Student("sumit",29));


        System.out.println(students);
    }
}
