package programacao_orientada_a_objetos.Interface.SistemasDeVendas;

public class Playstation4 extends Produto{


    public Playstation4(Double valor, String nome) {
        super(valor, nome);
    }

     @Override
    public void exibirValor() {
        System.out.println("Valor do produto: R$" + getValor());
    }

    @Override
    public void exibirNome() {
        System.out.println("Produto adquirido: " + getNome());
    }

}
