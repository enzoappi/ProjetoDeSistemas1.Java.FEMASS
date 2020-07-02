/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Tv;
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
        
        System.out.print("\n----------TV1----------\n");
        Tv tv1 = new Tv();
        System.out.print("\nTv is " + tv1.getPower() + "\n");
        System.out.println("Turning on...");
        tv1.setPower();
        System.out.print("Tv is now " + tv1.getPower()
                + "\nChannel: " + tv1.getChannel()
                + "\nVolume: " + tv1.getVolume()
                + "\n");
        System.out.println("\nChanging to a specific channel and volume...");
        tv1.setChannel(999);
        tv1.setVolume(100);
        System.out.print("Channel: " + tv1.getChannel()
                + "\nVolume: " + tv1.getVolume()
                + "\n");
        System.out.println("\nIncreasing channel and volume...");
        tv1.changeChannelUp();
        System.out.print("Channel: " + tv1.getChannel() + "\n");
        tv1.increaseVolume();
        System.out.print("Volume: " + tv1.getVolume()
                + "\n");
        System.out.println("\nDecreasing channel and volume...");
        tv1.changeChannelDown();
        System.out.print("Channel: " + tv1.getChannel() + "\n");
        tv1.decreaseVolume();
        System.out.print("Volume: " + tv1.getVolume()
                + "\n");
        System.out.println("\nTurning off...");
        tv1.setPower();
        System.out.print("Tv is now " + tv1.getPower());
        
        System.out.print("\n\n----------TV2----------\n");
        Tv tv2 = new Tv(42);
        System.out.print("\nTv is " + tv2.getPower() + "\n");
        System.out.print("Channel: " + tv2.getChannel()
                + "\nVolume: " + tv2.getVolume()
                + "\n");
        System.out.println("\nChanging to a specific channel and volume...");
        tv2.setChannel(0);
        tv2.setVolume(2);
        System.out.print("Channel: " + tv2.getChannel()
                + "\nVolume: " + tv2.getVolume()
                + "\n");
        System.out.println("\nDecreasing channel and volume...");
        tv2.changeChannelDown();
        System.out.print("Channel: " + tv2.getChannel() + "\n");
        tv2.decreaseVolume();
        System.out.print("Volume: " + tv2.getVolume()
                + "\n");
        System.out.println("\nDecreasing channel and volume...");
        tv2.changeChannelDown();
        System.out.print("Channel: " + tv2.getChannel() + "\n");
        tv2.decreaseVolume();
        System.out.print("Volume: " + tv2.getVolume()
                + "\n");
        System.out.println("\nIncreasing channel and volume...");
        tv2.changeChannelUp();
        System.out.print("Channel: " + tv2.getChannel() + "\n");
        tv2.increaseVolume();
        System.out.print("Volume: " + tv2.getVolume()
                + "\n");
        System.out.println("\nTurning off...");
        tv2.setPower();
        System.out.print("Tv is now " + tv2.getPower() + "\n");
    }
}
