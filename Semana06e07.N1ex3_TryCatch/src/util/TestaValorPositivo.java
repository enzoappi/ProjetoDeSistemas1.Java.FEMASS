/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.InputMismatchException;

/**
 *
 * @author enzoappi
 */
public class TestaValorPositivo {
    
    public static void valorMaiorQueZero(int valor) {
        if(valor < 0) {
            throw new InputMismatchException();
        }
    }
}
