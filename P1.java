package com.company;

public class P1
    {
        public static void main(String[] args) {
        int j = 1;
        int sum = 0;
        do {
            j++;
            sum = j + sum;
        }
        while (j <= 100);
        System.out.print(sum);
    }
    }