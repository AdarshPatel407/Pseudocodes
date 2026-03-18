package Loops;

import java.util.Scanner;

/*
Pseudocode
DECLARE sum:INTEGER
DECLARE i:INTEGER
DECLARE n:INTEGER
SET sum:=0
SET i:=1
READ n
WHILE i<=n
    sum:=sum+i*i
    INCREMENT i
END WHILE
PRINT sum
 */

public class While_SquareSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0, i=1, n=sc.nextInt();
        while(i<=n)
        {
            sum+=i*i;
            i+=1;
        }
        System.out.println("Sum: "+sum);
    }
}
