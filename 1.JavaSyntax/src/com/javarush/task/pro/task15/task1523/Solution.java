package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        PrintStream output = new PrintStream(connection.getOutputStream());
        output.println("TestTest");

        InputStreamReader input = new InputStreamReader(connection.getInputStream());
        BufferedReader reader = new BufferedReader(input);

        while(reader.ready()) {
            System.out.println(reader.readLine());
        }
    }
}

