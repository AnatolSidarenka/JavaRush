package com.javarush.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (String line : lines) {
                System.out.println(line.replaceAll("[,. ]", ""));
            }
        } catch (Exception e) {
            System.out.println("Something wen wrong: " + e);
        }
    }
}

