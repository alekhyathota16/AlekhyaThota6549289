import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String original = str;
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }

        sc.close();
    }
}
