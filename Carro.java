package sobrescrita;

public class Carro extends Transporte{
    @Override
    public void mover(){
        System.out.println("O fusca está em movimento");
    }
}