import java.util.*;
public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer : " );
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");

        }
        sc.close();
    }
}
