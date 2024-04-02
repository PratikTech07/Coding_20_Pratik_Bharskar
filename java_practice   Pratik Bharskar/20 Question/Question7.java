public class Question7 {
    public static void main(String args[]){
        int arr1[] = { 1,2,3,5,7,4,8,5};
        int arr2[] ={2,3,553,3,5,98,43,3};
        for(int i = 0; i <arr1.length; i++){
            for(int j =  0; j< arr2.length; j++){
                if(arr1[i] == arr2[j] ){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
