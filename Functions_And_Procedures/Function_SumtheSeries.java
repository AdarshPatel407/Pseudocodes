package Functions_And_Procedures;

/*
Pseudocode - 1+2+3+....+n
FUNCTION sum(n:INTEGER):INTEGER
    DECLARE s:INTEGER
    SET S:=0
    FOR i:=1 TO n
        s:=s+i
    END FOR
    RETURN s
END FUNCTION
PRINT sum(5)

Pseudocode - 1 + (1/2) + (1/3) + ..... + (1/n)
FUNCTION sum(n:INTEGER):REAL
    DECLARE s:REAL
    SET S:=0
    FOR i:=1 TO n
        s:=s+(1/i)
    END FOR
    RETURN s
END FUNCTION
PRINT sum(5)
 */
public class Function_SumtheSeries {
    static int sumSeries1(int n){
        int s = 0;
        for(int i=1 ; i<=n ; i++)
            s+=i;
        return s;
    }
    static double sumSeries2(int n){
        double s = 0;
        for(double i=1 ; i<=n ; i++)
            s+=(1/i);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sumSeries1(5));
        System.out.println(sumSeries2(2));
    }
}