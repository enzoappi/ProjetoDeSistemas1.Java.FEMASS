/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Apartamento;
import entities.Casa;
import entities.Imovel;
import entities.Residencial;
import entities.Terreno;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ut2u
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Imovel imovel = new Imovel("titulo", 0, "bairro", 0);
        System.out.println("Criei o objeto: imovel com as seguintes informacoes:"
                + "\ntitulo: " + imovel.getTitulo()
                + "\nvalor: R$" + imovel.getValor()
                + "\nbairro: " + imovel.getBairro()
                + "\nmetragem: " + imovel.getMetragem() + " m2\n");
        imovel.setTitulo("Femass");
        imovel.setValor(1000000);
        imovel.setBairro("Novo Cavaleiros");
        imovel.setMetragem(1500);
        System.out.println("Apos as insercoes, o objeto: imovel ficou assim:"
                + "\ntitulo: " + imovel.getTitulo()
                + "\nvalor: R$" + imovel.getValor()
                + "\nbairro: " + imovel.getBairro()
                + "\nmetragem: " + imovel.getMetragem() + " m2\n");
        
        Terreno terreno = new Terreno("titulo", 0, "bairro", 0);
        System.out.println("Criei o objeto: terreno com as seguintes informacoes:"
                + "\ntitulo: " + terreno.getTitulo()
                + "\nvalor: R$" + terreno.getValor()
                + "\nbairro: " + terreno.getBairro()
                + "\nmetragem: " + terreno.getMetragem() + " m2\n");
        terreno.setTitulo("314C");
        terreno.setValor(400000);
        terreno.setBairro("Vale dos Cristais");
        terreno.setMetragem(300000);
        System.out.println("Apos as insercoes, o objeto: imovel ficou assim:"
                + "\ntitulo: " + terreno.getTitulo()
                + "\nvalor: R$" + terreno.getValor()
                + "\nbairro: " + terreno.getBairro()
                + "\nmetragem: " + terreno.getMetragem() + " m2\n");
        
        Residencial residencial = new Residencial(0, 0, 0, "titulo", 0, "bairro", 0);
        System.out.println("Criei o objeto: residencial com as seguintes informacoes:"
                + "\nqtde de vagas de garagem: " + residencial.getQtdVagasGaragem()
                + "\nqtde de quartos: " + residencial.getQdtQuartos()
                + "\nqtde de suites: " + residencial.getQtdSuites()
                + "\ntitulo: " + residencial.getTitulo()
                + "\nvalor: R$"+ residencial.getValor()
                + "\nbairro: " + residencial.getBairro()
                + "\nmetragem: " + residencial.getMetragem() + " m2\n");
        residencial.setQtdVagasGaragem(142);
        residencial.setQdtQuartos(216);
        residencial.setQtdSuites(72);
        residencial.setTitulo("Residencial Macaense");
        residencial.setValor(50000000);
        residencial.setBairro("Praia Campista");
        residencial.setMetragem(800000);
        System.out.println("Apos as insercoes, o objeto: residencial ficou assim:"
                + "\nqtde de vagas de garagem: " + residencial.getQtdVagasGaragem()
                + "\nqtde de quartos: " + residencial.getQdtQuartos()
                + "\nqtde de suites: " + residencial.getQtdSuites()
                + "\ntitulo: " + residencial.getTitulo()
                + "\nvalor: R$"+ residencial.getValor()
                + "\nbairro: " + residencial.getBairro()
                + "\nmetragem: " + residencial.getMetragem() + " m2\n");
        
        Casa casa = new Casa(0, 0, 0, "titulo", 0, "bairro", 0);
        System.out.println("Criei o objeto: casa com as seguintes informacoes:"
                + "\nqtde de vagas de garagem: " + casa.getQtdVagasGaragem()
                + "\nqtde de quartos: " + casa.getQdtQuartos()
                + "\nqtde de suites: " + casa.getQtdSuites()
                + "\ntitulo: " + casa.getTitulo()
                + "\nvalor: R$"+ casa.getValor()
                + "\nbairro: " + casa.getBairro()
                + "\nmetragem: " + casa.getMetragem() + " m2\n");
        casa.setQtdVagasGaragem(3);
        casa.setQdtQuartos(4);
        casa.setQtdSuites(2);
        casa.setTitulo("Casa do Fulano");
        casa.setValor(500000);
        casa.setBairro("Gloria");
        casa.setMetragem(250000);
        System.out.println("Apos as insercoes, o objeto: casa ficou assim:"
                + "\nqtde de vagas de garagem: " + casa.getQtdVagasGaragem()
                + "\nqtde de quartos: " + casa.getQdtQuartos()
                + "\nqtde de suites: " + casa.getQtdSuites()
                + "\ntitulo: " + casa.getTitulo()
                + "\nvalor: R$"+ casa.getValor()
                + "\nbairro: " + casa.getBairro()
                + "\nmetragem: " + casa.getMetragem() + " m2\n");
        
        Apartamento apartamento = new Apartamento(0, false, "torre", 0, 0, 0, "titulo", 0, "bairro", 0);
        System.out.println("Criei o objeto: apartamento com as seguintes informacoes:"
                + "\nandar: " + apartamento.getAndar()
                + "\nsol nascente: " + apartamento.isSolNascente()
                + "\ntorre: " + apartamento.getTorre()
                + "\nqtde de vagas de garagem: " + apartamento.getQtdVagasGaragem()
                + "\nqtde de quartos: " + apartamento.getQdtQuartos()
                + "\nqtde de suites: " + apartamento.getQtdSuites()
                + "\ntitulo: " + apartamento.getTitulo()
                + "\nvalor: R$"+ apartamento.getValor()
                + "\nbairro: " + apartamento.getBairro()
                + "\nmetragem: " + apartamento.getMetragem() + " m2\n");
        apartamento.setAndar(4);
        apartamento.setSolNascente(true);
        apartamento.setTorre("C");
        apartamento.setQtdVagasGaragem(2);
        apartamento.setQdtQuartos(4);
        apartamento.setQtdSuites(1);
        apartamento.setTitulo("Apto do Ciclano");
        apartamento.setValor(750000);
        apartamento.setBairro("Praia do Pecado");
        apartamento.setMetragem(120000);
        System.out.println("Apos as insercoes, o objeto: apartamento ficou assim:"
                + "\nandar: " + apartamento.getAndar()
                + "\nsol nascente: " + apartamento.isSolNascente()
                + "\ntorre: " + apartamento.getTorre()
                + "\nqtde de vagas de garagem: " + apartamento.getQtdVagasGaragem()
                + "\nqtde de quartos: " + apartamento.getQdtQuartos()
                + "\nqtde de suites: " + apartamento.getQtdSuites()
                + "\ntitulo: " + apartamento.getTitulo()
                + "\nvalor: R$"+ apartamento.getValor()
                + "\nbairro: " + apartamento.getBairro()
                + "\nmetragem: " + apartamento.getMetragem() + " m2\n");
    }
}
