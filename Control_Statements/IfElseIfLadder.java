package Pseudocodes.Control_Statements;

/*
Pseudocode
DECLARE marks: REAL
READ marks
IF marks >= 90 THEN
    PRINT "Grade A"
ELSE IF marks >= 75 THEN
    PRINT "Grade B"
ELSE IF marks >= 60 THEN
    PRINT "Grade C"
ELSE IF marks >= 50 THEN
    PRINT "Grade D"

ELSE
    PRINT "Fail"
END IF
 */
import java.util.*;
public class IfElseIfLadder{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double marks=sc.nextDouble();
         if(marks>=90)
            System.out.println("Grade A");
        else if(marks>=75)
            System.out.println("Grade B");
        else if(marks>=60)
            System.out.println("Grade C");
        else if(marks>=50)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }
}

