package org.okten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.reverseOrder;

public class Main {

    public static void main(String[] args) {
        Person john = new Person("John", 25, "Okten", 5000, "3712693128973", "Lviv, Gorodotska 5432433");
        Person mike = Person.builder()
                .name("Mike")
                .age(30)
                .build();
        Person bob = Person.builder()
                .name("Bob")
                .age(25)
                .build();
        Person hugo = Person.builder()
                .name("Hugo")
                .age(13)
                .build();

        List<Person> persons = List.of(john, mike, bob, hugo);

        // List<Ящик>
        // Ящик - List<Овоч>

        List<Character> personNameUniqueCharacters = persons
                .stream()
                .map(Person::getName)
                .flatMap(personName -> personName
                        .chars()
                        .mapToObj(charIndex -> (char) charIndex)
                )
                .distinct()
                .toList();

        if (persons.stream().allMatch(person -> person.getAge() > 18)) {
            System.out.println("Усі персони є повнолітніми");
        } else {
            System.out.println("Не усі персони є повнолітніми");
        }

        System.out.println(personNameUniqueCharacters);

        System.out.println(john);
        System.out.println(mike);

        List<Integer> numbers = List.of(2, 8, 1, 4, 9, 4, 0, 6, 5, 3, 5, 2, 8, 4, 0);

        demo1(numbers);
        demo2(numbers);
        demo3(numbers);
    }

    public static void demo1(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0 && !evenNumbers.contains(number)) {
                evenNumbers.add(number);
            }
        }

        evenNumbers.sort(reverseOrder());

        List<Integer> squares = new ArrayList<>();

        for (Integer number : evenNumbers) {
            squares.add(number * number);
        }

        System.out.println(squares);
    }

    public static void demo2(List<Integer> numbers) {
        Set<Integer> evenNumbers = new TreeSet<>(reverseOrder());

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        List<Integer> squares = new ArrayList<>();

        for (Integer number : evenNumbers) {
            squares.add(number * number);
        }

        System.out.println(squares);
    }

    public static void demo3(List<Integer> numbers) {
        int maxEvenSquare = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .sorted(reverseOrder())
                .mapToInt(Main::square)
                .max()
                .orElse(0);

        System.out.println("max even square: " + maxEvenSquare);

        List<Integer> squares = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .sorted(reverseOrder())
                .map(Main::square)
                .collect(Collectors.toList());// == .toList()

        System.out.println(squares);
    }

    private static Integer square(Integer n) {
        return n * n;
    }
}
