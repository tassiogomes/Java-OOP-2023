import java.util.Scanner;
import java.util.Locale;

public class Ex_Fix_1 { 

    public static class Rectangle{
        // declare variables
        public double width;
        public double height;

        public double Area(){
            double area_retangle = (width * height);
            return area_retangle;
        }

        public double Perimeter(){
            double perimeter_rectangle = 2 * (Area());
            return perimeter_rectangle;
        }

        public double Diagonal(){
            double diagonal_rectangle =  Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
            return diagonal_rectangle;
        }

        @Override
        public String toString(){
            return String.format("Area = %.2f\n", Area())
            + String.format("Perimeter = %.2f\n", Perimeter())
            + String.format("Diagonal = %.2f\n", Diagonal());
        }
    }



        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Rectangle rectangle = new Rectangle();

            System.out.println("Enter the width of the rectangle: ");
            rectangle.width = sc.nextDouble();
            System.out.println("Enter the height of the rectangle: ");
            rectangle.height = sc.nextDouble();

            System.out.println("\nData:");
            System.out.print(rectangle);

            sc.close();
    }
}