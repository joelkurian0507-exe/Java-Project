package Module1;

import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    Book(String t, String a, double p) {
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

        Book b1 = new Book(t1, a1, p1);
        Book b2 = new Book(t2, a2, p2);

        System.out.println("\nBook Details");
        b1.display();
        b2.display();
    }
}
