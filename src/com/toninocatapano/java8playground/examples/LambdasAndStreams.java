package com.toninocatapano.java8playground.examples;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by tonnoz on 26/05/16.
 */
public class LambdasAndStreams {




    public static void main(String[] args) {
        directoriesExample();
        hashmapExample();
    }

    private static void directoriesExample() {
        List<File> dirs = Arrays.asList(new File(".").listFiles(File::isDirectory));
        dirs.forEach(System.out::println);
        List<File> listOfHiddenDirs = dirs
                .stream() //convert list to stream
                .filter(s -> s.isHidden()) //filter
                .collect(Collectors.toList());  //return to ArrayList     or .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("hidden dir in ./: \n");
        listOfHiddenDirs.forEach(System.out::println);
    }


    public static void hashmapExample(){
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        items.forEach((k,v) -> System.out.println("Item : " + k + " Count : " + v));
    }


}
