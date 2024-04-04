import java.util.Scanner;

public class calculator {
    private double milesDrivenPerDay;
    private double costPerGallon;
    private double milesPerGallon;
    private double parkingFeesPerDay;
    private double tollsPerDay;

    public calculator() {
        milesDrivenPerDay = 0;
        costPerGallon = 0;
        milesPerGallon = 0;
        parkingFeesPerDay = 0;
        tollsPerDay = 0;
    }

    public void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total miles driven per day:");
        milesDrivenPerDay = sc.nextDouble();
        if (milesDrivenPerDay < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        System.out.println("Enter cost per gallon of gasoline:");
        costPerGallon = sc.nextDouble();
        if (costPerGallon < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        System.out.println("Enter average miles per gallon:");
        milesPerGallon = sc.nextDouble();
        if (milesPerGallon < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        System.out.println("Enter parking fees per day:");
        parkingFeesPerDay = sc.nextDouble();
        if (parkingFeesPerDay < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        System.out.println("Enter tolls per day:");
        tollsPerDay = sc.nextDouble();
        if (tollsPerDay < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }
    }

    public void calculateDailyDrivingCost() {
        double gallonsUsedPerDay = milesDrivenPerDay / milesPerGallon;
        double costOfGasolinePerDay = gallonsUsedPerDay * costPerGallon;
        double totalCostPerDay = costOfGasolinePerDay + parkingFeesPerDay + tollsPerDay;
        System.out.println("Your cost per day for driving to work is: $ " + totalCostPerDay);
    }
}
