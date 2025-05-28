public class StringCase3 {

    public static void main(String[] args) {

        String str1 = "PWSKILLS JAVA";

        String str2 = " ";
        String Sarr[] = str1.split(" ");

        for (String str3 : Sarr) {
            for (int i = str3.length() - 1; i >= 0; i--) {
                str2 = str2 + str3.charAt(i) + " ";

            }

        }
        System.out.println("before Swapping:" + str1);
        System.out.println("after Swapping:" + str2);

    }

}
