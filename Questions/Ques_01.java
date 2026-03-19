package Questions;
/*
Pseudocode
Integer p,q,r
r=q+p
if((3+p)<(q+r))
    if((r+q+r)<(q+p+r))
        r=(3+30)+r
    End If
Else
    if((r+q)<(p+r))
        q=12+q
    else
        r=q+p
    End If
    r=(p+q)+r
End If
r=r+r
Print p+q+r
 */
public class Ques_01 {
    public static void main(String[] args) {
        int p=1, q=5,r=7;
        r=q+p;
        if((3+p)<(q+3)) {
            if ((r + q + r) < (q + p + r))
                r = (3 + 30) + r;
            r=(q+1)+q;
        }
        else{
            if((r+q)<(p+r))
                q=12+q;
            else
                r=q+p;
            r=(p+q)+r;
        }
        r=r+r;
        System.out.println(p+q+r);
    }
}
