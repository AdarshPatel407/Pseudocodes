package Questions;
/*
Pseudocode
Integer a,b,c
Set a=7,b=6,c=5
b=a+b
if((b+c)<(c-b)&&2<a)
    c=11+a
End if
c=(b+a)+a
if((a&9)<b)
    b=(a&a)+c
End if
Print a+b+c
 */
public class Ques_05 {
    public static void main(String[] args) {
        int a=7, b=6, c=5;
        b=a+b;
        if((b+c)<(c-b)&&2<a)
            c=11+a;
        c=(b+a)+a;
        if((a&9)<b)
            b=(a&a)+c;
        System.out.println(a+b+c);
    }
}