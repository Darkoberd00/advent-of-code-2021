package io.github.darkoberd00.day2;

import io.github.darkoberd00.day1.Part;

import java.util.ArrayList;

/**
 * Solution for Day 2 : Part 2 from Advent of Code 2021
 * @author Phil Traeger
 */
public class Part2 implements Part {
    ArrayList<String> strings;
    int horizontal = 0;
    int depth = 0;
    int aim = 0;

    Part2(ArrayList<String> strings){
        this.strings = strings;
    }

    @Override
    public int getSolution() {

        for (String strings: strings){
            String[] arr = strings.split(" ");

            int i = Integer.parseInt(arr[1]);

            if(arr[0].equals("forward")){
                horizontal += i;

                if (aim != 0){
                    depth += i*aim;
                }

            } else if (arr[0].equals("down")){
                aim += i;
            } else {
                aim -= i;
            }
        }

        return depth * horizontal;
    }

    @Override
    public String toString() {
        return "Part 2 : " + getSolution();
    }
}
