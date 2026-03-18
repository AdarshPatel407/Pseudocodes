package Loops;

/*
Pseudocode
DECLARE num:INTEGER
DECLARE fact:INTEGER
SET fact:=1
READ num
FOR i:=num to 1 STEP -1
    fact:=fact*i
END FOR
PRINT fact
 */
import java.util.Scanner;
public class For_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fact;
        num = sc.nextInt();
        fact = 1;
        for(int i=num ; i>0 ; i--)
            fact*=i;
        System.out.println("Factorial: "+fact);
    }
}