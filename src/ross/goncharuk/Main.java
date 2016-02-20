package ross.goncharuk;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        int[][] m = {{1, 2, 2, 3}, {1, 1, 2, 3}, {1, 3, 3, 3}, {3, 1, 4, 1}, {4, 2, 1, 4}};

        //Added a display of matrix in console
        for (int a = 0; a <= 3; a++) {
            for (int b = 0; b <= 4; b++) {
                System.out.print(m[b][a] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Added a function to enter searched value from keyboard, personal utility
        System.out.print("Enter array value: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        System.out.println();
        System.out.println("Value " + val + " is located at array index[]:");
        System.out.println();

        for (int x = 0; x <= 3; x++) {
            System.out.print("Line " + (x + 1) + ": ");
            for (int y = 0; y <= 4; y++) {
                if (m[y][x] == val) {
                    System.out.print("[" + y + "]");
                }
            }
            System.out.println();
        }
    }
}

