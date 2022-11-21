/**
 * Просто, удалите пробелы из строки, затем верните результирующую строку.
 */

public class NoSpace {
    public static void main(String[] args) {
        System.out.println(notSpace("This is no Space, Im good man!"));
    }
    public static String notSpace(final String x) {
        return x.replaceAll("\\s", "");
    }
}

