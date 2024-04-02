import java.util.Scanner;
public class Question19 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Enter the target element :");
        int target = sc.nextInt();
        for(int i = 0; i< arr.length; i++ ){
            for(int j = i+1; j< arr.length; j++){
                if((arr[i]+arr[j]) == target){
                    System.out.println("Index "+i+" and "+j+" ");
                }
            }
        }
    }
}
