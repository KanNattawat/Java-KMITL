/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natta
 */
import java.util.*;
public class SalaryWithTax {
    public static void main(String[] args) {
        double salary, tax;
        Scanner sc = new Scanner(System.in);
        salary = sc.nextDouble();
        if (salary > 50000) {
            tax = salary * (10.0 / 100);
        } else {
            tax = salary * (5.0 / 100);
        }
        System.out.println(tax);
    }
}
