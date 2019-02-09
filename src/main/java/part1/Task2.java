package part1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 2, 3, 4, 4, 4, 5, 5, 9999, 1111, 35, 44, 2, 9999};
        boolean[] duplicate = new boolean[myArray.length];  //
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                // Make sure you haven't flagged this as a duplicate already
                if (!duplicate[j] && myArray[i] == myArray[j]) {
                    duplicate[j] = true;

                    System.out.println("Duplicate Element : " + myArray[j]);
                    System.out.println("Index of that duplicate element : " + j);

                }
            }
        }
    }
}