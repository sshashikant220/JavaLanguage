import java.util.Scanner;

public class ScannerDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Name:" + name);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Your age:" + age);

        System.out.println("Enter your college Name");
        String collegeName = sc.nextLine();

        System.out.println(" college name:" + collegeName);

    }

}
