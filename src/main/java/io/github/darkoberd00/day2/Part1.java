package io.github.darkoberd00.day2;

import io.github.darkoberd00.day1.Part;

import java.util.ArrayList;

/**
 * Solution for Day 2 : Part 1 from Advent of Code 2021
 * @author Phil Traeger
 */
public class Part1 implements Part {
    ArrayList<String> strings;
    int horizontal = 0;
    int depth = 0;

    Part1(ArrayList<String> strings){
        this.strings = strings;
    }

    @Override
    public int getSolution() {

        for (String strings: strings){
            String[] arr = strings.split(" ");

            int i = Integer.parseInt(arr[1]);

            if(arr[0].equals("forward")){
                horizontal += i;
            } else if (arr[0].equals("down")){
                depth += i;
            } else {
                depth -= i;
            }

        }

        return depth * horizontal;
    }

    @Override
    public String toString() {
        return "Part 1 : " + getSolution();
    }
}
