package Functions_And_Procedures;
/*
Pseudocode
FUNCTION palindrome(num:INTEGER): STRING
    DECLARE a:INTEGER
    DECLARE b:INTEGER
    DECLARE n:INTEGER
    SET b:=0
    SET n:=num
    WHILE num>0
        a=num MOD 10
        b=b*10+a
        num:=num/10
    END WHILE
    IF n==b THEN
        RETURN "Palindrome"
    ELSE
        RETURN "Not Palindrome"
END FUNCTION
PRINT palindrome(12321)
 */
public class Function_Palindrome {
    static String palindrome(int num){
    int a, b = 0, n = num;
        while(num>0)
        {
            a = num % 10;
            b = (b * 10) + a;
            num /= 10;
        }
        if(b==n)
            return ("Palindrome");
        else
            return ("Not Palindrome");
    }

    public static void main(String[] args) {
        System.out.println(palindrome(12321));
        System.out.println(palindrome(1234));
    }
}