package Pseudocodes.Arrays;

/*
Pseudocode
DECLARE a:ARRAY [5] OF iNTEGER
DECLARE max:INTEGER
FOR i:=0 TO 4
    READ a[i]
END FOR
SET max:=a[0]
FOR i:=0 TO 4
    IF a[i]>max THEN
        max:=a[i]
    END IF
END FOR
PRINT max
 */
import java.util.Scanner;

public class MaxIn1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0; i<a.length;i++)
            a[i] = sc.nextInt();
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(max<a[i])
                max = a[i];
        }
        System.out.println("Max: "+max);
    }
}