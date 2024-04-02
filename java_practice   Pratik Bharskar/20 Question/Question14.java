import java.util.Arrays;
public class Question14 {
    public static void main(String args[]){
        int arr[] = {1,3,45,3,53,2,24,54,3,3,5,6};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int arr2[] = new int[n];
        arr2[0] = arr[0];
        int i = 1 , j = 1;
        while( i < n ){
            if(arr[i] != arr[j - 1]){
                arr2[j] = arr[i];
                j++;
            }
            i++;
        }
        for(int k = 0; k < n ; k++){
            System.out.print(arr2[k]+" ");
        }

    }
}
