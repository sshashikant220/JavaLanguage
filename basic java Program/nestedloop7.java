import java.util.Scanner;

public class nestedloop7 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1 || i + j == (n - 1) / 2
                        || i - j == (n - 1) / 2 || i + j == (n - 1) + (n - 1) / 2 || j - i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

}
