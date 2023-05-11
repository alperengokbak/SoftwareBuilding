package Lab_11;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int edge1; 
        int edge2;
        int edge3;
        int isittriangle = 0;

        Scanner myObj = new Scanner (System.in);

        System.out.println ("Please enter edge lengths.");
        System.out.print("First:");

        edge1 = myObj.nextInt();
        System.out.print("Second:");
        edge2 = myObj.nextInt();
        System.out.print("Third:");
        edge3 = myObj.nextInt();

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
            System.out.print("These edges form ");
            isittriangle = 1;
        } else {
        isittriangle = 0;
        }

        if (isittriangle == 1) {
            if (edge1 == edge2 && edge2 == edge3 && edge1 == edge3) {
                System.out.println("an equilateral triangle.");
            }
            if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3) {
                System.out.println("an isosceles triangle.");
            }
            if (edge1 != edge2 && edge2 != edge3 && edge1 != edge3) {
                System.out.println("a scalene triangle.");
            }
        }
        if (isittriangle != 1){
        System.out.println("These edges do not form a triangle.");
        }else{
            int perimeter = edge1 + edge2 + edge3;
            System.out.println("Perimeter of this trianle is " + perimeter);
        }
        myObj.close();
    }
}
