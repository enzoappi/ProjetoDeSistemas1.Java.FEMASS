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
public class Product {
    
    protected Double price;
    protected Integer code;
    protected Double finalPrice;

    public Product() {
    }

    public Product(Double price, Integer code) {
        this.price = price;
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }
    
    public void discountPrice() {
        switch(this.code) {
            case 1:
                this.finalPrice = this.price * 0.95;
                break;
            case 2:
                this.finalPrice = this.price * 0.90;
                break;
            case 3:
                this.finalPrice = this.price * 0.80;
                break;
            case 4:
                this.finalPrice = this.price * 0.50;
                break;
        }
    }
}
