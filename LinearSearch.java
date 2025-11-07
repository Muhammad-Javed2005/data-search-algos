import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is developed by Engr. Muhammad Javed");

        int[] arr = {10, 25, 30, 45, 50};
        int key = 30;
        boolean found = false;

        System.out.println("\nArray Elements:");
        for (int num : arr)
            System.out.print(num + " ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("\n\nElement " + key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("\n\nElement not found in the array.");

        System.out.println("\nProgram executed successfully!");
    }
}
