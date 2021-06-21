package ProblemSolving;

import java.util.*;

public class pangrams {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String lowered = str.toLowerCase();
        /* System.out.println("String:" + lowered); */
        char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' };
        char[] strArr = lowered.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < alphabets.length; j++) {
                    if(strArr[i] == alphabets[j]) {
                        alphabets[j] = '#';
                        /* System.out.println("strArr[i]: " + strArr[i] + " alphabets[j]: " + alphabets[j]); */
                    }
            }
        }

        
        int count = 0;
        for (int i = 0; i < alphabets.length; i++) {
            if(alphabets[i] == '#') {
                count++;
            } 
        }

        if(count == alphabets.length) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }

    }
}

/* We promptly judged antique ivory buckles for the prize : not */
/* We promptly judged antique ivory buckles for the next prize : pangram */
