package com.braj.examples.java8.mapAndFlatMap;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

    // Flat map is used to flatten out a structure.

    public static void main(String[] args) {
        mapAndFlatMapexample1();

    }

    private static void mapAndFlatMapexample1() {
        // 1 : map works well with simple and direct mappings
        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("With Using Map :" + myList);

        //2 : flatmap shouldbe used for complex mapping
        // Note that here its a List of List of String... But we flattened out to a normal form
        List<List<String>> complexList = Arrays.asList( Arrays.asList("a"),
                                                        Arrays.asList("b"));

        System.out.println("With Using Flat Map :" +complexList
                                                .stream()
                                                .flatMap(Collection::stream) // Flattening
                                                .map(String::toUpperCase)
                                                .collect(Collectors.toList()));
    }
}
