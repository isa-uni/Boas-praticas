package SSolid.Exemplo2;

import java.util.Scanner;

//Responsável por coletar os dados de entrada (ID da encomenda e peso).
public class EntradaEncomenda {

    public String obterId(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            return sc.nextLine();
        }
    }

    public double obterPesoEncomenda(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o peso (em kg): ");
            return sc.nextDouble();
        }
    }
}
