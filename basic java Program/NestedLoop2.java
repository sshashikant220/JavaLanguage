import java.util.Scanner;

public class NestedLoop2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Fixed: Use print instead of println
                }
            }
            System.out.println(); // Add newline after each row
        }
    }
}
