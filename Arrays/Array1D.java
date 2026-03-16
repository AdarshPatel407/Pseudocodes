

/*
Pseudocode
DECLARE a: ARRAY [0:4] of INTEGER
FOR i:=0 TO 4
    READ a[i]
END FOR
FOR i:=0 TO 4
    PRINT a[i]
END FOR
 */
package Pseudocodes.Arrays;
import java.util.Scanner;


public class Array1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0 ; i<a.length ; i++)
            a[i] = sc.nextInt();
        for(int i=0 ; i<a.length ; i++)
            System.out.print(a[i]+" ");
    }
}
