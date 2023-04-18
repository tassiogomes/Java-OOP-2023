import java.util.Scanner;
import java.util.Locale;

public class Ex_Fix_2 { 

    public static class Employee{
        // declare variables
        public String name;
        public double grossSalary;
        public double tax;

        public double NetSalary(){
            grossSalary = grossSalary - tax;
            return grossSalary;
        }

        public void IncreaseSalary(double percentage){
            grossSalary +=  (grossSalary * percentage);
        }

        @Override
        public String toString(){
            return String.format("Employee: %s,  final: %.2f\n", this.name, this.NetSalary());
        }
    }

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Employee employee = new Employee();

            // enter variables
            System.out.println("Enter the name of the employee: \n");
            employee.name = sc.next();
            System.out.println("\nEnter the gross salary: \n");
            employee.grossSalary = sc.nextDouble();
            System.out.print("Tax: ");
            employee.tax = sc.nextDouble();
            System.out.println("Employee: " + employee);

            // enter the increase percentage
            System.out.println("\nWhich percentage to increase salary?(0-100):  \n");
            double percentage = sc.nextDouble();
            employee.IncreaseSalary(percentage);
            System.out.println();
            System.out.println("Updated data: " + employee);

            sc.close();
    }
}