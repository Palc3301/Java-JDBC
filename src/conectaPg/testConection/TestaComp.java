package conectaPg.testConection;

import conectaPg.DAO.ComputadorDAO;
import conectaPg.DAO.VendedorDAO;
import conectaPg.entities.Computador;
import conectaPg.entities.Vendedor;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TestaComp {
    public static void main(String[] args) {
        //computadorInsert();
        //computadorUpdate();
        //computadorDelete();
        computadorShow();
    }
    public static void computadorInsert() {
        Computador computador = new Computador();
        computador.setCodComputador(1);
        computador.setQtd(10);
        computador.setDescricao("Acer Nitro 5");

        ComputadorDAO computadorDAO = null;
        try {
            computadorDAO = new ComputadorDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        computadorDAO.cadastrarComputador(computador);
    }
    public static void computadorUpdate() {
        Computador computador = new Computador();
        computador.setQtd(5);
        computador.setCodComputador(1);
        ComputadorDAO computadorDAO = null;
        try {
            computadorDAO = new ComputadorDAO();

        }catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        computadorDAO.updateComputador(computador);
    }
    public static void computadorDelete() {
        Computador computador = new Computador();
        computador.setCodComputador(3301);
        ComputadorDAO computadorDAO = null;
        try {
            computadorDAO = new ComputadorDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        computadorDAO.deleteComputador(computador);
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
            System.out.println("COD_COMPUTADOR: " + e.getCodComputador());
            System.out.println("QTD: " + e.getQtd());
            System.out.println("DESCRICAO" + e.getDescricao());
        }
    }
}
