import java.util.Scanner;
import java.util.Locale;



    class Rectangle{
        // declare variables
        public double width;
        public double height;

        public double Area(){

            double area_retangle = (width * height);
            return area_retangle;
        }

        public double Perimeter(){

            double perimeter_rectangle = 2 * (Area());
            //double perimeter_rectangle = 2 * (width * height);
            return perimeter_rectangle;
        }

        public double Diagonal(){

            double diagonal_rectangle =  Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
            return diagonal_rectangle;
        }

        @Override
        public String toString(){
            return String.format("Area = %.2f\n", Area())//formatando o Area pra duas casas decimais
            + String.format("Perimeter = %.2f", Perimeter())//formatando o Perimeter pra duas casas decimais
            + String.format("Diagonal = %.2f", Diagonal());//formatando o Perimeter pra duas casas decimais);
        }
}
public class Ex_Fix_1 { 

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();


        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

    }
}
