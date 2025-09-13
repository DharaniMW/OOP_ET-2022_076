import java.util.Scanner;

public class Q5 {
    double radius;

    public Q5(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();
        System.out.println("Enter the radius of the inner circle (ri): ");
        double ri = scanner.nextDouble();

        Q5 outerCircle = new Q5(ro);
        Q5 innerCircle = new Q5(ri);

        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();
        double shadedArea = outerCircleArea - innerCircleArea;

        System.out.printf("The area of the circular region is: %.2f\n", shadedArea);

    }
}