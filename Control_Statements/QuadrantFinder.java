
/*
Pseudocode
DECLARE x: INTEGER
DECLARE y: INTEGER
READ x,y
IF x>0 AND y>0 THEN
    PRINT "First Quadrant"
ELSE IF x<0 AND y>0 THEN
    PRINT "Second Quadrant"
ELSE IF x<0 AND y<0 THEN
    PRINT "Third Quadrant"
ELSE IF x>0 AND y<0 THEN
    PRINT "Fourth Quadrant"
ELSE
    PRINT "Origin"
END IF
 */

import java.util.Scanner;

public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>0 && y>0)
            System.out.println("First Quadrant");
        else if(x<0 && y>0)
            System.out.println("Second Quadrant");
        else if(x<0 && y<0)
            System.out.println("Third Quadrant");
        else if(x>0 && y<0)
            System.out.println("Fourth Quadrant");
        else
            System.out.println("Origin");
    }
}
