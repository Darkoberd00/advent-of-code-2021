package io.github.darkoberd00.day1;

import java.util.ArrayList;

/**
 * Solution for Day 1: Part 2 from Advent of Code 2021
 * @author Phil Traeger
 */
public class Part2 implements Part {
    private ArrayList<Integer> integers;

    public Part2(ArrayList<Integer> integers){
        this.integers = integers;
    }

    public int getSolution() {
        int solution = 0;
        ArrayList<Integer> summs = new ArrayList<>();

        for (int i = 0;i < integers.size();i++){
            summs.add(integers.get(i) + integers.get(i+1) + integers.get(i+2));
            if(i+2 == integers.size()-1) break;
        }

        int min = summs.get(0);
        for (int i : summs){
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
        return "Part 2: " + this.getSolution();
    }
}
