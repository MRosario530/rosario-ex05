/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
import java.util.*;

public class Solution05 {
    public static void main(String[] args) {
	/*
        print: What is the first number?
        'num1Str' = read string from user
        print: What is the second number?
        'num2Str' = read string from user
        convert 'num1Str' and 'num2Str' to integers 'num1Int' and 'num2Int'
        calculate:
            (int)'sum' = 'num1Int' + 'num2Int'
            (int)'difference' = 'num1Int' - 'num2Int'
            (int)'product' = 'num1Int' * 'num2Int'
            (double)'quotient' = 'num1Int' / 'num2Int'
        print: 'num1Int' + 'num2Int' = sum \n 'num1Int' - 'num2Int' = 'difference' \n 'num1Int' * 'num2Int' = 'product' \n 'num1Int' / 'num2Int' = 'quotient'
	*/

        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String num1Str = input.nextLine();
        System.out.print("What is the second number? ");
        String num2Str = input.nextLine();
        int num1Int = Integer.parseInt(num1Str);
        int num2Int = Integer.parseInt(num2Str);
        int sum = num1Int + num2Int;
        int difference = num1Int - num2Int;
        int product = num1Int * num2Int;
        double quotient = (double)num1Int / num2Int;
        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %.2f\n", num1Int, num2Int, sum, num1Int, num2Int, difference, num1Int, num2Int, product, num1Int, num2Int, quotient );
    }

}