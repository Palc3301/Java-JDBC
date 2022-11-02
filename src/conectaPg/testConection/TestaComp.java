package conectaPg.testConection;

import conectaPg.DAO.ComputadorDAO;
import conectaPg.DAO.VendedorDAO;
import conectaPg.entities.Computador;
import conectaPg.entities.Vendedor;

import java.sql.SQLException;
import java.util.List;

public class TestaComp {
    public static void main(String[] args) {
        computadorInsert();
        computadorUpdate();
        computadorDelete();
        computadorShow();
    }
    public static void computadorInsert() {
        Computador comp = new Computador();
        comp.setCodCumputador(3301);
        comp.setQtd(2);
        comp.setDescricao("Computaurrrr Linduuu");

        ComputadorDAO computadorDAO = null;
        try {
            computadorDAO = new ComputadorDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        computadorDAO.cadastrarComputador(comp);
    }
    public static void computadorUpdate() {
        Computador computador = new Computador();
        computador.setQtd(10);
        computador.setCodCumputador(3301);

        ComputadorDAO computadorDAO = null;
        try {
            computadorDAO = new ComputadorDAO();
        }catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void computadorDelete() {
        Computador computador = new Computador();
        computador.setCodCumputador(1);
        ComputadorDAO computadorDAO = null;
        try {
            computadorDAO = new ComputadorDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void  computadorShow() {
        ComputadorDAO computadorDAO =null;
        try {
            computadorDAO = new ComputadorDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        List<Computador> listaShowAll = computadorDAO.selectAllcomputers();
        for(Computador e:listaShowAll) {
            System.out.println();
        }
    }
}
