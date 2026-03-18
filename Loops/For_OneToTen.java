
/*
Pseudocode
DECLARE num:INTEGER
READ num
FOR i:=1 TO 10 STEP 1
    PRINT num*i
END FOR
 */
import java.util.Scanner;

public class For_OneToTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1 ; i<=10 ; i++)
            System.out.println(num*i);
    }
}