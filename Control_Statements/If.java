package Pseudocodes.Control_Statements;
import java.util.*;
/*
Pseudocode
DECLARE number: INTEGER
READ number
IF number > 0 THEN
    PRINT "The number is positive"
END IF
 */
public class If{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.println("Number is positive");
        }
    }
}