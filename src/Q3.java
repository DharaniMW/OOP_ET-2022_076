import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a value: ");
        double value = input.nextDouble();
        input.close();

        double inches = value/2.54;
        int feet = (int) inches/12;
        int remain = (int) inches % 12;

        System.out.printf("%.2f value = %d feet %d inches%n", value,feet,remain);


    }
}
