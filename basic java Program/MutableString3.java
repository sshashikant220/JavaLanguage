public class MutableString3 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Sachin");
        System.out.println(sb);
        System.out.println(sb.capacity());

        // System.out.println(sb.setCharAt(1, A);) // beacuse return property is void
        // that reason we not directly print
        sb.setCharAt(1, 'A');
        System.out.println(sb);
        System.out.println(sb.capacity());

    }

}
