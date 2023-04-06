package Lab_7;

import java.util.Random;

public class RouletteSimulationSwitchCase {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(38);
        String color = getColor(number);
        String bet1 = getBet1(number);
        String bet2 = getBet2(number);
        String bet3 = getBet3(number);

        System.out.println("Number: " + number + " (" + color + ")");
        System.out.println("Bets:");
        System.out.println("- " + bet1);
        System.out.println("- " + bet2);
        System.out.println("- " + bet3);
    }

    public static String getColor(int number) {
        switch (number) {
            case 0:
            case 37:
                return "green";
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 12:
            case 14:
            case 16:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 36:
                return "red";
            default:
                return "black";
        }
    }

    public static String getBet1(int number) {
        if (number == 0 || number == 37) {
            return "Single number: 0 or 00";
        } else {
            return "Single number: " + number;
        }
    }

    public static String getBet2(int number) {
        if (getColor(number).equals("red")) {
            return "Red Or Black: Red";
        } else {
            return "Red Or Black: Black";
        }
    }

    public static String getBet3(int number) {
        if (number == 0 || number == 37 || number % 2 == 0) {
            return "Odd Or Even: Even (0 and 00 do not pay out)";
        } else {
            return "Odd Or Even: Odd";
        }
    }
}
