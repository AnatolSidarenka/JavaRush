package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        outputStream.reset();
        String reverseString = reverseString(result);
        printSomething(reverseString);
        System.out.println(outputStream);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}