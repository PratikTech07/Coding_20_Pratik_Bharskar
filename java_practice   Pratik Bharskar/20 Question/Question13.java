public class Question13 {

    public static void rotateLeftByK(int[] arr, int k) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        k = k % n;
        if (k == 0) {
            return;
        }

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;


        System.out.println("Original array:");
        printArray(array);


        rotateLeftByK(array, k);


        System.out.println("Array after left rotation by " + k + " positions:");
        printArray(array);
    }



}
