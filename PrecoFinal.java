/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaPreco;

/**
 *
 * @author André Aguiar - RA 116115927
 */
import java.util.*;

public class PrecoFinal {
    public static void main2 (String args[]){
        
            float precoNormal;
            float compra;
            int condPagamento;
            String mensagem = "Digite um valor válido";
            
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o valor do produto na etiqueta etiqueta?");
        precoNormal = entrada.nextFloat();
        System.out.println("Como deseja pagar?");
        System.out.println("1 - À vista em dinheiro com 10% de desconto, 3 - APENAS OLHAR");
        System.out.println("2 - À vista no cartão de crédito, com 5% de desconto");
        System.out.println("3 - Em 2 vezes sem juros");        
        System.out.println("4 - Em 3 vezes,com 10% de juros.");
        condPagamento = entrada.nextInt();
        switch(condPagamento){
            case 1:
                compra = (float) (precoNormal - (precoNormal * 0.10));            
                System.out.println("O valor final com desconto de 10% é "+compra);           
            break;     
            case 2:
                compra = (float) (precoNormal - (precoNormal * 0.05));  
                System.out.println("O valor final com desconto de 5% é "+compra );
                break;
            case 3:
                compra = (float) (precoNormal / 2 ); 
                System.out.println("O valor do produto parcelado em 2 vezes sem juros é "+precoNormal+ ", será pago em 2 parcelas de "+compra );
                break;
            case 4:
                System.out.println("O valor do produto é "+precoNormal);
                precoNormal = (float) (precoNormal * 1.10 );
                compra = (float) (precoNormal / 3 ); 
                System.out.println("O valor final do produto parcelado em 3 vezes com juros de 10% é "+precoNormal+ ", será pago em 3 parcelas de "+compra);
                break;
            default:                
                System.out.println(mensagem);
                break;
        }
    }
}
