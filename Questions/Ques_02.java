package Questions;
/*
Pseudocode
Integer p,q,r
Set q=13
for(each p from 1 to 4)
    r=q mod p
    p=p+5
    q=q+r
End For
r=q/5
Print q,r
 */
public class Ques_02 {
    public static void main(String[] args) {
        int p,q,r;
        q=13;
        for(p=1; p<=4; p+=1){
            r=q%p;
            p+=5;
            q+=r;
        }
        r=q/5;
        System.out.println(q+" "+r);
    }
}
