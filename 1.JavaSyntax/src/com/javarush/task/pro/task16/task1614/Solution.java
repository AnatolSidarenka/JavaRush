package com.javarush.task.pro.task16.task1614;

import java.time.Instant;
import java.time.LocalDate;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        long timestamp = Instant.MAX.getEpochSecond();
        return Instant.ofEpochSecond(timestamp);
    }

    static Instant getMaxFromSecondsAndNanos() {
        long Second = Instant.MAX.getEpochSecond();
        int nano = Instant.MAX.getNano();
        return Instant.ofEpochSecond(Second, nano);
    }
}
