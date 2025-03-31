package SSolid.Exemplo2;

import java.io.*;
import java.util.Scanner;

public class ProcessadorEncomendas {

    public void processar() {
        // Criando instâncias
        EntradaEncomenda entrada = new EntradaEncomenda();
        CalcularFrete calcularFrete = new CalcularFrete();
        ArquivoSalvar salvar = new ArquivoSalvar();

        // Obtendo o ID da encomenda do usuário
        String idEncomenda = entrada.obterId();

        // Obtendo o peso da encomenda do usuário
        double peso = entrada.obterPesoEncomenda();

        // Calculando o valor do frete com base no peso informado
        double valorFrete = calcularFrete.calcularFrete(peso);
        System.out.println("Valor do frete calculado: "+valorFrete);

        // Salvando os dados da encomenda no arquivo
        salvar.salvarEmArquivo(idEncomenda, valorFrete);
    }
}
