import java.util.Scanner;
import java.util.Locale;



public class Ex_fix_4 {

    public static class CurrencyConverter{
        public  double valor_real;
        public double total_dolar;
        public double valor_conversão = 5.5;
        public static final double IOF = 0.06;

        public double conversao(Double valor_real){
            total_dolar = (valor_real / valor_conversão) - (valor_real / valor_conversão) * IOF;
            return total_dolar;
        }

        public void info(){
            System.out.println("Preço do dolar: " + valor_conversão);
            System.out.printf("Você comprou %.2f" ,total_dolar);
        }

    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double valor_real;

        // intanciando o objeto
        CurrencyConverter conversor = new CurrencyConverter();

        // enter variables
        System.out.println("Enter the value in real: \n");
        valor_real= sc.nextDouble();
        System.out.println("------------------------------------");


        conversor.conversao(valor_real);
        conversor.info();
    }


}
