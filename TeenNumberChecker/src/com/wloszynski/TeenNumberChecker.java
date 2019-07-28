package com.wloszynski;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstP, int secondP, int thirdP) {
        if (firstP >= 13 && firstP <=19  || secondP >= 13 && secondP <= 19 || thirdP >= 13 && thirdP <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen (int firstP){
        if (firstP >= 13 && firstP <=19) {
            return true;
        }
        return false;
    }
}

