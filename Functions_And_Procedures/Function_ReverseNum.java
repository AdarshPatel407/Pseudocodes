package Functions_And_Procedures;

/*
Pseudocode
FUNCTION reverse(n:INTEGER)
    DECLARE a:INTEGER
    DECLARE b:INTEGER
    SET b:=0
    WHILE num>0 LOOP
        a=num MOD 10
        b=b*10+a
        num:=num/10
    END WHILE
    return b
END FUNCTION
PRINT reverse(1234)
 */
public class Function_ReverseNum {
    static int reverse(int n){
        int a, b=0;
        while(n>0){
            a=n%10;
            b= (b*10)+a;
            n = n/10;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}