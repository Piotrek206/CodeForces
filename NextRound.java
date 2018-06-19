package com.problemset;

import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        Scanner skaner = new Scanner(System.in);

        n = skaner.nextInt();
        k = skaner.nextInt();

        int[] points = new int[n];

        /*List PointsOfParticipants = new ArrayList();*/
        for (int i=0; i<n; i++){
            /*PointsOfParticipants.add(skaner.nextInt());*/
            points[i] = skaner.nextInt();
        }

        int numberOfParticipants = 0;
        if (n > 0 && k>0 ){
            for (int j=0; j<n; j++){
                if(points[j] >= points[k] && points[j] > 0){
                    numberOfParticipants++;
                }
            }
        }
        System.out.println(numberOfParticipants);

        System.exit(0);
    }
}
