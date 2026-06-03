import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int n =sc.nextInt();

        if( n % 4 == 0){
            if( n % 400 == 0){
                if( n % 100 != 0){
                    System.out.println("It is a Leap Year");
                } else {
                    System.out.println("It is not a Leap Year");
                }
            }else {
                System.out.println("It is a Leap year");
            }
        }
        else{
            System.out.println("It is not a Leap Year");
        }
        sc.close();
    }
}
