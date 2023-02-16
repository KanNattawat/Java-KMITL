/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natta
 */
public class Cat {
    private String name;
    private String color;
    public double height;
    public double weight;
    private void setWeight (double w) {
        if (w > 0) {
            weight = w;
        } else {
            System.out.println("Error");
        }
    }
    private void setHeight (double h) {
        if (h > 0) {
            height = h;
        } else {
            System.out.println("Error");
        }
    }
    private void setName (String n) {
        name = n;
    }
    private void setColor (String c) {
        color = c;
    }
    public void upWeight (double w) {
        setWeight(w);
    }
    public void downWeight (double w) {
        setWeight(w);
    }
    public void upHeight (double h) {
        setHeight(h);
    }
    public void defineCat (String  n, String c) {
        setName(n);
        setColor(c);
    }
    public void speak () {
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
    }
}
