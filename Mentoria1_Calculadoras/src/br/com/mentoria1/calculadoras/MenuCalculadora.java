package br.com.mentoria1.calculadoras;

/*
Mentoria Java - Programa 01 - Desafio

Calculadora

Neste primeiro desafio, será testado e cobrado sua orientação a objeto, para isso deverá estudar os 4 pilares da orientação (Abstração, Encapsulamento, Polimorfismo e Herança).

Onde teremos uma Classe principal que deverá ser usada somente como "menu" e será a origem para a chamada de objetos e métodos de outras classes, obedecendo menu a seguir:

Calculadora Padrão
Soma
Subtração
Divisão
Multiplicação
Potenciação

Calculadora IMC

Calculadora Área
Circulo
Quadrado
Retângulo

Dado: O inicio do programa Calculadora
Quando: Escolher a opcao Calculadora Padrao
E: Escolher a opcao soma
E: Pedir a inserção de 2 valores
Entao: devera realizar a soma de 2 entradas
Com esse menu, ao iniciar o programa, deverá ser perguntado ao usuário qual tipo de função da calculadora ele deseja utilizar.

Observação: Para este programa, Quero uma Cobertura de 85% de testes unitários
 */

import java.util.Scanner;


public class MenuCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcaoMenu;

        System.out.println("\nCalculadoras \n");
        System.out.println("Digite a opção de uma das calculadoras abaixo: ");
        System.out.println("1 - Calculadora padrão");
        System.out.println("2 - Calculadora IMC");
        System.out.println("3 - Calculadora área");
        System.out.println("4 - Sair \n");
        opcaoMenu = sc.nextInt();
        switch (opcaoMenu) {
        case 1:
            CalculadoraPadrao.menuCalculadoraPadrao();
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
            System.out.println("\nObrigado! \n");
            sc.close();
            break;
        default:
            System.out.println("\nPor favor, digite uma opção válida!");
            main(null);
        }
    }
}
