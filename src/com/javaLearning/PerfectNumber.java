package com.javaLearning;

public class PerfectNumber {
    public static void main(String[] args){
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
    }
    public static boolean isPerfectNumber(int number){
        if (number < 1)
            return false;
        int x = 0;
        for (int i = 1; i < number; i++){
            if (number%i==0)
                x += i;
        }
        if(x == number)
            return true;
        else
            return false;
    }
}