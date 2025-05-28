public class Array2da {

    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }, // given input 2d Array
                { 7, 8, 9 }
        };

        for (int i = 0; i < 3; i++) { // row
            for (int j = 0; j < 3; j++) { // column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
