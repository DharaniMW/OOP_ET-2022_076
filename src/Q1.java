import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Odd length Word: ");
        String word = input.next();
        input.close();

        char middleChar = word.charAt(word.length()/2);
        System.out.println("The middle character is: " +middleChar);
    }
}
