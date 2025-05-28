public class ReverseString {
    public static void main(String[] args) {

        String str = "pwskills";
        String str2 = " ";

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }
        System.out.println("Before Reversing :" + str);
        System.out.println("After Reversing" + str2);
    }

}
