
import java.util.Scanner;

public class GradeCalaculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your Marks : ");
       int n =sc.nextInt();

            if( n <= 100 && n >= 90){
                System.out.println("A");
            }
            else if(n >= 80 && n <= 89){
                System.out.println("B");
            }
            else if(n >= 70 && n <= 79){
                System.out.println("C");
            }
            else if(n>=60 && n <= 69){
                System.out.println("D");
            }
            else if(n >= 0 && n < 60 ){
                System.out.println("F");
            }
            else{
                System.out.println("Invalid Number");
            }
            sc.close();
    }
}
