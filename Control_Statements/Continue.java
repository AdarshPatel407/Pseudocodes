package Pseudocodes.Control_Statements;
/*
Pseudocode
DECLARE i:= INTEGER
FOR i:=1 TO 10
    IF i==5 THEN
        CONTINUE
    END IF
    PRINT i
END FOR
 */
public class Continue {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i==5)
                continue;

            System.out.println(i);
        }
    }
}
