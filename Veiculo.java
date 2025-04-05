package Carro;
import java.util.Scanner;

public class Veiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.println("Digite a marca do carro: ");
            carro.marca = scanner.nextLine();

        System.out.println("Digite o modelo do carro: ");
            carro.modelo = scanner.nextLine();

        System.out.println("Digite o preço do carro: ");
            carro.setPreco(scanner.nextDouble());

        System.out.println(carro.toString());
            scanner.close();

        carro.setPreco(-1500);
            carro.toString();
            scanner.close();

    }
}



