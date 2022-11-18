package programacao_orientada_a_objetos.Interface.SistemasDeVendas;

public abstract class Produto {

    protected Double valor;
    protected String nome;


    public Produto(Double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public abstract void exibirValor();
    public abstract void exibirNome();

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
