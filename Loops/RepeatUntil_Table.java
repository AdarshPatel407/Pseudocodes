package Loops;

/*
Pseudocode
DECLARE n:INTEGER
DECLARE i:INTEGER
SET i:= 1
REPEAT
    PRINT n*i
    INCREMENT i
UNTIL i<=10
 */
import java.util.Scanner;

public class RepeatUntil_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(n*i);
            i+=1;
        }
        while(i<=10);
    }
}