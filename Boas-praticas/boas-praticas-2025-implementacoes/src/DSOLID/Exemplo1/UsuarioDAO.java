package DSOLID.Exemplo1;

import DSOLID.Exemplo1.MySQLConnection;

public class UsuarioDAO {
    private IConexaoBanco iConexaoBanco;

    public UsuarioDAO(IConexaoBanco iConexaoBanco) {
        this.iConexaoBanco = iConexaoBanco; // Dependência indireta
    }

    public void salvarUsuario(String nome) {
        iConexaoBanco.connect();
        System.out.println("Salvando usuário: " + nome);
    }
}
