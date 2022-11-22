package _1_Exercicios_Gerais.CorretoraDeSeguros;

public abstract class Imovel implements Seguravel {

    public static final double VALOR_REFERENTE_AO_TAMANHO_DO_TERRENO = 55000;


    protected String descricao;
    protected String endereco;
    protected double valor;

    public Imovel(String endereco, double valor, String descricao) {
        this.endereco = endereco;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Imovel(){
    }

    @Override
    public void obterDescricao() {
        System.out.println(this.getDescricao());
    }

    @Override
    public void calcularValorApolice() {
        System.out.println("Calculando o valor da apólice...");
        System.out.println("Valor da apólice: R$" + VALOR_REFERENTE_AO_TAMANHO_DO_TERRENO * 2);

    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
