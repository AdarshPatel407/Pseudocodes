package Important;

/*
Pseudocode
DECLARE n:INTEGER
DECLARE a:INTEGER
DECLARE d:INTEGER
DECLARE found:BOOLEAN
SET found:= FALSE
READ n
READ d
WHILE n>0
    a:=n MOD 10
    n=n/10
    IF a==d THEN
        found:=TRUE
        BREAK
    END IF
IF found == TRUE THEN
    PRINT "Search Successful"
ELSE
    PRINT "Search Unsuccessful"
END IF
 */
import java.util.Scanner;

public class DigitSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, d;
        boolean found = false;
        n = sc.nextInt();
        d = sc.nextInt();
        while (n > 0) {
            a = n % 10;
            n /= 10;
            if (a == d) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Search Successful");
        else
            System.out.println("Search Unsuccessful");
    }
}