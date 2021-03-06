package hackerrank.daysOfCode30;

//Given an integer, n, print its first 10 multiples. Each multiple n x i (where 1 <= i <= 10) should be printed on a new line in the form: n x i = result.

import java.util.Scanner;

public class Day5_Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
