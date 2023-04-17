import java.util.Scanner;
import java.util.Locale;

public class Example_2 {

    public static class Product {
        public String name;
        public double price;
        public int quantity;

        public double totalValueInStock() {
            double total_value = (quantity * price);
            return total_value;
        }

        public void addProducts(int quantity){
            this.quantity += quantity;         // o this está trazendo o quantity da classe produto e adicionando o quantity do método.
        }

        public void removeProducts(int quantity){
            this.quantity -= quantity;
        }

        public String toString(){
            return name
            + ", $"
            + String.format("%.2f", price)//formatando o price pra duas casas decimais
            + ", "
            + quantity
            + " units, total: $"
            + String.format("%.2f", totalValueInStock());
        }

    }

     public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

                                                        // declara a variável prod do tipo Products (método)
        Product product = new Product();                // instanciando o método Products

        // input variables
        System.out.println("Enter the name of the product: ");
        product.name = input.nextLine();
        System.out.println("Enter the price of the product: ");
        product.price = input.nextDouble();
        System.out.println("Enter the quantity of products: ");
        product.quantity = input.nextInt();
        // print the entered variables 1   
        System.out.println(product.name + ", " + product.price + ", " + product.quantity + "/n");
        System.out.println("Product data: " + product +"/n");
        // print the entered variables UPDATE (AddProduct)
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();                 // entrada de valor na variável quantity para ser inclusa no método AddProduct
        product.addProducts(quantity);                  // chama a instância product da classe Product e atribui a variável quantity à função AddProduct
        System.out.println("Update data: " + product +"/n");
        // print the entered variables REMOVE (RemoveProduct)
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = input.nextInt();                     // entrada de valor na variável quantity para ser inclusa no método RemoveProduct
        product.removeProducts(quantity);               // chama a instância product da classe Product e atribui a variável quantity à função RemoveProduct
        System.out.println("Update data: " + product +"/n");


    }
}
