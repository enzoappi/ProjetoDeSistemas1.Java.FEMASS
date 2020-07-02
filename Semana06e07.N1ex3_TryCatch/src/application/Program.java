/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import util.TestaValorPositivo;

/**
 *
 * @author enzoappi
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = 0, cont = 0;
        
        try {
            System.out.print("Digite a qtde de numeros que serao inseridos: ");
            n = sc.nextInt();
            TestaValorPositivo.valorMaiorQueZero(n);
            do{  
                try{            
                    System.out.print("Digite o " + (cont + 1) + "o numero: ");
                    int numero = sc.nextInt();
                    cont++;
                }
                catch (InputMismatchException ime) {
                    System.out.println("ERRO: " + ime.toString() + "\nO numero deve ser do tipo INTEIRO!\n");
                    sc.nextLine();
                }
            }while(cont != n);
        }
        catch (InputMismatchException ime) {
            System.out.println("ERRO: " + ime.toString() + "\nO numero deve ser do tipo INTEIRO e MAIOR que ZERO!");
        }
    }
}
