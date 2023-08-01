//task one
//giving an unsorted array of integers sort the array in ascending order

import java.util.Scanner;

public class tasks3 {

    public static void main(String[] args) {
        int[] digits = {5,2,3,1};
        int temp = 0;
        boolean sort;
        for (int i = 0; i < digits.length; i++) {

            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] > digits[j]) {
                    temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }


            }
        }
            System.out.println("\nArray sorted in ascending order: ");
            for (int i = 0; i < digits.length; i++) {
                System.out.print(digits[i] + " ");

            }
        }
    }


