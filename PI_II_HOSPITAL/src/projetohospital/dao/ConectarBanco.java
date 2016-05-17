package projetohospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * willian.carvalho
 */


public class ConectarBanco {
    
    private static final String 
        URL = "jdbc:mysql://projetohospital.mysql.uhserver.com/projetohospital",
        NOME = "senacpi2016", SENHA = "Sen@c2016";

    public static Connection con;
    public static Statement comando;

    public static final int MYSQL = 0;
    private static final String MySQLDriver = "com.mysql.jdbc.Driver";

    public static Connection abrirConexao(String url, String nome, String senha,
            int banco) throws ClassNotFoundException, SQLException {

        switch (banco) {
            case MYSQL:
                Class.forName(MySQLDriver);
                break;
        }
        return DriverManager.getConnection(url, nome, senha);
    }

    public static void conectar() {
        try {
            con = abrirConexao(URL, NOME, SENHA, ConectarBanco.MYSQL);
            comando = con.createStatement();
            System.out.println("Conectado!");
        } catch (ClassNotFoundException e) {
            imprimeErro("Erro ao carregar o driver", e.getMessage());
        } catch (SQLException e) {
            imprimeErro("Erro ao conectar", e.getMessage());
        }
    }

    public static void fechar() {
        try {
            comando.close();
            con.close();
            System.out.println("Conexão Fechada");
        } catch (SQLException e) {
            imprimeErro("Erro ao fechar conexão", e.getMessage());
        }
    }

    public static void imprimeErro(String msg, String msgErro) {
        System.err.println(msg);
        System.out.println(msgErro);
        System.exit(0);
    }

}
