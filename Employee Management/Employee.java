package Module1;
import java.util.Scanner;
class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int Id, String Name, double Sal) {
        empId = Id;
        empName = Name;
        salary = Sal;
    }

    void displayEmployee() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of Employee 1");
        System.out.print("ID: ");
        int Id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String Name1 = sc.nextLine();
        System.out.print("Salary: ");
        double Sal1 = sc.nextDouble();

        sc.nextLine();

        System.out.println("\nEnter details of Employee 2");
        System.out.print("ID: ");
        int Id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String Name2 = sc.nextLine();
        System.out.print("Salary: ");
        double Sal2 = sc.nextDouble();

        Employee E1 = new Employee(Id1, Name1, Sal1);
        Employee E2 = new Employee(Id2, Name2, Sal2);

        System.out.println("\nEmployee Details");
        E1.displayEmployee();
        E2.displayEmployee();

    }
}
