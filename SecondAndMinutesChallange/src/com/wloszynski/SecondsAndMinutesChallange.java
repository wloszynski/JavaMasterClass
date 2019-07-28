package com.wloszynski;

public class SecondsAndMinutesChallange {
    public static void getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            minutes = minutes % 60;

            //format 01h 01m 01s
            System.out.println(String.format("%02d", hours) + "h " + String.format("%02d", minutes) + "m " + String.format("%02d", seconds) + "s");

        } else {
            System.out.println("Invalid value");
        }

    }

    public static void getDurationString(int seconds) {
        if (seconds >= 0) {
            getDurationString(seconds / 60, seconds % 60);
        }

    }
}
