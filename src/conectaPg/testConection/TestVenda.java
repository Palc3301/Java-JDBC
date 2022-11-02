package conectaPg.testConection;

import conectaPg.DAO.VendaDAO;
import conectaPg.entities.Venda;

import java.sql.SQLException;
import java.util.List;

public class TestVenda {
    public static void main(String[] args) {
        //vendaInsert();
        //vendaUpdate();
        //vendaDelete();
        showAllVendas();
    }

    public static void vendaInsert() {
        Venda venda = new Venda();
        venda.setIdVenda(1);
        venda.setQtdVendida(1);
        venda.setCodComp(1);
        venda.setMatVende(22);

        VendaDAO vendaDAO = null;
        try{
            vendaDAO = new VendaDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        vendaDAO.cadastrarVenda(venda);
    }

    public static void vendaUpdate() {
        Venda venda = new Venda();
        venda.setQtdVendida(5);
        venda.setIdVenda(1);
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
        vendaDAO.deleteVenda(venda);
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
            System.out.print(" ID_VENDA: " + e.getIdVenda());
            System.out.print(" QTD_VENDIDA: " + e.getQtdVendida());
            System.out.print(" COD_COMP: " + e.getCodComp());
            System.out.println(" MAT_VENDE: " +e.getMatVende());
        }
    }
}
