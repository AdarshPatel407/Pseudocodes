package Loops;

/*
Pseudocode
DECLARE sum:REAL
DECLARE i:REAL
DECLARE n:REAL
SET sum:=0
SET i:=1
READ n
WHILE i<=n
    sum:=sum+(1/(i*i))
    INCREMENT i
END WHILE
PRINT sum
 */

import java.util.Scanner;
public class While_SquareReciprocalSumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum=0, i=1, n=sc.nextInt();
        while(i<=n)
        {
            sum+=1/(i*i);
            i+=1;
        }
        System.out.println("Sum: "+sum);
    }
}
