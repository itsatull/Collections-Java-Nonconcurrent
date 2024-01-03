package org.map;

import org.nonConCurrentCollections.comparablevscomparator.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapObjectInsertionBasics {


    public static void main(String[] args) {
        Comparator<Student> comparator = (obj1, obj2) -> obj1.getAge() - obj2.getAge(); // ascending
        Comparator<Student> comparator1 = (obj1,obj2) -> obj2.getAge() - obj1.getAge(); // descending
        Comparator<Student> comparator2 = (obj1,obj2) -> obj1.getName().compareTo(obj2.getName());//ascending order of name.
        Comparator<Student> comparator3 = (obj1,obj2) -> obj2.getName().compareTo(obj1.getName());//descending order of name.
        Map<Student,String> map = new TreeMap<>(comparator1.reversed());
        map.put(new Student("Jhon",18),"Jhon"); // will get class cast exception.
        map.put(new Student("Ravi",19),"Ravi");
        map.put(new Student("Rahul",20),"Rahul");
        map.put(new Student("Ravindra",21),"Ravindra");
        map.put(new Student("Raghu",22),"Raghu");
        System.out.println(map);

    }
}
