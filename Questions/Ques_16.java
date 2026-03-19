package Questions;
/*
Pseudocode
INTEGER funn(INTEGER a, INTEGER b, INTEGER c)
    for(each c from 3 to 5)
        a=(c+c)^b
        IF (a+c)<(c+a) Then
            b=(a+11)+c
        ELSE
            c=b+b
            a=3+b
            CONTINUE
        END IF
    END FOR
RETURN a+b
 */
public class Ques_16 {
    static int funn(int a, int b, int c){
        for(c=3;c<=5;c++){
            a=(c+c)^b;
            if((a+c)<(c+a))
                b=(a+11)+c;
            else {
                c=b+b;
                a=3+b;
                continue;
            }
        }
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(funn(4,4,7));
    }
}