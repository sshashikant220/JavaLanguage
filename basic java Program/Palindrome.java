import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Name ");
        String str1 = "nitin";
        String str2 = " ";

        for (int i = str1.length() - 1; i >= 0; i--) {

            str2 = str2 + str1.charAt(i) + "";

        }
        if (str2.equals(str1)) {
            System.out.println(str2 + " is a palindrome");
        } else {
            System.out.println(str2 + " is not a palindrome");
        }
    }
}