package io.github.darkoberd00.day1.part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {

        System.out.println("Day 1: Part 2");

        try {

            Scanner scanner = new Scanner(new File("C:\\Users\\Phil\\IdeaProjects\\advent-of-code-2021\\src\\main\\resources\\day1_input.txt"));

            ArrayList<Integer> integers = new ArrayList<>();

            while (scanner.hasNext()){
                integers.add(scanner.nextInt());
            }

            ArrayList<Integer> summs = new ArrayList<>();
            for (int i = 0;i < integers.size();i++){
                summs.add(integers.get(i) + integers.get(i+1) + integers.get(i+2));
                if(i+2 == integers.size()-1) break;
            }

            int min = summs.get(0);
            int count = 0;

            for (int i : summs){
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
