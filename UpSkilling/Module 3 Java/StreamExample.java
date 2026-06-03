import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> even = list.stream()
                                 .filter(n -> n % 2 == 0)
                                 .collect(Collectors.toList());

        System.out.println(even);
    }
}