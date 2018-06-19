package com.problemset;

//http://codeforces.com/problemset/problem/118/A

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {

        System.out.println(
                processGivenTextFromUser(getTextFromUser())
        );

        System.exit(0);
    }

    private static boolean isVowel(String s) {
        return "AEIOUYaeiouy".indexOf(s) != -1;
    }

    private static List<String> getTextFromUser() {

        String text = "";
        Scanner skaner = new Scanner(System.in);
        text = skaner.nextLine();

        List<String> terms = new ArrayList<String>();
        for (int i = 0; i < text.length(); i++) {
            terms.add(String.valueOf(text.charAt(i)));
        }

        return terms;
    }

    private static String processGivenTextFromUser(List<String> terms) {
        int previousTermsSize = terms.size();
        for (int j = 0; j < previousTermsSize; j++){
            if (isVowel(String.valueOf(terms.get(j)))) {
                terms.set(j, "");
            }
            else {
                if (Character.isUpperCase(terms.get(j).charAt(0))){
                    terms.set(j, terms.get(j).toLowerCase());
                }
                terms.set(j, "." + terms.get(j));
            }
        }


        String result = String.join("",  terms);
        return result;
    }
}
