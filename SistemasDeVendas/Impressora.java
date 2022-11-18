package programacao_orientada_a_objetos.Interface.SistemasDeVendas;

public class Impressora implements NotaFiscalImprimidaPorHp, NotaFiscalImprimidaPorEpson {

    @Override
    public void imprimidaPorEpson() {
        System.out.println("Nota fiscal imprimida por uma impressora " + "\"Epson\"" + ".");
    }

    @Override
    public void imprimidaPorhp() {
        System.out.println("Nota fiscal imprimida por uma impressora " + "\"HP\"" + ".");

    }
}

