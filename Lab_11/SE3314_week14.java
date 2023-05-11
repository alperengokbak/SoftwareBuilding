package Lab_11;

import java.util.Scanner;

public class SE3314_week14 {
    public static void main (String[] args) {
        int edge1; 
        int edge2;
        int edge3;

        Scanner myObj = new Scanner (System.in);

        System.out.println("Please enter edge lengths.");
        System.out.print("First:");
        edge1 = myObj.nextInt();
        System.out.print("Second:");
        edge2 = myObj.nextInt();
        System.out.print("Third:");
        edge3 = myObj.nextInt();

        boolean isTriangle = canFormTriangle(edge1, edge2, edge3);

            if (isTriangle) {
                printTriangleType(edge1, edge2, edge3);
                int perimeter = calculatePerimeter(edge1, edge2, edge3);
                System.out.println("Perimeter of this triangle is " + perimeter);
            } else {
                System.out.println("These edges do not form a triangle.");
                isTriangle = false;
            }
        myObj.close();
    }

    private static boolean canFormTriangle(int edge1, int edge2, int edge3) {
        return edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1;
    }

    private static void printTriangleType(int edge1, int edge2, int edge3) {
        if (isEquilateral(edge1, edge2, edge3)) {
            System.out.println("These edges form an equilateral triangle.");
        } else if (isIsosceles(edge1, edge2, edge3)) {
            System.out.println("These edges form an isosceles triangle.");
        } else {
            System.out.println("These edges form a scalene triangle.");
        }
    }

    private static boolean isEquilateral(int edge1, int edge2, int edge3) {
        return edge1 == edge2 && edge2 == edge3;
    }

    private static boolean isIsosceles(int edge1, int edge2, int edge3) {
        return edge1 == edge2 || edge2 == edge3 || edge1 == edge3;
    }

    private static int calculatePerimeter(int edge1, int edge2, int edge3) {
        return edge1 + edge2 + edge3;
    }
}
