import java.util.Scanner;
public class Question3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int old = num;
        int revnum = 0;
        while(num > 0  ){
            int temp = num % 10 ;
            num /= 10 ;
            revnum = (revnum * 10) + temp ;
        }
        if(revnum == old){
            System.out.println("Number is palindrome");
        }else
            System.out.println("Number not palindrome");
    }
}
