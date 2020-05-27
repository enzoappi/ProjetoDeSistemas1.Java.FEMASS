/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Lists;
//import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author enzoappi
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        Lists lists = new Lists();
        
        for(int i = 0; i < 6; i++){
            System.out.print("Digite o " + (i + 1) + "º numero inteiro positivo: ");
            num = sc.nextInt();
            if(num != 0 && num % 3 == 0) {
                lists.setBasico(num);
                lists.setMultiploDeTres(num);
            }
            else if(num != 0 && num % 4 == 0) {
                lists.setBasico(num);
                lists.setMultiploDeQuatro(num);
            }
            else {
                lists.setBasico(num);
                lists.setRestante(num);
            } 
        }
        
        System.out.println("\nRESULTADOS DOS DADOS (antes da ordenacao):"
                + "\nArray BASICO: " + lists.getBasico()
                + "\nArray dos MULTIPLOS de TRÊS: " + lists.getMultiploDeTres()
                + "\nArray dos MULTIPLOS de QUATRO: " + lists.getMultiploDeQuatro()
                + "\nArray RESTANTE: " + lists.getRestante());
        
        lists.sortList();
        
        System.out.println("\nRESULTADOS DOS DADOS (depois da ordenacao):"
                + "\nArray BASICO: " + lists.getBasico()
                + "\nArray dos MULTIPLOS de TRÊS: " + lists.getMultiploDeTres()
                + "\nArray dos MULTIPLOS de QUATRO: " + lists.getMultiploDeQuatro()
                + "\nArray RESTANTE: " + lists.getRestante());
        
        sc.close();
    }
}
