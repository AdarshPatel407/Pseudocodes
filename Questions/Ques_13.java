package Questions;
/*
Pseudocode
DECLARE p: INTEGER
DECLARE q: INTEGER
DECLARE r: INTEGER
SET q:=30,p:=10,r:=20
if(r>(r+p))
    q:=1
ELSE
    p:=p-2
    r:=r-2
END IF
IF(r>(q+p)||1)
    q:=(0^5)
ELSE
    p:=p+2
    r:=p+2
END IF
PRINT p+q+r
 */
public class Ques_13 {
    public static void main(String[] args) {
        int p=10, q=30, r=20;
        if(r>(r+p))
            q=1;
        else {
            p=p-2;
            r=r-2;
        }
        if(r>(q+p)||true){
            q=(0^5);}
        else {
            p=p+2;
            r=p+2;
        }
        System.out.println(p+q+r);
    }
}