package arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] studentScores = {60, 80, 57, 90, 78};

        //Finding the largest number in an array

        int largest = studentScores[0];
        for(int i =0; i<studentScores.length; i++){
            if(studentScores[i] > largest){
                largest = studentScores[i];
            }
        }
        System.out.println(largest);

//        System.out.println(studentScores[2]);
//        System.out.println(studentScores.length);

        String [] studentNames = new String[5];
        studentNames[0] = "Chris";
        studentNames[3] = "Fid";
        studentNames[1] = "John";
        studentNames[2] = "Bob";
        studentNames[4] = "Sam";

        System.out.println(Arrays.toString(studentNames));

//        for(int i = 0; i<studentNames.length; i++){
//            System.out.println(studentNames[i]);
//        }

        /*
        int total = 0;

        for(int i =0; i< studentScores.length; i++){
            total += studentScores[i];
        }
        int average = total/studentScores.length;

        System.out.println(average);


         */

    }
}
