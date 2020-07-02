/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author enzoappi
 */
public class Tv {
    
    private Boolean power = false;
    private Integer channel = null;
    private Integer volume = null;

    public Tv() {
    }
    
    public Tv(int channel) {
        this.power = true;
        this.channel = channel;
        this.volume = 25;
    }

    public String getPower() {
        if(this.power) {
            return "(power) ON.";
        }
        else {
            return "(power) OFF";
        }
    }

    public void setPower() {
        if(this.power) {
            this.power = false;
        }
        else {
            this.power = true;
            this.channel = 3;
            this.volume = 10;
        }
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    
    public void changeChannelUp() {
        if(this.channel < 999) {
            this.channel += 1;
        }
        else {
            this.channel = 0;
        }
    }
    
    public void changeChannelDown() {
        if(this.channel > 0) {
            this.channel -= 1;
        }
        else {
            this.channel = 999;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void increaseVolume() {
        if(this.volume < 100) {
            this.volume += 1;
        }
        else {
            System.out.print("Volume MAX reached ->");
        }
    }
    
    public void decreaseVolume() {
        if(this.volume > 0) {
            this.volume -= 1;
        }
        if(this.volume == 1){
            System.out.print("Volume MIN reached ->");
        }
        if(this.volume == 0){
            System.out.print("Volume MUTED ->");
        }
    }
}
