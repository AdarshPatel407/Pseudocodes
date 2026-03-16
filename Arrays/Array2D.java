package Pseudocodes.Arrays;

/*
Pseudocode
DECLARE a: ARRAY [2][2] of INTEGER
FOR r:=0 TO 1
    FOR c:=0 TO 1
        READ a[r][c]
    END FOR
END FOR
FOR r:=0 TO 1
    FOR c:=0 TO 1
        PRINT a[r][c]
    END FOR
END FOR
 */
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a=new int[2][2];
        for(int r=0 ; r<a.length ; r++)
            for(int c=0 ; c<a[0].length ; c++)
                a[r][c] = sc.nextInt();
        for(int r=0 ; r<a.length ; r++){
            for(int c=0 ; c<a[0].length ; c++)
                System.out.print(a[r][c]+" ");
            System.out.println();
        }
    }
}