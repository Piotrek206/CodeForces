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

    private void countTaxi() {

        Collections.sort(groupsSize, Collections.reverseOrder());
        int counter = 0;
        Iterator<Integer> iterator = groupsSize.iterator();

/*        System.out.println("Group size:\n");
        System.out.println(groupsSize.toString());*/

        for(int j=0; j<groupsSize.size(); j++){


            System.out.println(groupsSize.toString());

            if (groupsSize.get(j) == 4) {
                groupsSize.remove(j);
                groupsSize.add(j, 0);
                counter++;
            }

            else if (groupsSize.get(j) == 3) {
                System.out.println("znalazłem 3 <3");

                for(int k=0; k<groupsSize.size(); k++) {
                    System.out.println("into for");
                    if (groupsSize.get(k) == 1) {
                        groupsSize.remove(j);
                        groupsSize.add(j, 0);
                        groupsSize.remove(k);
                        groupsSize.add(k, 0);
                        counter++;
                        break;
                    }
                }

                for(int l=0; l<groupsSize.size(); l++) {
                    System.out.println("into for2");
                    if (groupsSize.get(l) == 3){
                        groupsSize.remove(l);
                        groupsSize.add(l, 0);
                        counter++;
                        System.out.println(groupsSize.toString());
                    }
                }
            }

            else if (groupsSize.get(j) == 2) {
                //to do
            }

            /*if (groupsSize.get(j) == 4){
                counter ++;
            }
            else if (groupsSize.get(j) == 3){
                if (groupsSize.contains(1)){
                    Integer nextGroup = iterator.next();
                    while(iterator.hasNext())
                    {
                        if (nextGroup.equals(1))
                        {
                            iterator.remove();
                            System.out.println("removed");
                            groupsSize.add(0);
                            break;
                        }
                    }
                    counter++;
                }
            }
            else if (groupsSize.get(j) == 2){
                if (groupsSize.contains(2)){
                    while(iterator.hasNext())
                    {
                        if (iterator.next().equals(2))
                        {
                            iterator.remove();
                            groupsSize.add(0);
                            break;
                        }
                    }
                    counter++;
                }
            }
            else if (groupsSize.get(j) == 1){
                System.out.println("1");
            }
            else if (groupsSize.get(j) == 0){
                System.out.println("0");
                continue;
            }*/
        }

        System.out.println("Counter: " + counter);
        System.out.println(groupsSize.toString());
    }
}
