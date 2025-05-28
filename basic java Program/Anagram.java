import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "School Master";
        String str2 = "The Classroom";

        // first we remove spaces
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        // String Convert to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First Convert String To Arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Useing Shorting algorithm or Shorting method directly
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {

            System.out.println("It is a Anagram");
        } else {
            System.out.println("It is not a Anagram");
        }
    }

}
