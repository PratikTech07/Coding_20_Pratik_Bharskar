public class Question21 {
    public static void main(String[] args) {
        int arr[] = {4,5,0,1,9,0};
        int index = 0;
        int count = 0;
        int n =arr.length -1;
        for(int i = n; i > 0; i--) {
            if(arr[i] == 0 ) {
                if(i != n) {
                    int temp = arr[i];
                    for(int j= i+1; j <= n - count; j++) {
                        arr[j -1] = arr[j];
                    }
                    arr[n - count] = temp;
                }
                count++;
            }
        }
        for(int x : arr) {
            System.out.print(x+" ");
        }
    }

}
