package io.github.darkoberd00.day1;

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

        System.out.println("--- Day 1 ---");

        Part part1 = new Part1(integers());
        System.out.println(part1);

        Part part2 = new Part2(integers());
        System.out.println(part2);

    }

    public static ArrayList<Integer> integers(){
        ArrayList<Integer> integers = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Phil\\IdeaProjects\\advent-of-code-2021\\src\\main\\resources\\day1_input.txt"));

            while (scanner.hasNext()) {
                integers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e){
            System.err.println("File Not Found");
        }
        return integers;
    }

}
