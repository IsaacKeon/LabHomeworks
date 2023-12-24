import java.util.Scanner;

public class SupermarketAwardsCoupons {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {
            double spent;
            double coupon;

            while (true) {
            	System.out.print("Please enter the cost of your groceries:");

            	if (in.hasNextDouble()) {
            		spent = in.nextDouble();

            		if (0 <= spent && spent < 10) {
            			System.out.print("No coupon");
            		} else if (10 <= spent && spent < 60) {
            			coupon = spent * 8 / 100;
            			System.out.print("You win a discount coupon of $" + coupon + ".");
            		} else if (60 <= spent && spent < 150) {
            			coupon = spent * 10 / 100;
            			System.out.print("You win a discount coupon of $" + coupon + ".");
            		} else if (150 <= spent && spent < 210) {
            			coupon = spent * 12 / 100;
            			System.out.print("You win a discount coupon of $" + coupon + ".");
            		} else if (210 <= spent) {
            			coupon = spent * 14 / 100;
            			System.out.print("You win a discount coupon of $" + coupon + ".");
            		} else {
            			System.out.println("Invalid input. Please enter a valid amount.");
            			continue;
            		}

            		break;
            	} else {
            		System.out.println("Invalid input. Please enter a valid number.");
            		in.next();
            	}
            }
        }
	}
}
