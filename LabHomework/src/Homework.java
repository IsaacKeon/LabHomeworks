import java.time.temporal.IsoFields;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        final int EXIT_CHOICE = 0;
        int n = EXIT_CHOICE;

        do {
            n = validateUserInput();
            switchToMethods(n);
        } while (n != EXIT_CHOICE);

    }

    public static void printMenu() {

        System.out.println("\n***************************************************************************************");
        System.out.println("Enter any choice!");
        System.out.println("Enter any character to exit!");
        System.out.println("1- Find Largest");
        System.out.println("2- Find Average");
        System.out.println("3- Find Sum of Digits (Loop)");
        System.out.println("4- Find Sum of Digits (Recursive)");
        System.out.println("5- Print Box String");
        System.out.println("***************************************************************************************");

    }

    public static void findlargest() {

        System.out.println("This is method findLargest");

        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int num = in.nextInt();

        double[] values = new double[num];
        double largest = 0;
        int i;

        for (i = 0; i < values.length; i++) {
            System.out.print("Please enter number " + (i + 1) + ": ");
            double arrnum = in.nextDouble();
            values[i] = arrnum;

        }

        for (i = 0; i < values.length; i++) {
            if (values[i] > largest)
                largest = values[i];

        }

        System.out.println("The largest number is: " + largest);

    }

    public static void findAverage() {

        System.out.println("This is method findAverage");

        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int num = in.nextInt();

        double[] values = new double[num];
        double avg = 0, sum = 0;
        int i;

        for (i = 0; i < values.length; i++) {
            System.out.print("Please enter number " + (i + 1) + ": ");
            double arrnum = in.nextDouble();
            values[i] = arrnum;

        }

        for (i = 0; i < values.length; i++) {
            sum += values[i];
        }

        avg = sum / num;

        System.out.println("The avarage of numbers is: " + avg);

    }

    public static void findSumofDigits() {
        System.out.println("This is method findSumofDigits");

        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int num = in.nextInt();

        double[] values = new double[num];
        double sum = 0;
        int i;

        for (i = 0; i < values.length; i++) {
            System.out.print("Please enter number " + (i + 1) + ": ");
            double arrnum = in.nextDouble();
            values[i] = arrnum;

        }

        for (i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println("The sum of numbers is: " + sum);

    }

    public static int findSumOfDigitsRecursive(int number) {
        // System.out.println("This is method findSumOfDigitsRecursive:");

        if (number == 0) {
            return 0;
        }
        return (number % 10) + findSumOfDigitsRecursive(number / 10);

    }

    public static void printBoxString() {
        System.out.println("This is method printBoxString");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String msg = in.nextLine();
        System.out.print("+");
        for (int i = 0; i < msg.length(); i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println("\n|" + msg + "|");

        System.out.print("+");
        for (int i = 0; i < msg.length(); i++) {
            System.out.print("-");
        }
        System.out.print("+");

    }

    public static int validateUserInput() {
        Scanner in = new Scanner(System.in);
        int input = 0;
        int choiceMin = 1;
        int choiceMax = 5;
        boolean isExit = true;

        do {
            printMenu();
            if (in.hasNextInt()) {
                input = in.nextInt();
                if (input < choiceMin || input > choiceMax) {
                    System.out.println("Please enter a number between " + choiceMin + " and " + choiceMax);
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                isExit = false;
                in.next();
            }
        } while ((input < choiceMin || input > choiceMax) && !isExit);

        return input;
    }

    public static void switchToMethods(int choice) {
        System.out.println("This is method switchtoMethods");

        switch (choice) {
            case 1:
                findlargest();
                break;
            case 2:
                findAverage();
                break;
            case 3:
                findSumofDigits();
                break;
            case 4:
                Scanner in = new Scanner(System.in);
                System.out.println("This is method findSumOfDigitsRecursive:");
                System.out.print("Enter a non-negative number:");
                int numRecursive = in.nextInt();
                int sumRecursive = findSumOfDigitsRecursive(numRecursive);
                System.out.println("The sum of digits is:" + sumRecursive);
                break;
            case 5:
                printBoxString();
                break;
            default:
                System.out.println("Please enter appropriate number [1,5]");
        }
    }
}
