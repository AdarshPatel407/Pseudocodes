package Questions;
/*
Pseudocode
INTEGER a,b,c
SET b=4, c=5
FOR RACH a FROM 2 TO 4 LOOP
    PRINT c
    b:=b-1
    c:=c+b
NEXT FOR
 */
public class Ques_07 {
    public static void main(String[] args) {
        int a, b=4, c=5;
        for(a=2; a<=4 ;a++){
            System.out.println(c);
            b=b-1;
            c=c+b;
        }
    }
}