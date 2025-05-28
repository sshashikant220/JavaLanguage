public class Mutablestring4 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(120);

        System.out.println(sb.capacity());
        sb.append("Java");
        System.out.println(sb.capacity());
        // Trim available capacity of sTRING
        sb.trimToSize();
        System.out.println(sb);

        System.out.println(sb.capacity());

    }

}
