import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is developed by Engr. Muhammad Javed");

        int[] arr = {10, 20, 30, 40, 50};
        int key = 40;
        int low = 0, high = arr.length - 1;
        boolean found = false;

        System.out.println("\nSorted Array:");
        for (int num : arr)
            System.out.print(num + " ");

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("\n\nElement " + key + " found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found)
            System.out.println("\n\nElement not found in the array.");

        System.out.println("\nProgram executed successfully!");
    }
}
