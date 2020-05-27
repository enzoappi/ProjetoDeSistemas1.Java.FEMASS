/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.util.ArrayList;

/**
 *
 * @author enzoappi
 */
public class ArrayListTypeConverter {

    public static void ConvtStrNmbsToIntNmbs(String numericPhrase, ArrayList<Integer> convertedList) {
        String numericPhraseTemp = numericPhrase.replaceAll("[^0-9\\.;]+", "");
        String[] splitedNumericPhrase = numericPhraseTemp.split(";");
        for(String word: splitedNumericPhrase) {
            convertedList.add(Integer.parseInt(word));
        }
    }
}
