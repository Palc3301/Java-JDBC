package conectaPg.DAO;

import conectaPg.testConection.Conecta;
import conectaPg.entities.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {
    private Connection con;

    public VendaDAO() throws SQLException, ClassNotFoundException {
        con = Conecta.criarConexao();
    }
    public void cadastrarVendedor(Venda venda) {
        String sql = "INSERT INTO vendedor(idVenda, qtdVendida, codComp, matVenda) VALUES(?, ?, ?, ?)";

        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setInt(1, venda.getQtdVendida());
            preparador.setInt(2, venda.getQtdVendida());
            preparador.setInt(3,venda.getCodComp());
            preparador.setInt(4,venda.getMatVende());

            preparador.execute();
            preparador.close();

            System.out.println("Inserção Realizada!");
        } catch (SQLException e) {
            System.out.println("Erro - " + e.getMessage());
        }
    }

    public void updateVenda(Venda venda) {
        String sql = "UPDATE vendedor SET qtdVendida = ? WHERE idVenda = ?";
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setInt(1, venda.getQtdVendida());
            preparador.setInt(2, venda.getIdVenda());

            preparador.execute();
            preparador.close();

            System.out.println("Alteração realizada!");
        }catch (SQLException e) {
            System.out.println("ERRO - " + e.getMessage());
        }
    }

    public void deleteVenda(Venda venda) {
        String sql = "DELETE venda WHERE idVenda = ?";
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setInt(1, venda.getIdVenda());

            preparador.execute();
            preparador.close();
            System.out.println("Deleção realizada!");
        }catch (SQLException e) {
            System.out.println("ERROR - " + e.getMessage());
        }
    }
    public List<Venda> selectAllVendas(){
        String sql = "SELECT * FROM venda";
        List<Venda> listaA = new ArrayList<Venda>();
        try {
            PreparedStatement preaparador = con.prepareStatement(sql);
            ResultSet resultados = preaparador.executeQuery();
            while (resultados.next()) {
                Venda venda2 = new Venda();
                venda2.setIdVenda(0);
                venda2.setQtdVendida(0);
                venda2.setMatVende(0);
                venda2.setCodComp(0);
                listaA.add(venda2);
            }
        }catch (SQLException e) {
            System.out.println("ERRO - " + e.getMessage());
        }
        return listaA;
    }
}
