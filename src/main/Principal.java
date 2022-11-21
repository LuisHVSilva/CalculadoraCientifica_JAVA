package main;

import main.calculadora.Conversao;
import main.calculadora.OperacoesSimples;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conversao conversao = new Conversao();
        OperacoesSimples os = new OperacoesSimples();
        int flag = 1;

        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Operações Simples \n 2 - Conversão");
            Scanner opc = new Scanner(System.in);
            int n1 = opc.nextInt();

            if(n1 == 1){
                System.out.println("Qual operação será usada?");
                System.out.println("1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
                n1 = opc.nextInt();

                System.out.println("Quais os números desejados?");
                double x = opc.nextDouble();
                double y = opc.nextDouble();
                System.out.println("Resultado:");
                switch (n1) {
                    case 1 -> System.out.println(os.soma(x, y));
                    case 2 -> System.out.println(os.subtracao(x, y));
                    case 3 -> System.out.println(os.multiplicacao(x, y));
                    case 4 -> System.out.println(os.divisao(x, y));
                    default -> System.out.println("Você digitou algo incorreto.");
                }
            } else {
                System.out.println("Só há conversão de Celcius para outra temperatura");
                System.out.println("1 - Kelvin \n 2 - Fahrenheit");
                n1 = opc.nextInt();

                System.out.println("Informe a temperatura, em Celcius");
                double x = opc.nextDouble();

                switch (n1) {
                    case 1 -> {
                        conversao.kelvin(x);
                        System.out.println(conversao);
                    }
                    case 2 -> {
                        conversao.fahrenheit(x);
                        System.out.println(conversao);
                    }
                    default -> System.out.println("Deu ruim");
                }
            }
            System.out.println("\nDeseja continuar?");
            System.out.println("1 - Sim \n 2 - Não");
            flag = opc.nextInt();

        } while (flag == 1);

        System.out.println("Tchau!");


    }
}

