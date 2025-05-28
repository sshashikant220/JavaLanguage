public class MutableString2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("abcdefghijklmnop");

        System.out.println(sb.capacity()); // Check total capacity of String
        System.out.println(sb.length()); // Check length of String
        sb.append("s");
        System.out.println(sb.capacity()); // Check total capacity of String
        System.out.println(sb.length()); // Check length of String
    }

}
