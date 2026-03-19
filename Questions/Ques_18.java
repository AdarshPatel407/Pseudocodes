package Questions;
/*
Pseudocode
INTEGER funn(INTEGER a, INTEGER b, INTEGER c)
    IF((c&a)<a && (a^b)<b)
        c=(a^2)+b
    END IF
    RETURN a+b+c
END funn
 */
public class Ques_18 {
    static int funn(int a, int b, int c){
        if((c&a)<a && (a^b)<b)
            c=(a^2)+b;
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(funn(5,5,5));
    }
}