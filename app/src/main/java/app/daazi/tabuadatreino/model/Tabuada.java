package app.daazi.tabuadatreino.model;

public class Tabuada {

    private int multiplicando;
    private int multiplicador;
    private int resultado;
    private final String sinalMultiplicacao = "X";
    private final String sinalIgualdade = "=";

    public Tabuada() {
        this.multiplicando = multiplicando;
        this.multiplicador = multiplicador;
        this.resultado = resultado;
    }

    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getSinalMultiplicacao() {
        return sinalMultiplicacao;
    }

    public String getSinalIgualdade() {
        return sinalIgualdade;
    }
}
