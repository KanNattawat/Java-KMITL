/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_1;

/**
 *
 * @author natta
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            double x1 = (-b + Math.sqrt(Math.pow(b, 2)-(4*a*c))) /  (2*a);
            double x2 = (-b - Math.sqrt(Math.pow(b, 2)-(4*a*c))) /  (2*a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } catch (NumberFormatException ex) {
            System.out.println("Please input data in number format only.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please enter 3 number as a, b, and c respectively.");
        }
        }
}
