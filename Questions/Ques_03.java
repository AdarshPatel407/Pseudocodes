package Questions;
/*
Pseudocode
Integer a,b,c
Set a=1, b=5, c=7
if((c+b)<(a+c))
    b=a+b
Else
    if((c+9+b)<(6+c))
        c=(3+8)+c
    End if
End if
Print a+b+c
 */
public class Ques_03 {
    public static void main(String[] args) {
        int a=1, b=5, c=7;
        if((c+b)<(a+c))
            b=a+b;
        else
            if((c+9+b)<(6+c))
                c=(3+8)+c;
        System.out.println(a+b+c);
    }
}