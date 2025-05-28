public class ArrayOutOfBound {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        // System.out.println(arr[5]); // ArrayOutOf BOUND error
        // System.out.println(arr[4]); // Array last vaule

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        for (int n : arr) { // Enhance Loop
            System.out.print(n + " ");
        }

    }
}
