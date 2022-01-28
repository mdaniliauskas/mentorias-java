package br.com.mentoria1.calculadoras.calculadoras;

import br.com.mentoria1.calculadoras.MenuCalculadora;

import java.util.Scanner;

public class CalculadoraPadrao {
    static double valor, resultado;

    public static void menuCalculadoraPadrao(){
        int opcaoMenu;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCalculadora padrão\n");
        System.out.println("Escolha uma das operações abaixo: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potenciação");
        System.out.println("6 - Voltar para o menu com todas as calculadoras");
        System.out.println("7 - Sair\n");
        System.out.println("Digite a opção: ");
        opcaoMenu = sc.nextInt();
        switch (opcaoMenu) {
        case 1:
            somar();
            sc.close();
            break;
        case 2:
            subtrair();
            sc.close();
            break;
        case 3:
            multiplicar();
            sc.close();
            break;
        case 4:
            dividir();
            sc.close();
            break;
        case 5:
            potencia();
            sc.close();
            break;
        case 6:
            MenuCalculadora.main(null);
            sc.close();
            break;
        case 7:
            System.out.println("\nObrigado! \n");
            sc.close();
            break;
        default:
            System.out.println("\nPor favor, digite uma opção válida!");
        }
    }

    public static double entradaValores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para números decimais utilize a vírgula - ex: 10,5\n");
        System.out.println("Digite o valor para a operação: ");
        valor = sc.nextDouble();
        return valor;
    }

    public static void somar() {
        resultado = entradaValores() + entradaValores();
        System.out.println("O resultado da soma é: " + resultado + "\n");
    }

    public static void subtrair() {
        resultado = entradaValores() - entradaValores();
        System.out.println("O resultado da subtração é: " + resultado + "\n");
    }

    public static void multiplicar() {
        resultado = entradaValores() * entradaValores();
        System.out.println("O resultado da multiplicação é: " + resultado + "\n");
    }

    public static void dividir() {
        resultado = entradaValores();
        if (entradaValores() == 0)
            System.out.println("Um número não pode ser divido por 0");
        else {
            resultado = resultado / valor;
            System.out.println("O resultado da divisão é: " + resultado + "\n");
        }
    }

    public static void potencia() {
        resultado = Math.pow(entradaValores(), entradaValores());
        System.out.println("O resultado da pontenciação é: " + resultado + "\n");
    }
}
