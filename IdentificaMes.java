/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InformaMes;

import java.util.Scanner;

/**
 *
 * @author André Aguiar - RA 116115927
 */
public class IdentificaMes {
    public static void main(String[]args){
        
        int numMes;
        String mes;
        
        System.out.printf("Qual o número do mês?");
        Scanner entrada = new Scanner(System.in);
        numMes = entrada.nextInt();
        switch (numMes){
            case 1:
                System.out.println("O mês "+numMes+" é Janeiro");
                break;
            case 2:
                System.out.println("O mês "+numMes+" é Fevereiro");
                break;
            case 3:
                System.out.println("O mês "+numMes+" é Março");
                break;
            case 4:
                System.out.println("O mês "+numMes+" é Abril");
                break;
            case 5:
                System.out.println("O mês "+numMes+" é Maio");
                break;
            case 6:
                System.out.println("O mês "+numMes+" é Junho");
                break;
            case 7:
                System.out.println("O mês "+numMes+" é Julho");
                break;
            case 8:
                System.out.println("O mês "+numMes+" é Agosto");                
                break;
            case 9:
                System.out.println("O mês "+numMes+" é Setembro");
                break;
            case 10:
                System.out.println("O mês "+numMes+" é Outubro");
                break;
            case 11:
                System.out.println("O mês "+numMes+" é Novembro");
                break;
            case 12:
                System.out.println("O mês "+numMes+" é Dezembro");
                break;
        }
    }
}
