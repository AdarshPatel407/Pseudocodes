package Important;

/*
Pseudocode
DECLARE n:INTEGER
DECLARE prev:INTEGER
DECLARE next:INTEGER
DECLARE sum:INTEGER
SET prev:=0
SET next:=1
SET sum:=0
READ n
PRINT prev
PRINT next
WHILE sum<=n
    sum:=prev+next
    PRINT sum
    prev:=next
    next:=sum
END WHILE
 */
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),prev=0,next=1,sum=0;
        System.out.println(prev);
        System.out.println(next);
        while(sum<=n)
        {
            sum=prev+next;
            System.out.println(sum);
            prev=next;
            next=sum;
        }
    }
}