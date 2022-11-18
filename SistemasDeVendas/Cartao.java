package programacao_orientada_a_objetos.Interface.SistemasDeVendas;

public class Cartao implements RedeCard, Cielo {

    protected String numero;
    protected Double limite;

    public Cartao(Double limite, String numero) {
        this.limite = limite;
        this.numero = numero;
    }

    @Override
    public void exibirNumero() {
        System.out.println("Número do cartão: " + getNumero());

    }

    @Override
    public void exibirLimite() {
        System.out.println("Limite do cartão: R$" + getLimite());

    }


    public String getNumero() {
        return numero;
    }

    public Double getLimite() {
        return limite;
    }
}

