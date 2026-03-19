package Questions;
/*
Pseudocode
INTEGER p,q,r,s
SET p:=4, q:=2, r:=1
s=(p AND q) OR (r+1)
PRINT s
 */
public class Ques_11 {
    public static void main(String[] args) {
        int p=4, q=2, r=1,s;
        s= (p&q)|(r+1);
        System.out.println(s);
    }
}