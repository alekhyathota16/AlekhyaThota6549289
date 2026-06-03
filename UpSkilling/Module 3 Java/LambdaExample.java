import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Sita");
        names.add("Amit");
        names.add("Ram");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}