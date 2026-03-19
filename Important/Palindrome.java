package Important;

/*
Pseudocode
DECLARE num:INTEGER
DECLARE a:INTEGER
DECLARE b:INTEGER
DECLARE n:INTEGER
SET b:=0
READ num
SET n:=num
WHILE num>0
    a=num MOD 10
    b=b*10+a
    num:=num/10
END WHILE
IF n==b THEN
    PRINT "Palindrome"
ELSE
    PRINT "Not Palindrome"
 */
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(), a, b=0,n=num;
        while(num>0){
            a=num%10;
            b=(b*10)+a;
            num/=10;
        }
        if(b==n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}