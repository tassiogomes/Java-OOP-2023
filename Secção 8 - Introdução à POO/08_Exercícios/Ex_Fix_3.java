    import java.util.Scanner;

    import javax.sound.sampled.SourceDataLine;

    import java.util.Locale;

    // nomealuno, grade1, grade2, grade3, 

    public class Ex_Fix_3 {

        public static class Student{

            public String name;
            public double grade1;
            public double grade2;
            public double grade3;

        // grade calculator

        public double Grade(){
            double final_grade = (((grade1*0.3) + (grade2*0.3) + (grade3*3.5))/3);
            return final_grade;
        }

        public void Check(double final_grade){

            if(final_grade >= 60){
                System.out.println("PASS");
            }else{
                System.out.println("FAILED");
                System.out.printf("MISSING %.2f POINTS%n", 60.0 - final_grade);
            }
        }

    }

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Student student = new Student(); // instanciando a classe Student

            // enter variables
            System.out.println("Enter the name of the student: \n");
            student.name = sc.next();
            System.out.println("\nEnter the grade 1: ");
            student.grade1 = sc.nextDouble();
            System.out.println("\nEnter the grade 2: ");
            student.grade2 = sc.nextDouble();
            System.out.println("\nEnter the grade 3: ");
            student.grade3 = sc.nextDouble();


            double final_grade = student.Grade();       // crio uma variável e digo que ela é o resultado do método Grade.
            System.out.printf("\nFinal grade: %.2f\n", final_grade);
            student.Check(final_grade);                 // chamo o método Void e passo o argumento a ser analisado, nesse caso o final_grade


            sc.close();


        }

    }

