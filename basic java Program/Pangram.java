public class Pangram {

    public static void main(String[] args) {

        String str = "The Quik Brown fox Jumps over Lazy Dog";

        // remove spaces of string
        str = str.replace(" ", "");

        // String to Lowercase
        str = str.toUpperCase();
        // Convert String to Array

        char[] ch = str.toCharArray();
        // Create a set of unique integer array
        int arr[] = new int[26];

        // create a loop
        for (int i = 0; i < ch.length; i++) {
            // check if the character is alphabet
            arr[ch[i] - 65]++;
        }
        // check array if array any index zerp show array is Not Pangram
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("String is Not Pangram");
            }

        }
        System.out.println("String is Pangram");

    }

}
