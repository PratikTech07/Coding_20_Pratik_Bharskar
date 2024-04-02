import java.sql.SQLOutput;

public class Question1 {
    public static void main(String args[]){
        int num = 10293;
        int revnum = 0;
        while(num > 0  ){
            int temp = num % 10 ;
            num /= 10 ;
            revnum = (revnum * 10) + temp ;
        }
        System.out.println(revnum);
    }
}
