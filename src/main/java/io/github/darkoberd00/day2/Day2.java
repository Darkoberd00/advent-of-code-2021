package io.github.darkoberd00.day2;

import io.github.darkoberd00.day1.Part;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solution for Day 2 from Advent of Code 2021
 * @author Phil Traeger
 */
public class Day2 {

    public static void main(String[] args) {

        System.out.println("--- Day 2 ---");

        Part part1 = new Part1(strings());
        System.out.println(part1);

        Part part2 = new Part2(strings());
        System.out.println(part2);

    }

    public static ArrayList<String> strings(){
        ArrayList<String> strings = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Phil\\IdeaProjects\\advent-of-code-2021\\src\\main\\resources\\day2_input.txt"));

            while (scanner.hasNextLine()) {
                strings.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.err.println("File Not Found");
        }
        return strings;
    }

}
