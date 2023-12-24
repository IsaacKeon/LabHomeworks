import java.util.Scanner;

public class HybridCar {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            
            System.out.print("Enter the price of a new car:");
            double carPrice = in.nextDouble();

            System.out.print("Enter estimated miles driven per year:");
            double carMiles = in.nextDouble();

            System.out.print("Enter estimated gas price:");
            double gasPrice = in.nextDouble();

            System.out.print("Enter miles per gallon:");
            double milesPerGallon = in.nextDouble();

            // System.out.print("Enter estimated resale value:");

            String text = "resale";
            System.out.print("Enter estimated ");
            System.out.print("\u001B[4m" + text + "\u001B[0m");
            System.out.print(" value:");
            double estimatedResaleVal = in.nextDouble();

            double costAfter5Years, fuelCostPerYear, totalFuelCost;

            fuelCostPerYear = (carMiles / milesPerGallon) * gasPrice;

            totalFuelCost = fuelCostPerYear * 5;

            costAfter5Years = carPrice + totalFuelCost - estimatedResaleVal;

            System.out.printf("Total cost of owning car for 5 years: %.2f\n\n", costAfter5Years);
        }

        // System.out.println("Run 1 \n");


    }

}
