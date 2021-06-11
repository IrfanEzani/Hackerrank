package ProblemSolving;

import java.util.*;

public class grading {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // create multiples array
        List<Integer> multiplesOfFive = new ArrayList<Integer>();
        for (int i = 40; i < 101; i++) {
            if (i % 5 == 0) {
                multiplesOfFive.add(i);
            }
        }
        // create new array to store final scores
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38) {
                for (int j = 0; j < multiplesOfFive.size(); j++) {
                    if (multiplesOfFive.get(j) - grades.get(i) > 0 && multiplesOfFive.get(j) - grades.get(i) < 5) {
                        System.out.println("Nearest multiple to " + grades.get(i) + " :" + multiplesOfFive.get(j));
                        
                        //temp is the nearest multiple
                        int temp = multiplesOfFive.get(j);
                        //number is number in array
                        int number = grades.get(i);
                        if (temp - number < 3) {
                            System.out.println("Rounded up:" + temp);
                            grades.set(grades.indexOf(number), temp);
                        } else {
                            System.out.println("Insuffient amount to round up. Score is:" + number);
                        }
                    }
                }
            } else {
                System.out.println("Fail score: " + grades.get(i));
            }
        }
        System.out.println("Final grade;");
        for (Integer integer : grades) {
            System.out.print(integer + ",");
        }

        return grades;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            arr.add(s.nextInt());
        }
        s.close();
        List<Integer> finalGrades = gradingStudents(arr);
        for (Integer i : finalGrades) {
            System.out.println(i);
        }

    }
}
