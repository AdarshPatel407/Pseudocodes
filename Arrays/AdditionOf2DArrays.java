
/*
Pseudocode
DECLARE x: ARRAY [3][3] of INTEGER
DECLARE y: ARRAY [3][3] of INTEGER
DECLARE z: ARRAY [3][3] of INTEGER
FOR r:=0 TO 2
    FOR c:=0 TO 2
        READ x[r][c]
        READ y[r][c]
    END FOR
END FOR
FOR r:=0 TO 2
    FOR c:=0 TO 2
        z[r][c]:=x[r][c]+y[r][c]
    END FOR
END FOR
FOR r:=0 TO 2
    FOR c:=0 TO 2
        PRINT z[r][c]
    END FOR
END FOR
 */

package Pseudocodes.Arrays;
import java.util.Scanner;

public class AdditionOf2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        int[][] z = new int[3][3];
        for (int r = 0; r < x.length; r++)
            for (int c = 0; c < x.length; c++){
                x[r][c] = sc.nextInt();
                y[r][c] = sc.nextInt();
            }
        for (int r = 0; r < x.length; r++)
            for (int c = 0; c < x.length; c++){
                z[r][c]=x[r][c]+y[r][c];
            }
        for (int r = 0; r < x.length; r++) {
            for (int c = 0; c < x.length; c++)
                System.out.print(z[r][c]+"\t");
            System.out.println();
        }
    }
}

