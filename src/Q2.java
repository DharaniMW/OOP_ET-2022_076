import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstname = input.next();
        System.out.println("Enter your middle name: ");
        String middlename = input.next();
        System.out.println("Enter your last name: ");
        String lastname = input.next();
        System.out.println("Full name: " +lastname+", "+firstname+" "+middlename.substring(0,1));

    }
}
