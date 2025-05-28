public class JaggedArray2 {

    public static void main(String[] args) {

        int arr[][] = new int[3][];

        arr[0] = new int[4];
        arr[1] = new int[3]; // user input jagged array
        arr[2] = new int[2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3; // user input jagged array
        arr[0][3] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[2][0] = 8;
        arr[2][1] = 9;

        System.out.println("User input jagged array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // arr[i][j] = (i + 1) * (j + 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

}
