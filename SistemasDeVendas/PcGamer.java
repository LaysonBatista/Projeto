package programacao_orientada_a_objetos.Interface.SistemasDeVendas;

public class PcGamer extends Produto {

    public PcGamer(Double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public void exibirValor() {
        System.out.println("O Valor desse produto é: R$" + getValor());
    }

    @Override
    public void exibirNome() {
        System.out.println("Produto adquirido: " + getNome());
    }
}
