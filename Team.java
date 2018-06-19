package com.problemset;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {

        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int sumNumbersInLine;
        int counterOfSolutions = 0;
        for(int j=0; j<n; j++) {
            sumNumbersInLine = 0;
            for (int i = 0; i < 3; i++) {
                if (scanner.hasNext()) {
                    if (scanner.nextInt() == 1) {
                        sumNumbersInLine++;
                    }
                }
            }
            if (sumNumbersInLine >= 2) counterOfSolutions++;
        }

        System.out.println(counterOfSolutions);

        System.exit(0);
    }
}
