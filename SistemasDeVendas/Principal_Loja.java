package programacao_orientada_a_objetos.Interface.SistemasDeVendas;

import java.util.Scanner;

public class Principal_Loja {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        imprimirTraco();
        System.out.println("Seja bem-vindo a Lojas Americanas!");
        imprimirTraco();



        System.out.println("Digite o seu nome aqui: ");
        String nomeDoCliente = scanner.nextLine();



        PcGamer pcGamer = new PcGamer(150d, "PcGamer");
        Playstation4 playstation4 = new Playstation4(99d, "Playstaion 4");


        String[] produtosDaLoja = new String[]{"PC Gamer", "Playstation 4"};
        System.out.println("Esses são alguns de nossos produtos que estão disponíves para venda: ");

        for (int i = 0; i < produtosDaLoja.length; i++) {
            System.out.println("[" + i + "]" + produtosDaLoja[i]);
        }


        System.out.println("Qual produto você deseja comprar? Digite aqui:");
        Integer posicaoProdutoEscolhido = scanner.nextInt();
        scanner.nextLine();

        if (posicaoProdutoEscolhido.equals(0)){
            System.out.println("\nVocê escolheu o produto: " + produtosDaLoja[0]);
            pcGamer.exibirValor();

        } else if (posicaoProdutoEscolhido.equals(1)) {
            System.out.println("\nVocê escolheu o produto: " + produtosDaLoja[1]);
            playstation4.exibirValor();
        }


        System.out.println("\nOpções de compra: ");
        String[] opcoesDeCompra = new String[]{"Cartão", "Dinheiro"};
        for (int i = 0; i < opcoesDeCompra.length; i++) {
            System.out.println("[" + i + "]" + opcoesDeCompra[i]);
        }
        System.out.println("Digite aqui a opção escolhida: ");

        Integer posicaoOpcaoDeCompraEscolhida = scanner.nextInt();
        scanner.nextLine();

        if (posicaoOpcaoDeCompraEscolhida.equals(0)) {
            System.out.println("\nOpção escolhida: " + opcoesDeCompra[0] );
        } else if (posicaoProdutoEscolhido.equals(1)) {
            System.out.println("\nOpção escolhida: " + opcoesDeCompra[1]);
        }



        Cartao redeCard = new Cartao(200d, "456 da Redecard");
        Cartao cielo = new Cartao(100d, "123 da Cielo");


        System.out.println("\nQual o número do cartão?");
        String[] numeroDoCartao = new String[]{"456 Redecard", "123 Cielo"};
        for (int i = 0; i < numeroDoCartao.length; i++) {
            System.out.println("[" + i + "]" + numeroDoCartao[i]);
        }
        System.out.println("Digite aqui a opção escolhia: ");

        Integer posicaoNumeroDoCartaoEscolhido = scanner.nextInt();
        scanner.nextLine();

        if (posicaoNumeroDoCartaoEscolhido.equals(0)){
            redeCard.exibirNumero();
            redeCard.exibirLimite();
            System.out.println();
        } else if (posicaoNumeroDoCartaoEscolhido.equals(1)) {
            cielo.exibirNumero();
            cielo.exibirLimite();
        }

        Impressora notaFiscal = new Impressora();

        System.out.println("Qual impressora deseja usar para imprimir a nota fiscal?");
        String[] tiposDeImpressoras = new String[]{"HP", "Epson"};
        for (int i = 0; i < tiposDeImpressoras.length; i++) {
            System.out.println("[" + i + "]" + tiposDeImpressoras[i]);
        }
        System.out.println("Digite aqui a opção escolhida: ");

        Integer posicaoImpressoraEscolhida = scanner.nextInt();
        scanner.nextLine();


        if (posicaoProdutoEscolhido.equals(0)
                && posicaoOpcaoDeCompraEscolhida.equals(0)
                && posicaoNumeroDoCartaoEscolhido.equals(0) && posicaoImpressoraEscolhida.equals(0)){

            if (pcGamer.getValor() < redeCard.getLimite()) {

                System.out.println();
                System.out.println("Compra Finalizada!");
                System.out.println();
                imprimirTraco();
                System.out.println("[NOTA FISCAL]");
                imprimirTraco();
                System.out.println("Nome do cliente: " + nomeDoCliente);
                pcGamer.exibirNome();
                pcGamer.exibirValor();
                redeCard.exibirNumero();
                redeCard.exibirLimite();
                imprimirTraco();
                notaFiscal.imprimidaPorhp();
                imprimirTraco();
                System.out.println();
            } else {
                System.out.println("Não foi possivel finalizar a compra."
                        + "\nMotivo: Valor do produto maior que o limite do cartão.");
            }

        }  if (posicaoProdutoEscolhido.equals(0)
                && posicaoOpcaoDeCompraEscolhida.equals(0)
                &&posicaoNumeroDoCartaoEscolhido.equals(0) && posicaoImpressoraEscolhida.equals(1)){

            if (pcGamer.getValor() < redeCard.getLimite()) {

                System.out.println();
                System.out.println("Compra Finalizada!");
                System.out.println();
                imprimirTraco();
                System.out.println("[NOTA FISCAL]");
                imprimirTraco();
                System.out.println("Nome do cliente: " + nomeDoCliente);
                pcGamer.exibirNome();
                pcGamer.exibirValor();
                redeCard.exibirNumero();
                redeCard.exibirLimite();
                imprimirTraco();
                notaFiscal.imprimidaPorEpson();
                imprimirTraco();
                System.out.println();
            } else {
                System.out.println("Não foi possivel finalizar a compra."
                        + "\nMotivo: Valor do produto maior que o limite do cartão.");
            }
        } if (posicaoProdutoEscolhido.equals(1)
                && posicaoOpcaoDeCompraEscolhida.equals(0)
                && posicaoNumeroDoCartaoEscolhido.equals(1) && posicaoImpressoraEscolhida.equals(0)){
            if (playstation4.getValor() < posicaoNumeroDoCartaoEscolhido){

            }
        }


    }

    private static void imprimirTraco2() {
        System.out.println("-------------------------------------------------");
    }


    private static void imprimirTraco() {
        System.out.println("=================================================");
    }

    }

