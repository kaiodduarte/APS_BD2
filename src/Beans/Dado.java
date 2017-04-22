package Beans;

public class Dado {

    private String nome;
    private char status;

    public Dado(String nomeDado) {
        this.status = 'U';
        this.nome = nomeDado;
    }

    public String getNome() {
        return nome;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
