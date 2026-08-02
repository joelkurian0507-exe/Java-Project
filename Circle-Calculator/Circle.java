import java.util.Scanner;
public class Main {

    double radius;

    Main(double r) {
        radius = r;
    }

    void display() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        Main c = new Main(r);
        c.display();

        sc.close();
    }
}
