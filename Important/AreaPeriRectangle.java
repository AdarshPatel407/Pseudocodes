package Important;

import java.util.Scanner;

/*
Pseudocode
DECLARE length : REAL
DECLARE breadth : REAL
DECLARE area : REAL
DECLARE peri : REAL
READ length
READ breadth
area := length*breadth
peri := 2*(length+breadth)
PRINT area
PRINT peri
 */



public class AreaPeriRectangle {
    public static void main(String[] args) {
        double length, breadth, area, peri;
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        area = length*breadth;
        peri = 2*(length+breadth);
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+peri);

    }
}