package Lab_7;

import java.util.Random;

public class RouletteSimulationIfStatments {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(38);

        System.out.println("The number selected is: " + number);

        if (number == 0 || number == 37) {
            System.out.println("Bets on 0 and 00 win.");
            System.out.println("Bets on Red, Black, Odd, Even, 1 to 18, and 19 to 36 lose.");
        } else if (number == 1 || number == 3 || number == 5 || number == 7 || number == 9 || number == 12 ||
                   number == 14 || number == 16 || number == 18 || number == 19 || number == 21 || number == 23 ||
                   number == 25 || number == 27 || number == 30 || number == 32 || number == 34 || number == 36) {
            System.out.println("Bets on Red win.");
            System.out.println("Bets on Black, Odd, Even, 1 to 18, and 19 to 36 lose.");
        } else {
            System.out.println("Bets on Black win.");
            System.out.println("Bets on Red, Odd, Even, 1 to 18, and 19 to 36 lose.");
        }

        if (number == 0 || number == 37) {
            System.out.println("Bets on 0 and 00 win 35 to 1.");
        } else {
            System.out.println("Bets on single number " + number + " win 35 to 1.");
        }

        if (number % 2 == 0 && number != 0 && number != 37) {
            System.out.println("Bets on Even win 1 to 1.");
            System.out.println("Bets on Odd lose.");
        } else if (number % 2 == 1) {
            System.out.println("Bets on Odd win 1 to 1.");
            System.out.println("Bets on Even lose.");
        }

        if (number >= 1 && number <= 18) {
            System.out.println("Bets on 1 to 18 win 1 to 1.");
            System.out.println("Bets on 19 to 36 lose.");
        } else if (number >= 19 && number <= 36) {
            System.out.println("Bets on 19 to 36 win 1 to 1.");
            System.out.println("Bets on 1 to 18 lose.");
        }
    }
}