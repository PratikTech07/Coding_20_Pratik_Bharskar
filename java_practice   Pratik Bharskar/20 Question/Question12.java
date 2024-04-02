public class Question12 {
    public static void rotateLeftByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Nothing to rotate
        }

        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(array);

        rotateLeftByOne(array);

        System.out.println("Array after left rotation by 1 position:");
        printArray(array);
    }



}
