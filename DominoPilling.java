package com.problemset;

import java.util.Scanner;

public class DominoPilling {

    public static void main(String[] args) {

        int m = 0;
        int n = 0;
        Scanner skaner = new Scanner(System.in);
        m = skaner.nextInt();
        n = skaner.nextInt();

        System.out.println((m*n)/2);

        System.exit(0);
    }
}
