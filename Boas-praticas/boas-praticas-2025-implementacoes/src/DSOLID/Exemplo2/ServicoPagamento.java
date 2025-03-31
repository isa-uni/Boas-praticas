package DSOLID.Exemplo2;

public class ServicoPagamento {
    private ILogger iLogger;

    public ServicoPagamento(ILogger iLogger) {
        this.iLogger = iLogger;
    }

    public void pagar(double valor) {
        // Lógica de pagamento, com dependência indireta
        iLogger.log("Pagamento de R$" + valor + " realizado com sucesso!");
    }
}
