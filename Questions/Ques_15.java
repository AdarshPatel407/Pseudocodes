package Questions;
/*
Pseudocode
INTEGER p,q,r
SET p:=4, q:=6, r:=5;
q= (r^p)&q;
if((6+p)&(7^r)>(q^r))
    p:=p+q
END IF
PRINT p+q+r
*/
public class Ques_15 {
    public static void main(String[] args) {
        int p=4, q=6, r=5;
        q= (r^p)&q;
        if(((6+p)&(7^r))>(q^r))
            p=p+q;
        System.out.println(p+q+r);
    }
}