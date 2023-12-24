/*QUESTION -3 (P2.4): Write a program that prompts the user for two integers and then prints

• The sum

• The difference

• The product

• The average

• The distance (absolute value of the difference)

• The maximum (the larger of the two)

• The minimum (the smaller of the two)

Hint: The max and min functions are declared in the Math class.  */

import java.util.Scanner;

public class PrintNumberStats {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Please enter the first integer: ");
            int num1 = in.nextInt();

            System.out.print("Please enter the second integer: ");
            int num2 = in.nextInt();

            int sum = num1 + num2;

            int difference = num1 - num2;

            int product = num1 * num2;

            double average = (num1 + num2) / 2.0;

            int distance = Math.abs(difference);

            int max = Math.max(num1, num2);

            int min = Math.min(num1, num2);

            System.out.printf("The sum : %d\n", sum);
            System.out.printf("The difference : %d\n", difference);
            System.out.printf("The product : %d\n", product);
            System.out.printf("The average : %.2f\n", average);
            System.out.printf("The distance : %d\n", distance);
            System.out.printf("The maximum : %d\n", max);
            System.out.printf("The minimum : %d\n", min);
        }

    }

}
