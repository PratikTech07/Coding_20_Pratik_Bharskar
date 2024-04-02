import java.util.Scanner;
public class Question2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c;
        int n = sc.nextInt();
        int i = 0;
        System.out.print(a+" "+b+" ");
        while(i < n - 2){
            c = a + b;
            a = b;
            b = c;
            i++;
            System.out.print(c+" ");
        }


    }
}
