package Questions;
/*
Pseudocode
Integer a,b,c
Set p=5, q=2, r=5
for(each r from 5 to 6)
    p=(r+7)+r
    if((r+q)>(q-r)||r<q)
        q=(p+r)+q
        continue
    End if
End for
print p+q
 */
public class Ques_06 {
    public static void main(String[] args) {
        int p=5, q=2, r=5;
        for(r=5;r<=6;r++)
            if((r+q)>(q-r)||r<q){
                q=(p+r)+q;
                continue;
            }
        System.out.println(p+q);
    }
}