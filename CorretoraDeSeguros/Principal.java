package _1_Exercicios_Gerais.CorretoraDeSeguros;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        imprimirTraco();
        System.out.println("Seja bem-vindo a corretora de seguros do tiozão!");
        imprimirTraco();

        Carro carro = new Fiat("Palio", 40000, "Fabricante: Fiat \nModelo: Palio \nAno de fabricação: 2011 \nCor: Preto");
        Imovel imovel = new Casa("1401 B", 150000, "Tamanho: Grande \nAndares: 3 \nBanheiros: 2 \nTamanho do terreno: 1.000 metros quadrados");

        System.out.println("Você deseja comprar o seguro para um imóvel ou para um caro?");
        String[] tiposDeSeguros = new String[]{"Carro", "Imóvel"};
        for (int i = 0; i < tiposDeSeguros.length; i++) {
            System.out.println("[" + i + "]" + tiposDeSeguros[i]);
        }
        System.out.println("Digite aqui a opção escolhida: ");
        Integer tipoDeSeguroEscolhido = scanner.nextInt();

        if (tipoDeSeguroEscolhido.equals(0)) {
            System.out.println("Ok, vamos escanear o seu veículo e calcular o valor da apólice com base no modelo do carro e da demanda de peças.");
            System.out.println("Deseja continuar? ");
            String[] resposta1 = new String[]{"Sim", "Não"};
            for (int i = 0; i < resposta1.length; i++) {
                System.out.println("[" + i + "]" + resposta1[i]);
            }
            System.out.println("Digite a resposta: ");
            Integer respostaContinuar = scanner.nextInt();

            if (respostaContinuar.equals(0)) {
                System.out.println("\n[Escaneando o seu veículo]");
                carro.obterDescricao();
                System.out.println("------------------------------");
                System.out.println("[Proposta de seguro]");
                System.out.println("Cobertura total.");
                CorretoraSeguros.fazerPropostaSeguro(carro);

                System.out.println("\nDeseja aceitar essa proposta?");
                String[] resposta2 = new String[]{"Sim", "Não"};
                for (int i = 0; i < resposta2.length; i++) {
                    System.out.println("[" + i + "]" + resposta2[i]);
                }
                System.out.println("Digite a resposta: ");
                Integer respostaAceitar = scanner.nextInt();
                scanner.nextLine();

                if (respostaAceitar.equals(0)) {
                    System.out.println("Compra do seguro finalizada!");
                    System.out.println("A corretora de seguros do tiozão vai cuidar muito bem do seu veículo :)");
                } else {
                    System.out.println("Compra cancelada.");
                }
            } else if (respostaContinuar.equals(1)) {
                System.out.println("Ok, cancelando o escaner.");
            }

        }
        if (tipoDeSeguroEscolhido.equals(1)) {
            System.out.println("Ok, vamos escanear a sua casa e calcular o valor da apólice com base no tamanho do terreno e estrutura da casa.");
            System.out.println("Deseja continuar?");
            String[] resposta3 = new String[]{"Sim", "Não"};
            for (int i = 0; i < resposta3.length; i++) {
                System.out.println("[" + i + "]" + resposta3[i]);
            }
            System.out.println("Digite a resposta: ");
            Integer respostaContinuar2 = scanner.nextInt();
            scanner.nextLine();

            if (respostaContinuar2.equals(0)) {
                System.out.println("\n[Escanenado a sua casa]");
                imovel.obterDescricao();
                System.out.println("--------------------------------------------");
                System.out.println("[Proposta de seguro]");
                System.out.println("Cobertura total.");
                CorretoraSeguros.fazerPropostaSeguro(imovel);


                System.out.println("\nDeseja essa proposta?");
                String[] resposta4 = new String[]{"Sim", "Não"};
                for (int i = 0; i < resposta4.length; i++) {
                    System.out.println("[" + i + "]" + resposta4[i]);
                }
                System.out.println("Digite a resposta: ");
                Integer respostaAceitar2 = scanner.nextInt();
                scanner.nextLine();

                if (respostaAceitar2.equals(0)) {
                    System.out.println("Compra do seguro finalizada!");
                    System.out.println("A corretora de seguros do tiozão vai cuidar muito bem da sua casa :)");
                } else {
                    System.out.println("Compra cancelada.");
                }
            } else if (respostaContinuar2.equals(1)) {
                System.out.println("Ok, cancelando o escaner.");
            }

        }
    }

    private static void imprimirTraco() {
        System.out.println("=======================================================");
    }

}

