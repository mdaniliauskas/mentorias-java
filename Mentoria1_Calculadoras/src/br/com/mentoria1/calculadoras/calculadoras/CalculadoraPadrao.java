package br.com.mentoria1.calculadoras.calculadoras;

import br.com.mentoria1.calculadoras.MenuCalculadora;

import java.util.Scanner;

public class CalculadoraPadrao {

    public static void menuCalculadoraPadrao(){
        Scanner sc = new Scanner(System.in);
        int opcaoMenu;

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
            System.out.println("Opção 1");
            sc.close();
            break;
        case 2:
            System.out.println("Opção 2");
            sc.close();
            break;
        case 3:
            System.out.println("Opção 3");
            sc.close();
            break;
        case 4:
            System.out.println("Opção 4");
            sc.close();
            break;
        case 5:
            System.out.println("Opção 5");
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
}
