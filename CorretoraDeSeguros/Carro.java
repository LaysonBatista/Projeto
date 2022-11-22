package _1_Exercicios_Gerais.CorretoraDeSeguros;

public abstract class Carro implements Seguravel{

    public static final double VALOR_DEMANDA_DE_PECAS_DO_MODELO_DO_VEICULO = 400;
    public static final double ACRECIMO_PARA_A_FABRICANTE_FIAT = 70;

    protected String modelo;
    protected String descricao;
    protected double valor;

    public Carro(String modelo, double valor, String descricao) {
        this.modelo = modelo;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Carro(){
    }

    @Override
    public void obterDescricao() {
        System.out.println(this.getDescricao());
    }

    @Override
    public void calcularValorApolice() {
        System.out.println("Calculando o valor da apólice...");
        System.out.println("Valor da apólice: R$" + (ACRECIMO_PARA_A_FABRICANTE_FIAT + VALOR_DEMANDA_DE_PECAS_DO_MODELO_DO_VEICULO) * 3);

    }

    public String getDescricao() {
        return descricao;
    }
}
