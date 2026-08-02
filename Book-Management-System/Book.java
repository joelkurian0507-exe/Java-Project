import java.util.Scanner;
public class Main {

    String title;
    String author;
    double price;

    Main(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book 1 Details");
        System.out.print("Title: ");
        String t1 = sc.nextLine();
        System.out.print("Author: ");
        String a1 = sc.nextLine();
        System.out.print("Price: ");
        double p1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nEnter Book 2 Details");
        System.out.print("Title: ");
        String t2 = sc.nextLine();
        System.out.print("Author: ");
        String a2 = sc.nextLine();
        System.out.print("Price: ");
        double p2 = sc.nextDouble();

        Main b1 = new Main(t1, a1, p1);
        Main b2 = new Main(t2, a2, p2);

        System.out.println("\nBook Details");
        b1.display();
        b2.display();

        sc.close();
    }
}
