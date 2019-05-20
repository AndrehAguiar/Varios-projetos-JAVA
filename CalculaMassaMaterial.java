/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaMassa;

import java.util.Scanner;

/**
 *
 * @author André Aguiar - RA 116115927
 */
public class CalculaMassaMaterial {
    
    public static void main(String[] args){
    
    float massa, crono = 0, massaInicial, massaFinal, timeTotal;
    Scanner ler = new Scanner(System.in);
    
        System.out.println("Informe a massa (em gramas): ");
        float m = ler.nextFloat();
        for (float i = m; 0.05 <= i;){
                                
                massaInicial = m;
                massaFinal = i/2;
                i = massaFinal;
                crono++;
                timeTotal = (crono*50);
            
                System.out.println("A massa inicial foi: "+massaInicial+"grs.");  
                System.out.println("A massa final é: "+massaFinal+"grs.");
                System.out.println("O a massa foi reduzida: "+crono+" vezes.");
                System.out.println("O tempo gasto foi de: "+timeTotal+"s." + "\n" );
        }         
    }
}
