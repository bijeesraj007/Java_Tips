package com.braj.examples.java8map;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

    public static void main(String[] args) {

        // 1 : map works well with simple and direct mappings
        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(myList);

        //2 : flatmap shouldbe used for complex mapping
        List<List<String>> complexList = Arrays.asList(
                                                        Arrays.asList("a"),
                                                        Arrays.asList("b"));
        //System.out.println(complexList);

        System.out.println(complexList
                .stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList()));

    }
}
