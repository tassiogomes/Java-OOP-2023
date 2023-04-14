import java.util.Scanner;
import java.util.Locale;

public class ex2 {

    public static class Product {
        public String name;
        public double price;
        public int quantity;

        public double TotalValueInStock() {
            double total_value = (quantity * price);
            return total_value;
        }

        public void AddProducts(int quantity){
            this.quantity += quantity;         // o this está trazendo o quantity da classe produto e adicionando o quantity do método.
        }

        public void RemoveProducts(int quantity){
            this.quantity -= quantity;
        }

        public String toString(){
            return name;
        }

    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

                                                        // declara a variável prod do tipo Products (método)
        Product product = new Product();                   // instanciando o método Products

        // input variables
        System.out.println("Enter the name of the product: ");
        product.name = input.nextLine();
        System.out.println("Enter the price of the product: ");
        product.price = input.nextDouble();
        System.out.println("Enter the quantity of products: ");
        product.quantity = input.nextInt();
        // print the entered variables    
        System.out.println(product.name + ", " + product.price + ", " + product.quantity);





        

    }
}
