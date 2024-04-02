public class Question5 {
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int n = nums.length;
        for(int i = 0; i < nums.length/ 2; i++){
            int temp = nums[i];
            nums[i] = nums[n- 1 -i];
            nums[n -1-i] = temp;
        }
        System.out.println(" Reversed arrray \n");
        for(int i= 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
