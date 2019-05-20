/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaSalario;

import java.util.Scanner;

/**
 *
 * @author André Aguiar - RA 116115927
 */
public class CalculaValorSalario {

    public static void main(String[] args) {
        int intOpcao = 0;
        int n = 0;
        String diasTrabalhados, salarioAtual;
        float novoSalario, valorFerias, valorDecTerce, fltSalario = 0, qtdDias = 0;

        for (int i = 0; i >= 0; i++) {
            System.out.println("Digite o número da opção desejada");
            System.out.println("(1) Calcular Aumento | (2) Calcular Férias | (3) Calcular 13º | (4) Sair ");
            Scanner ler = new Scanner(System.in);
            String opcao = ler.next();
            try {
                intOpcao = Integer.parseInt(opcao);
                while ((intOpcao >= 5) & (intOpcao != 0)) {
                    throw new Exception("O número não pode ser maior que 5");
                }
            } catch (Exception e) {
                System.out.println("Favor informar um número entre de 1 a 4.");
            }
            switch (intOpcao) {
                case 1:
                    System.out.println("Informe o salário atual");
                    salarioAtual = ler.next();
                    try {
                        fltSalario = Float.parseFloat(salarioAtual);
                    } catch (Exception e) {
                        System.out.println("Favor informar um valor válido.");
                    }
                    if (fltSalario <= 999.99) {
                        novoSalario = (float) (fltSalario * 1.15);
                        System.out.println("O valor do sálario com reajuste de 15% é: " + novoSalario);
                    } else if ((fltSalario > 999.99) & (fltSalario <= 2000.00)) {
                        novoSalario = (float) (fltSalario * 1.10);
                        System.out.println("O valor do sálario com reajuste de 15% é: " + novoSalario);
                    } else if (fltSalario > 2000.00) {
                        novoSalario = (float) (fltSalario * 1.05);
                        System.out.println("O valor do sálario com reajuste de 15% é: " + novoSalario);
                    }
                    break;
                case 2:
                    System.out.println("Informe o salário do funcionário");
                    salarioAtual = ler.next();
                    try {
                        fltSalario = Float.parseFloat(salarioAtual);
                    } catch (Exception e) {
                        System.out.println("Favor informar um valor válido.");
                        System.out.println("Informe o salário do funcionário");
                        fltSalario = ler.nextFloat();
                    }
                    valorFerias = (fltSalario + (fltSalario / 3));
                    System.out.println("O valor das férias do funcionário é: " + valorFerias);
                    break;
                case 3:
                    System.out.println("Informe o salário do funcionário");
                    salarioAtual = ler.next();
                    try {
                        fltSalario = Float.parseFloat(salarioAtual);
                    } catch (Exception e) {
                        System.out.println("Favor informar um valor válido.");
                        System.out.println("Informe o salário do funcionário");
                        fltSalario = ler.nextFloat();
                    }
                    System.out.println("Informe a quantidade de meses trabalhados");
                    diasTrabalhados = ler.next();
                    try {
                        qtdDias = Float.parseFloat(diasTrabalhados);
                        if (qtdDias > 12) {
                            System.out.println("Favor informar um valor válido de 1 a 12.");
                            System.out.println("Informe a quantidade de meses trabalhados");
                            qtdDias = ler.nextFloat();
                        }
                    } catch (Exception e) {
                        System.out.println("Favor informar um valor válido de 1 a 12.");
                        System.out.println("Informe a quantidade de meses trabalhados");
                        qtdDias = ler.nextFloat();
                    }
                    valorDecTerce = ((fltSalario * qtdDias) / 12);
                    System.out.println("O valor do décimo terceiro salário do funcionário é: " + valorDecTerce);
                    break;
                case 4:
                    n = -1;
                    System.out.println("Obrigado por testar!");
                    break;
            }
            if (n == -1) {
                break;
            }

        }
    }

}
