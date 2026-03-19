package Important;

/*
Pseudocode
DECLARE n:INTEGER
READ n
FOR i:=2 TO n-1
    IF n MOD i==0 THEN
        PRINT "Not Prime"
        BREAK
    END IF
END FOR
IF n==i THEN
    PRINT "Prime"
END IF
 */
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i;

        for (i=2;i<n;i++)
            if(n%i==0){
                System.out.println("Not Prime");
                break;
            }
        if(n==i)
            System.out.println("Prime");
    }
}