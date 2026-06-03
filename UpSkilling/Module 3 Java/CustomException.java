import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Not eligible (age < 18)");
            }
            System.out.println("Eligible");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
