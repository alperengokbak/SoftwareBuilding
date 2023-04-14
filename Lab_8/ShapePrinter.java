package Lab_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Alperen Gökbak_21070006205

public class ShapePrinter {
    public static void main(String[] args) {
        String fileName = "Lab_8/shapes.txt";
        List<String> shapeList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                shapeList.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.print("Enter the shape number to print or a negative value to exit: ");
            input = scanner.nextInt();

            if (input > 0 && input <= shapeList.size()) {
                String[] shapeData = shapeList.get(input - 1).split(" ");
                String shapeType = shapeData[0];
                int length = Integer.parseInt(shapeData[1]);

                switch (shapeType) {
                    case "square":
                        printSquare(length);
                        break;
                    case "rectangle":
                        int width = Integer.parseInt(shapeData[2]);
                        printRectangle(length, width);
                        break;
                    case "triangle":
                        printTriangle(length);
                        break;
                    case "circle":
                        printCircle(length);
                        break;
                    default:
                        System.out.println("Invalid shape type.");
                }
            } else if (input > 0) {
                System.out.println("Invalid shape number.");
            }
        } while (input > 0);

        scanner.close();
    }

    private static void printSquare(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printRectangle(int length, int width) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printCircle(int radius) {
        double rSquared = Math.pow(radius, 2);
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) <= rSquared) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

