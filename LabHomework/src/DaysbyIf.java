import java.util.Scanner;

// Question 1
public class DaysbyIf {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a number between 1-7!");
            int dayOfWeek = in.nextInt();

            if (dayOfWeek == 1) {
                System.out.print("Monday");
            } else if (dayOfWeek == 2) {
                System.out.print("Tuesday");
            } else if (dayOfWeek == 3) {
                System.out.print("Wednesday");
            } else if (dayOfWeek == 4) {
                System.out.print("Thursday");
            } else if (dayOfWeek == 5) {
                System.out.print("Friday");
            } else if (dayOfWeek == 6) {
                System.out.print("Saturday");
            } else if (dayOfWeek == 7) {
                System.out.print("Sunday");
            } else {
                System.out.print("Result: You did not enter a number between 1-7!");
            }
        }
    }
}
