package Functions_And_Procedures;

/*
Pseudocode - Add
PROCEDURE add(a:INTEGER, b:INTEGER)
    PRINT a+b
END PROCEDURE
CALL add(12,3)

Pseudocode - Cube
PROCEDURE cube(a:INTEGER)
    PRINT a*a*a
END PROCEDURE
CALL cube(7)

Pseudocode - Simple Interest
PROCEDURE simInt(pa:INTEGER, roi:REAL, noy:REAL)
    DECLARE si:REAL
    si:=(pa*roi*noy)/100
    PRINT si
END PROCEDURE
CALL simInt(1000,3.4,4.5)
 */
public class Procedure_Math {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void cube(int a){
        System.out.println(a*a*a);
    }
    static void simInt(int pa, double roi, double noy){
        double si = (pa*noy*roi)/100;
        System.out.println(si);
    }
    public static void main(String[] args) {
        add(12,3);
        cube(7);
        simInt(1000, 3.4,4.5);
    }
}