package conectaPg.testConection;

import conectaPg.DAO.VendedorDAO;
import conectaPg.entities.Vendedor;

import java.sql.SQLException;
import java.util.List;

public class TestVendedor {
    public static void main(String[] args) {
        //vendedorInsert();
        //vendedorUpdate();
        //vendedorDelete();
        //vendedorShow();
    }

    public static void vendedorInsert() {
        Vendedor vendedor = new Vendedor();
        vendedor.setMatricula(24);
        vendedor.setNome("Breno Duarte");
        VendedorDAO vendedorDAO = null;
        try {
            vendedorDAO = new VendedorDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        vendedorDAO.cadastrarVendedor(vendedor);
    }
    public static void vendedorUpdate() {
        Vendedor vendedor = new Vendedor();
        vendedor.setMatricula(3301);
        vendedor.setNome("Yan");
        VendedorDAO vendedorDAO = null;
        try {
            vendedorDAO = new VendedorDAO();
        } catch (SQLException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        vendedorDAO.updateVendedor(vendedor);
    }

    public static void vendedorDelete() {
        Vendedor vendedor = new Vendedor();
        vendedor.setMatricula(3301);
        VendedorDAO vendedorDAO = null;
        try {
            vendedorDAO = new VendedorDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        vendedorDAO.deleteVendedor(vendedor);
    }
    public static void  vendedorShow() {
        VendedorDAO vendedorDAO =null;
        try {
            vendedorDAO = new VendedorDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        List<Vendedor> listaShowAll = vendedorDAO.selectAll();
        for(Vendedor e:listaShowAll) {
            System.out.print("MATRICULA: " + e.getMatricula());
            System.out.println(" NOME: " + e.getNome());
        }
    }
}
