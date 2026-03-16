package Pseudocodes.Arrays;

/*
Pseudocode
DECLARE a: ARRAY [3][3] of INTEGER
DECLARE even:INTEGER
DECLARE odd:INTEGER
SET even:=0
SET odd:=0
FOR r:=0 TO 1
    FOR c:=0 TO 1
        READ a[r][c]
    END FOR
END FOR
FOR r:=0 TO 1
    FOR c:=0 TO 1
        IF a[r][c] MOD 2==0 THEN
            INCREMENT even
        ELSE
            INCREMENT odd
    END FOR
END FOR
PRINT even odd
 */
import java.util.Scanner;
public class EvenOddIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even=0,odd=0;
        int[][] a=new int[3][3];
        for(int r=0 ; r<a.length ; r++)
            for(int c=0 ; c<a[0].length ; c++)
                a[r][c] = sc.nextInt();
        for(int r=0 ; r<a.length ; r++)
            for(int c=0 ; c<a[0].length ; c++){
                if(a[r][c]%2==0)
                    even+=1;
                else
                    odd+=1;
            }

        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}

