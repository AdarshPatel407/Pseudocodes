package Important;

/*
Pseudocode
DECLARE num:INTEGER
DECLARE a:INTEGER
DECLARE b:INTEGER
SET b:=0
READ num
WHILE num>0
    a=num MOD 10
    b=b*10+a
    num:=num/10
END WHILE
PRINT b
 */
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(), a, b=0;
        while(num>0){
            a=num%10;
            b=(b*10)+a;
            num/=10;
        }
        System.out.println(b);
    }
}