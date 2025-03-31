package DSOLID.Exemplo1;

public class PostgresConnection implements IConexaoBanco {

    @Override
    public void connect() {
        System.out.println("Conectado ao Postgres");
    }

}