package conectaPg.entities;

public class Computador {

    private int codCumputador;
    private String Descricao;
    private int Qtd;

    public int getCodCumputador() {
        return codCumputador;
    }

    public void setCodCumputador(int codCumputador) {
        this.codCumputador = codCumputador;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int qtd) {
        Qtd = qtd;
    }
}
