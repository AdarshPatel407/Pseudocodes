package Pseudocodes.Arrays;

/*
Pseudocode
DECLARE a:ARRAY [5] OF iNTEGER
DECLARE min:INTEGER
FOR i:=0 TO 4
    READ a[i]
END FOR
SET min:=a[0]
FOR i:=0 TO 4
    IF a[i]<min THEN
        min:=a[i]
    END IF
END FOR
PRINT min
 */
import java.util.Scanner;

public class MinIn1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0; i<a.length;i++)
            a[i] = sc.nextInt();
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(min>a[i])
                min = a[i];
        }
        System.out.println("Min: "+min);
    }
}
