import java.util.*;

public class StringBuffer {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Virat");

        // String buffer or String Builder not allow write like a immutable string s
        // StringBuffer sb= "Kohli"
        sb.append("Kohli");
        System.out.println(sb);

    }

}
