import java.util.*;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {

        Person p1 = new Person("Ram", 20);
        Person p2 = new Person("Sita", 16);

        System.out.println(p1);
        System.out.println(p2);

        List<Person> list = Arrays.asList(p1, p2);

        System.out.println("Persons age 18 or above:");

        list.stream()
            .filter(p -> p.age() >= 18)
            .forEach(System.out::println);
    }
}