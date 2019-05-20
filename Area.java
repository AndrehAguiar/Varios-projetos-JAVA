/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaArea;
import java.util.Scanner;
/**
 *
 * @author André Aguiar - RA 116115927
 */
public class Area {
    public static void main(String[]args){
        float base, altura, area, perimetro;
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Informe a altura da figura: ");
        altura = ler.nextInt();
        System.out.printf("Informe a base da figura: ");
        base = ler.nextInt();
        area = base * altura;
        perimetro = (base * 2)+(altura * 2);
        
        System.out.println("A área do retângulo, ou quadrado = base ("+ base +") multiplicado pela altura ("+ altura +") então a área da figura informada é "+ area);
        System.out.println("O perímetro do retângulo, ou quadrado = (base ("+ base +"), multiplicado por 2) + ( altura ("+ altura +") multiplicado por 2) então a perímetro da figura informada é "+ perimetro);
    }
    
}
