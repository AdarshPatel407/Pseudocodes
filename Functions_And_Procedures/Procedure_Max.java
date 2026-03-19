package Functions_And_Procedures;

/*
Pseudocode - Greatest of two
PROCEDURE max(a:INTEGER, b:INTEGER)
    if a>b THEN
        PRINT a
    ELSE
        PRINT b
    END IF
END PROCEDURE
CALL max(12,3)

Pseudocode - Greatest of three
PROCEDURE max(a:INTEGER, b:INTEGER, c:INTEGER)
    IF a>b AND a>c THEN
        PRINT a
    ELSE IF b>a AND b>c THEN
        PRINT b
    ELSE
        PRINT c
    END IF
END PROCEDURE
CALL max(12,3,30)
 */
public class Procedure_Max {
    static void  max(int a, int b){
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
    static void max(int a, int b, int c){
        if(a>b && a>c)
            System.out.println(a);
        else if(b>a && b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }

    public static void main(String[] args) {
        max(12,3);
        max(12,3,30);
    }
}