package Loops;
/*
Pseudocode
DECLARE i:INTEGER
SET i:= 1
REPEAT
    PRINT i
    INCREMENT i
UNTIL i<=10
 */
public class RepeatUntil_OneToTen {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i+=1;
        }
        while(i<=10);
    }
}

