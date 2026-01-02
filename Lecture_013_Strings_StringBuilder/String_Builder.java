import java.lang.StringBuilder;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");

        System.out.println(sb);

        sb.append(" Programming");

        System.out.println(sb);

        sb.insert(5, "is the best ");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

        System.out.println(sb.charAt(0));

    }
}
