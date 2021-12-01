package io.github.darkoberd00.day1;

import java.util.ArrayList;

/**
 * Solution for Day 1: Part 1 from Advent of Code 2021
 * @author Phil Traeger
 */
public class Part1 implements Part {
    ArrayList<Integer> integers;

    public Part1(ArrayList<Integer> integers){
        this.integers = integers;
    }

    @Override
    public int getSolution() {

        int min = integers.get(0);
        int solution = 0;

        for (int i : integers){
            if(min != i) {
                if (i > min) {
                    solution++;
                }
                min = i;
            }
        }

        return solution;
    }

    @Override
    public String toString() {
        return "Part 1: " + this.getSolution();
    }
}
