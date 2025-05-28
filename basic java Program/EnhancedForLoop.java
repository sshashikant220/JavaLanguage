public class EnhancedForLoop {
    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }, // given input 2d Array
                { 7, 8, 9 }
        };
        System.out.println("Enhanced ForLoop 2D array");
        for (int a[] : arr) { // Enhanced ForLoop 2D aaray
            for (int b : a) {
                System.out.print(b + " ");

            }
            System.out.println();
        }
    }

}
