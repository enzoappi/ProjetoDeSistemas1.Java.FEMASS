/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Person;
import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author enzoappi
 */
public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        //1.1 Product Discount calculation
        double price;
        int code;
        
        price = Double.parseDouble(JOptionPane.showInputDialog("Product price: "));
        JOptionPane.showMessageDialog(null, "Discount codes:\n"
                + "[ 1 ] - for 5% discount\n"
                + "[ 2 ] - for 10% discount\n"
                + "[ 3 ] - for 20% discount\n"
                + "[ 4 ] - for 50% discount");
        code = Integer.parseInt(JOptionPane.showInputDialog("Discount code number [1, 2, 3 or 4]: "));
        
        Product product = new Product(price, code);
        product.discountPrice();
        
        JOptionPane.showMessageDialog(null, "Product Data:\n" 
                + "Original Price: U$" + String.format("%.2f%n", product.getPrice()) 
                + "Final price (with discount): U$" + String.format("%.2f%n", product.getFinalPrice()));
        
        //1.2 Max and min age
        String name;
        int age;
        
        List<Person> list = new ArrayList<>(4);
        
        for(int i = 1; i <= 4; i++) {
            name = JOptionPane.showInputDialog("Name: ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
            
            list.add(new Person(name, age));
            
            }
    
        int ageMax = list.get(0).getAge();
        int ageMin = list.get(0).getAge();
        
        
        for(Person lp : list) {
            if(lp.getAge() < ageMin) {
                ageMin = lp.getAge();
            }
            else if(lp.getAge() > ageMax) {
                ageMax = lp.getAge();
            }
        }      
        
        JOptionPane.showMessageDialog(null, "Data Persons inserted:\n\n" 
                + "Name: " + list.get(0).getName() 
                + " - age: " + list.get(0).getAge() 
                + "\nName: " + list.get(1).getName() 
                + " - age: " + list.get(1).getAge() 
                + "\nName: " + list.get(2).getName() 
                + " - age: " + list.get(2).getAge() 
                + "\nName: " + list.get(3).getName() 
                + " - age: " + list.get(3).getAge());
        
        JOptionPane.showMessageDialog(null, "DATA ANALYSIS RESULTS: " 
                + "\nMIN age: " + ageMin 
                + "\nMAX age: " + ageMax);
    } 
}
