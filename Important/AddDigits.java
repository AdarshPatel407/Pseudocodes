package Important;

/*
Pseudocode
DECLARE n:INTEGER
DECLARE sum:INTEGER
DECLARE a:INTEGER
SET sum:=0
READ n
WHILE n>0
    a:=n MOD 10
    n:=n/10
    sum:=sum+a
END WHILE
PRINT sum
 */
import java.util.Scanner;
public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int n=sc.nextInt(), sum=0, a;
        while(n>0)
        {
            a = n%10;
            n/=10;
            sum+=a;
        }
        System.out.println("Sum: "+sum);
    }
}