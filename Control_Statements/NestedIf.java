package Pseudocodes.Control_Statements;
/*
Pseudocode
DECLARE number: INTEGER
READ number
IF number >= 0 THEN
    IF number = 0 THEN
        PRINT "The number is zero"
    ELSE
        PRINT "The number is positive"
    END IF
ELSE
    PRINT "The number is negative"
END IF
 */
import java.util.*;
public class NestedIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=0){
            if(num==0){
                System.out.println("Number is Zero");
            }else
                System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
    }
    
}
