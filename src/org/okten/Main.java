package org.okten;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    // FIFO - First in first out
    // LIFO - Last in first out (Stack)

    public static void main(String[] args) {
        List<String> messages = new ArrayList<>();
        messages.add("hello");
        messages.add("world");
        messages.add("and");
        messages.add("okten");
        messages.add("okten");
        messages.add("hello");
        messages.add(null);
        messages.add(null);

        System.out.println(messages);

        Set<String> messages2 = new HashSet<>();
        messages2.add("hello");
        messages2.add("world");
        messages2.add("and");
        messages2.add("okten");
        messages2.add("okten");
        messages2.add("hello");
        messages2.add(null);
        messages2.add(null);

        System.out.println(messages2);

        System.out.println("------------------------------------");
        System.out.println(addElements(new ArrayList<>()));
        System.out.println(addElements(new TreeSet<>(Comparator.nullsFirst(Comparator.reverseOrder()))));

        System.out.println("------------------------------------");
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 4);
        map.put("a", 1);
        map.put("b", 5);
        System.out.println(map);

        Person person1 = new Person("John", 20);
        Person person2 = new Person("Mike", 30);
        Person person3 = new Person("Bob", 13);
        Person person4 = new Person("John", 90);
        System.out.println(person1.hashCode() % 32);
        System.out.println(person2.hashCode() % 32);
        System.out.println(person3.hashCode() % 32);

        Map<Person, String> persons = new HashMap<>(32);
        persons.put(person1, "Lviv");
        persons.put(person2, "Kyiv");
        persons.put(person3, "Dnipro");
        persons.put(person4, "Dnipro");
        System.out.println(persons);
        System.out.println(person1 == person4);
        System.out.println(person1.equals(person4));

        // 16 - index=0-15
    }

    public static Collection<String> addElements(Collection<String> target) {
        target.add("e");
        target.add("a");
        target.add("g");
        target.add("d");
        target.add("b");
        target.add("c");
        target.add(null);
        return target;
    }
}
