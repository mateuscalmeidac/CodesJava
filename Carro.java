package Carro;

public class Carro {

    public String marca;
    protected String modelo;
    private double preco;

    public Carro() {
        this.marca = marca;
        this.modelo = modelo;
        setPreco(preco);
    }

    public void exibir() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(preco);
    }

    public double getPreco(int i) {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido");
        } else {
            this.preco = preco;
        }
    }
}
//
//    public double getPreco() {
//        return preco;
//    }
//
//    public Carro() {
//        this.marca = marca;
//        this.modelo = modelo;
//        this.preco = preco;
//    }
//
//    public void setPreco(double preco) {
//        if (preco <= 0) {
//            System.out.println("ERRO, DIGITE UM VALOR MAIOR QUE ZERO: ");
//
//        } else {
//            this.preco = preco;
//        }
//    }
//    public static String main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        Carro carro = new Carro();
//
//        System.out.println("Digite a marca do carro: ");
//        carro.marca = scanner.nextLine();
//
//        System.out.println("Digite o modelo do carro: ");
//        carro.modelo = scanner.nextLine();
//
//        System.out.println("Digite o preço do carro: ");
//        carro.preco = scanner.nextDouble();
//
//        System.out.println(carro.toString());
//        scanner.close();
//
//        carro.setPreco(-1500);
//        carro.toString();
//        scanner.close();
//
//        String toString;
//     ;   ;;
//        return "Marca: " + marca + ", Modelo: " + modelo + ", Preço: R$ " + preco;
//
//    }
//
//}
//
//
//
