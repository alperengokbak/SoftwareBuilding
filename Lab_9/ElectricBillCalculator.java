package Lab_9;

import java.util.Scanner;

public class ElectricBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly energy consumption in kWh: ");
        float energyConsumption = scanner.nextFloat();

        System.out.print("Enter the type of electricity usage (1 for Residential, 2 for Industrial, 3 for Communal): ");
        int usageType = scanner.nextInt();

        UsageCategory category = UsageCategory.fromInt(usageType);
        float bill = category.calculateElectricBill(energyConsumption);
        System.out.printf("The electric bill total is: %.2f%n", bill);

        scanner.close();
    }
}

enum UsageCategory {
    RESIDENTIAL(new float[]{0.15f, 0.20f, 0.25f}, new float[]{120, 240, 1000}),
    INDUSTRIAL(new float[]{0.12f, 0.15f, 0.23f}, new float[]{120, 240, 1000}),
    COMMUNAL(new float[]{0.10f, 0.15f, 0.20f}, new float[]{120, 240, 1000});

    private final float[] rates;
    private final float[] thresholds;

    UsageCategory(float[] rates, float[] thresholds) {
        this.rates = rates;
        this.thresholds = thresholds;
    }

    public static UsageCategory fromInt(int value) {
        return UsageCategory.values()[value - 1];
    }

    public float calculateElectricBill(float energyConsumption) {
        float bill = 0.0f;

        for (int i = 0; i < thresholds.length; i++) {
            float rate = rates[i];
            float threshold = thresholds[i];
            float prevThreshold = i > 0 ? thresholds[i - 1] : 0;

            if (energyConsumption > prevThreshold) {
                float consumptionForRate = Math.min(energyConsumption - prevThreshold, threshold - prevThreshold);
                bill += consumptionForRate * rate;
                energyConsumption -= consumptionForRate;
            }
        }

        return bill;
    }
}
