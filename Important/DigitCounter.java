package Important;

/*
Pseudocode
DECLARE n:INTEGER
DECLARE a:INTEGER
DECLARE d:INTEGER
DECLARE count:INTEGER
SET count:=0
READ n
READ d
WHILE n>0
    a:=n MOD 10
    n:=n/10
    IF a==d THEN
        INCREMENT count
    END IF
END WHILE
PRINT count
 */

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a;
        int count = 0;
        while(n>0){
            a=n%10;
            n/=10;
            if(a==d)
                count+=1;
        }
        System.out.println("Count: "+count);
    }
}