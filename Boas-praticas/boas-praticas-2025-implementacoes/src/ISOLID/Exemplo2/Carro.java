package ISOLID.Exemplo2;

public class Carro implements VeiculoTerrestre { // assim a classe não precisa implementar métodos que não precisa
    @Override
    public void dirigir() {
        System.out.println("Carro está dirigindo na estrada...");
    }

}
