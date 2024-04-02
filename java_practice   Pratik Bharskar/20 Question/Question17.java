import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int n = sc.nextInt();
        int num = n;
        int sum = 0;

        while (n > 0) {
            int i;
            i = n % 10;
            n /= 10;
            sum += i * i * i;

        }
        System.out.println(sum);
        if (sum == num) {
            System.out.println("Number is armstrong");
        } else
            System.out.println("Number is not armstrong");
    }
    }
