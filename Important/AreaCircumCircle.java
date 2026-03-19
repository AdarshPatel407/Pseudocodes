package Important;

/*
Pseudocode
DECLARE radius : REAL
DECLARE area : REAL
DECLARE circum : REAL
CONSTANT pi := 3.14
READ radius
area := pi*radius*radius
circum := 2*pi*radius
PRINT area
PRINT circum
 */

import java.util.Scanner;

public class AreaCircumCircle {
    public static void main(String[] args) {
        double radius, area, circum, pi=3.14;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        area = pi*radius*radius;
        circum = 2*pi*radius;
        System.out.println("Area: "+area);
        System.out.println("Circumference: "+circum);

    }
}