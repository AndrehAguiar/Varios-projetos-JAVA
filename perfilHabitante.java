/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabilizaHabitanteFeminino;

import java.util.Scanner;

/**
 *
 * @author André Aguiar - RA 116115927
 */
public class perfilHabitante {
    public static void main(String[] args){
        
        int idade, somaPerfil = 0;
        String sexo, corCabelo, corOlho;
        Scanner ler = new Scanner(System.in);
        
        for (int i = 0; i <= 999999; i++){
            System.out.printf("Informe a idade da pessoa: ");
            idade = ler.nextInt();
            if (idade == -1){
                break;
            }else if (idade != -1){
                System.out.printf("Informe o sexo da pessoa, F para feminino e M para masculino: ");
                sexo = ler.next();

                System.out.printf("Informe a cor do cabelo da pessoa: ");
                corCabelo = ler.next();

                System.out.printf("Informe a cor do olho da pessoa: ");
                corOlho = ler.next();
                if ((idade >= 18) & (idade <=35) & ((sexo.equals("f") | (sexo.equals("F"))))){
                         somaPerfil++;
                }
            }
        }
        System.out.println("A quantidade de pessoas do sexo feminino com idade de 18 a 35 anos é: "+somaPerfil);
    }
    
}
