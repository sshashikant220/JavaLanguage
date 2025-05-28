public class ImmutableString {

    public static void main(String[] args) {

        String str = "Hello, World!";
        System.out.println(str);
        str.concat("India"); // This is immutable string they not join or concat other string
        System.out.println(str);
    }

}
