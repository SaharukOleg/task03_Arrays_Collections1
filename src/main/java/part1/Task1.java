package part1;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 4, -1};
        int[] arr2 = {6, 7, 8, 9, 10, 56, 443, 34, 333};

        int sizeOfTwoArrays = arr1.length + arr2.length;

        System.out.println("size of two arrays = " + sizeOfTwoArrays);
        int[] arr3 = new int[sizeOfTwoArrays];

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] += arr1[i];
            count++;
        }

        for (int j = 0; j < arr2.length; j++) {
            arr3[count++] += arr2[j];
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        
    }
}
