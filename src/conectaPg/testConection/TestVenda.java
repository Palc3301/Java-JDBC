package conectaPg.testConection;

import conectaPg.DAO.VendaDAO;
import conectaPg.entities.Venda;

import java.sql.SQLException;
import java.util.List;

public class TestVenda {
    public static void main(String[] args) {
        vendaInsert();
        vendaUpdate();
        vendaDelete();
    }

    public static void vendaInsert() {
        Venda venda = new Venda();
        venda.setIdVenda(1);
        venda.setQtdVendida(2);
        venda.setCodComp(3301);
        venda.setMatVende(330133);
        VendaDAO vendaDAO = null;
        try{
            vendaDAO = new VendaDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void vendaUpdate() {
        Venda venda = new Venda();
        venda.setQtdVendida(2);
        venda.setIdVenda(3301);
        VendaDAO vendaDAO = null;
        try {
            vendaDAO = new VendaDAO();
        }catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        vendaDAO.updateVenda(venda);
    }
    public static void vendaDelete() {
        Venda venda = new Venda();
        venda.setIdVenda(1);
        VendaDAO vendaDAO = null;
        try {
            vendaDAO = new VendaDAO();
        }  catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void showAllVendas() {
        VendaDAO vendaDAO = null;
        try {
            vendaDAO = new VendaDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        List<Venda> listaVedas = vendaDAO.selectAllVendas();
        for (Venda e:listaVedas) {
            System.out.println();
        }
    }
}
