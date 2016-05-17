package projetohospital.dao;

import projetohospital.model.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ClienteDAO {

    private Statement comando;

    public void apagar(String rg) {
        ConectarBanco.conectar();
        try {
            comando.executeUpdate("DELETE FROM pessoa WHERE rg = '" + rg + "';");
        } catch (SQLException e) {
            ConectarBanco.imprimeErro("Erro ao apagar pessoas", e.getMessage());
        } finally {
            ConectarBanco.fechar();
        }
    }

    public Vector<Cliente> buscarTodos() {
        ConectarBanco.conectar();
        Vector<Cliente> resultados = new Vector<Cliente>();
        ResultSet rs;
        try {
            rs = comando.executeQuery("SELECT * FROM cliente");
            while (rs.next()) {
                Cliente temp = new Cliente();
                // pega todos os atributos da pessoa             
                
                
                temp.setNome(rs.getString("nome"));
                temp.setEndereco(rs.getString("endereco"));
                temp.setBairro(rs.getString("bairro"));
                temp.setCidade(rs.getString("cidade"));
                temp.setEstado(rs.getString("estado"));
                temp.setCep(rs.getString("cep"));
                temp.setSexo(rs.getString("sexo"));
                temp.setTelefone(rs.getInt("telefone"));
                temp.setCelular(rs.getInt("celular"));
                temp.setCadastro(rs.getDate("cadastro"));
                temp.setAtivo(rs.getString("ativo"));
                temp.setDeletado(rs.getString("deletado"));              
                
                resultados.add(temp);
            }
            return resultados;
        } catch (SQLException e) {
            ConectarBanco.imprimeErro("Erro ao buscar clientes", e.getMessage());
            return null;
        } finally {
            ConectarBanco.fechar();
        }
    }

    public void atualizar(Cliente cliente) {
        ConectarBanco.conectar();
        String com = "UPDATE cliente SET nome = '" + cliente.getNome()+ "';";
        System.out.println("Atualizada!");
        try {
            comando.executeUpdate(com);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectarBanco.fechar();
        }
    }

    public Vector<Cliente> buscar(String rg) {
        ConectarBanco.conectar();
        Vector<Cliente> resultados = new Vector<Cliente>();
        ResultSet rs;
        try {
            rs = comando.executeQuery("SELECT * FROM cliente WHERE rg LIKE '"
                    + rg + "%';");
            while (rs.next()) {
                Cliente temp = new Cliente();
                // pega todos os atributos da pessoa  
                temp.setNome(rs.getString("nome"));
                temp.setEndereco(rs.getString("endereco"));
                temp.setBairro(rs.getString("bairro"));
                temp.setCidade(rs.getString("cidade"));
                temp.setEstado(rs.getString("estado"));
                temp.setCep(rs.getString("cep"));
                temp.setSexo(rs.getString("sexo"));
                temp.setTelefone(rs.getInt("telefone"));
                temp.setCelular(rs.getInt("celular"));
                temp.setCadastro(rs.getDate("cadastro"));
                temp.setAtivo(rs.getString("ativo"));
                temp.setDeletado(rs.getString("deletado")); 
                resultados.add(temp);
            }
            return resultados;
        } catch (SQLException e) {
            ConectarBanco.imprimeErro("Erro ao buscar pessoa", e.getMessage());
            return null;
        }

    }

    public void insere(Cliente pessoa) {
        ConectarBanco.conectar();
     /*   comando.executeUpdate("INSERT INTO Cliente VALUES('"
                + pessoa.getRg() + "', '" + pessoa.getNome() + "',"
                + pessoa.getIdade() + ",'" + pessoa.getCidade() + "','"
                + pessoa.getEstado() + "')");*/
        System.out.println("Inserida!");
        ConectarBanco.fechar();
    }

}
