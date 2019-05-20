/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExecutaOperacao;

import java.util.Scanner;

/**
 *
 * @author André Aguiar - RA 116115927
 */
public class executaOperacao {

    public static void main(String[] args) {

        float valor1, valor2, maiorValor, menorValor, resultado;
        int operacao;

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o primeiro valor: ");
        valor1 = entrada.nextFloat();
        System.out.printf("Digite o segundo valor: ");
        valor2 = entrada.nextFloat();

        System.out.println("Digite 1 para média entre os números digitados: ");
        System.out.println("Digite 2 para obter a diferença do maior pelo menor: ");
        System.out.println("Digite 3 para obter o produto entre os números digitados: ");
        System.out.println("Digite 4 para dividir o primeiro valor pelo segundo: ");
        operacao = entrada.nextInt();
        switch (operacao) {
            case 1:
                resultado = (valor1 + valor2) / 2;
                System.out.println("A média entre os valores  informados (" + valor1 + ") e (" + valor2 + ") é: " + resultado);
                break;
            case 2:
                maiorValor = valor1;
                menorValor = valor2;
                if (valor2 > valor1) {
                    maiorValor = valor2;
                    menorValor = valor1;
                }
                resultado = (maiorValor - menorValor);
                System.out.println("A diferença entre o maior (" + maiorValor + ") valor para o menor (" + menorValor + ") é: " + resultado);
                break;
            case 3:
                resultado = (valor1 * valor2);
                System.out.println("O produto entre os números digitados (" + valor1 + ") e (" + valor2 + ") é : " + resultado);
                break;
            case 4:
                resultado = (valor1 / valor2);
                System.out.println("O resultado da divisão do primeiro valor (" + valor1 + ") pelo segundo valor (" + valor2 + ") é : " + resultado);
                break;

        }
    }

}
