package Loops;

/*
Pseudocode
DECLARE i:INTEGER
SET i:= 1
WHILE i<=10
    PRINT i
    INCREMENT i
END WHILE
 */
public class While_OneToTen {
    public static void main(String[] args) {
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i+=1;
        }
    }
}
