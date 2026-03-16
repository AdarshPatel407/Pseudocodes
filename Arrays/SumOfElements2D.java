package Pseudocodes.Arrays;
/*
Pseudocode
DECLARE a: ARRAY [2][2] of INTEGER
DECLARE sum:INTEGER
SET sum:=0
FOR r:=0 TO 1
    FOR c:=0 TO 1
        READ a[r][c]
    END FOR
END FOR
FOR r:=0 TO 1
    FOR c:=0 TO 1
        sum:= sum+a[r][c]
    END FOR
END FOR
PRINT sum
 */
import java.util.*;

public class SumOfElements2D {
  public static void main(String[] args) {
    
  
    Scanner sc=new Scanner(System.in);
    int[][] a=new int[2][2];
    int sum=0;
     for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
          a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
          sum=sum+a[i][j];
        }
    }
    System.out.println(sum);
}
}
