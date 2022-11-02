package conectaPg.entities;

public class Venda {

    private int idVenda;
    private int qtdVendida;
    private int codComp;
    private int matVende;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    public int getCodComp() {
        return codComp;
    }

    public void setCodComp(int codComp) {
        this.codComp = codComp;
    }

    public int getMatVende() {
        return matVende;
    }

    public void setMatVende(int matVende) {
        this.matVende = matVende;
    }
}
