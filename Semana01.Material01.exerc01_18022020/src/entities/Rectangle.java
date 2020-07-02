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
public class Rectangle {
    
    protected Double height;
    protected Double width;
    protected Double perimeter;
    protected Double area;

    public Rectangle() {
    }

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }
    
    public void calcPerimeter() {
        this.perimeter = ((this.height * 2) + (this.width * 2));
    }
    
    public void calcArea() {
        this.area = (this.height * this.width);
    }   
}
