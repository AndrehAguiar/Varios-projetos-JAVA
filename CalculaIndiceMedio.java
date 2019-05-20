/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indicePluviometricoMedio;

import java.util.Scanner;

/**
 *
 * @author André Aguiar - RA 116115927
 */
public class CalculaIndiceMedio {
    public static void main(String[]args){
        
        float indice = 0, somaIndice = 0, indiceMedio, indiceMax = 0, qtdDias = 0, diaIndiceMax = 0;
                
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 1; (i <= 31) & (indice != -1);  i++){ 
            System.out.printf("Digite o indice do dia "+i+" ou -1 para finalizar.");
            indice = entrada.nextFloat();
            somaIndice = indice + somaIndice;
            qtdDias = i;
            if (indice > indiceMax){
                indiceMax=indice;
                diaIndiceMax = i;
            }
        
        }  
        indiceMedio = (somaIndice+1)/(qtdDias-1);    
        System.out.println("O indice máximo registrado é "+indiceMax+" e foi registrado no dia "+diaIndiceMax);
        System.out.println("A média dos indices registrados é: "+indiceMedio);            
    }
        
} 