package com.problemset;

import java.util.*;

public class taxi {

    private List<Integer> groupsSize = new ArrayList<>();

    public static void main(String[] args) {

        taxi myTaxi = new taxi();
        myTaxi.readInput();
        myTaxi.countTaxi();

    }

    private void readInput(){

        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i=0; i<n; i++){
            groupsSize.add(scanner.nextInt());
        }
    }

    private int countTaxi() {

        Collections.sort(groupsSize, Collections.reverseOrder());
        int counter4 = 0;
        int counter3 = 0;
        int counter2 = 0;
        int counter1 = 0;
        int counter = 0;

        for (int j=0; j<groupsSize.size(); j++){
            if (groupsSize.get(j) == 4){
                counter4++;
            }
            else if (groupsSize.get(j) == 3){
                counter3++;
            }
            else if (groupsSize.get(j) == 2){
                counter2++;
            }
            else if (groupsSize.get(j) == 1){
                counter1++;
            }
        }

        counter = counter4;

        if (counter2 % 2 == 0) counter += counter2/2;
        else counter += (counter2-1)/2;

        if (counter3 >= counter1){
            counter += counter1;
        }
        else {
            counter += counter3;
            if (counter2 % 2 != 0){
                if ((counter1-counter3)%2 == 0)
                    counter += (counter1-counter3)%2;
                else counter += (counter1-counter3)%2 + 1;
            }
        }

        System.out.println("Counter: " + counter);
        return counter;
    }
}
