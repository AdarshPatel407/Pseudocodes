package Questions;
/*
Pseudocode
INTEGER x,y
SET x:=4, y:=8
DO
    PRINT x
    x:=x+y+1
WHILE x<15 LOOP
END DO WHILE
 */
public class Ques_09 {
    public static void main(String[] args) {
        int x=4,y=8;
        do{
            System.out.println(x);
            x=x+y+1;
        }
        while(x<15);
    }
}