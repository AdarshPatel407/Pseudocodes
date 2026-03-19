package Questions;
/*
Pseudocode
INTEGER funn(INTEGER a, INTEGER b)
    INTEGER c
    SET c=a+a+b+b
    b=c+c+b+b
    a=b-a
    RETURN a+b
END FUNCTION funn()
 */
public class Ques_17 {
    static int funn(int a, int b){
        int c = a+a+b+b;
        b = c+c+b+b;
        a = b-a;
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(funn(4,4));
    }
}