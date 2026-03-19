package Questions;
/*
Pseudocode
Integer p,q,r
Set p=4, q=2, r=8
for(each r from 5 to 6)
    p=(r+r)^r
    q=(8+3)+p
End for
for(each r from 5 to 8)
    p=4+r
    p=1+q
End for
Print p+q
 */
public class Ques_04 {
    public static void main(String[] args) {
        int p=4, q=2, r=8;
        for(r=5;r<=6;r++){
            p=(r+r)^r;
            q=(8+3)+p;
        }
        for(r=5;r<=8;r++){
            p=4+r;
            p=1+q;
        }
        System.out.println(p+q);
    }
}