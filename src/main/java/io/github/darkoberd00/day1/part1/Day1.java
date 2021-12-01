package io.github.darkoberd00.day1.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solution for Day 1 from Advent of Code 2021
 * @author Phil Traeger
 */
public class Day1 {

    public static void main(String[] args) {

        System.out.println("Day 1: Part 1");

        try {

            Scanner scanner = new Scanner(new File("C:\\Users\\Phil\\IdeaProjects\\advent-of-code-2021\\src\\main\\resources\\day1_input.txt"));

            ArrayList<Integer> integers = new ArrayList<>();

            while (scanner.hasNext()){
                integers.add(scanner.nextInt());
            }

            int min = integers.get(0);
            int count = 0;

            for (int i : integers){
                if(min == i) {

                } else if(i > min) {
                    count++;
                    min = i;
                } else if(i < min) {
                    min = i;
                }
            }

            System.out.println(count);

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }

    }

}
