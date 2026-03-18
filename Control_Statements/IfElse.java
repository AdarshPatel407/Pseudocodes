package Pseudocodes.Control_Statements;
import java.util.*;
/*
Pseudocode
DECLARE number: INTEGER
READ number
IF number MOD 2 = 0 THEN
    PRINT "The number is even"
ELSE
    PRINT "The number is odd"
END IF
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         if(a%2==0){
            System.out.println("Number is even");
         }else{
            System.out.println("Number is odd");
         }
    }
}
