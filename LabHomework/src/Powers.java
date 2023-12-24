/*QUESTION -2 (P2.3): Write a program that reads a number and displays the square, cube, and fourth
power. Use the Math.pow method only for the fourth power.*/

import java.util.Scanner;

public class Powers {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Please enter a number: ");

            double numero = in.nextDouble();

            double square = Math.pow(numero, 2);

            double cube = Math.pow(numero, 3);

            double fourthPow = Math.pow(numero, 4);

            System.out.printf("Square : %f \n", square);

            System.out.printf("Cube : %f \n", cube);

            System.out.printf("Fourth Power: %f ", fourthPow);
        }

    }

}
