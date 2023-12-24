import java.util.Scanner;

public class DaysbySwitch {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            
            System.out.println("Enter a number between 1-7!");
            int dayOfWeek = in.nextInt();

            switch (dayOfWeek) {
                case 1: {
                    System.out.print("Monday");
                    break;
                }
                case 2: {
                    System.out.print("Tuesday");
                    break;
                }
                case 3: {
                    System.out.print("Wednesday");
                    break;
                }
                case 4: {
                    System.out.print("Thursday");
                    break;
                }
                case 5: {
                    System.out.print("Friday");
                    break;
                }
                case 6: {
                    System.out.print("Saturday");
                    break;
                }
                case 7: {
                    System.out.print("Sunday");
                    break;
                }
                default:
                    System.out.print("Result: You did not enter a number between 1-7!");
            }
        }

    }

}
