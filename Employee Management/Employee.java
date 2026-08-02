import java.util.Scanner;
public class Main {

    int empId;
    String empName;
    double salary;

    Main(int id, String name, double salary) {
        this.empId = id;
        this.empName = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of Employee 1");
        System.out.print("ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Salary: ");
        double salary1 = sc.nextDouble();

        System.out.println("\nEnter details of Employee 2");
        System.out.print("ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Salary: ");
        double salary2 = sc.nextDouble();

        Main emp1 = new Main(id1, name1, salary1);
        Main emp2 = new Main(id2, name2, salary2);

        System.out.println("\nEmployee Details");
        emp1.displayEmployee();
        emp2.displayEmployee();

        sc.close();
    }
}
