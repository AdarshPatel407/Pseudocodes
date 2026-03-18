package Loops;
/*
Pseudocode
DECLARE i:INTEGER
SET i:= 10
REPEAT
    PRINT i
    DECREMENT i
UNTIL i>=1
 */
public class RepeatUntil_TenToOne {
    public static void main(String[] args) {
        int i = 10;
        do{
            System.out.println(i);
            i-=1;
        }
        while(i>=1);
    }
}
