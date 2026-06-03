
import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("How many names ?");
        int n =sc.nextInt();
        sc.nextLine();

        for(int i =0;i<n;i++){
            System.out.println("Enter name : ");
            list.add(sc.nextLine());
        }
        System.out.println("Student Names : ");
        for(String name : list){
            System.out.println(name);
        }
        sc.close();
    }
}
