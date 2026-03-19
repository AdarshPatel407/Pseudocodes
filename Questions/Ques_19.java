package Questions;
/*
Pseudocode
INTEGER funn(INTEGER a, INTEGER b, INTEGER c)
    FOR(each c from 4 to 8)
        a=(a+11)+b
        a=(c+3)+b
    END FOR
    b=(5+10)+a
    a=(10+8)+a
    FOR(each c from 2 to 5)
        a=(10+2)&a
        b=(3+4)+a
    END FOR
    RETURN a+b
END funn
 */
public class Ques_19 {
    static int funn(int a, int b, int c) {
        for (c = 4; c <= 8; c++) {
            a = (a + 11) + b;
            a = (c + 3) + b;
        }
        b = (5 + 10) + a;
        a = (10 + 8) + a;
        for (c = 2; c <= 5; c++) {
            a = (10 + 2) & a;
            b = (3 + 4) + a;
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(funn(6,9,2));
    }
}