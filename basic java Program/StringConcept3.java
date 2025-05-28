public class StringConcept3 {

    public static void main(String[] args) {

        String str = "pwskills";
        String str1 = new String("pwskills");

        System.out.println(str1 == str);
        System.out.println(str.equals(str1));

    }
}