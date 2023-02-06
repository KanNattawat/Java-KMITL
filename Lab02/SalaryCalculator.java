/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natta
 */
import java.util.*;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt(), salary, salary_bonus = 0;
        System.out.print("Please insert number of working days : ");
        int working_day = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        int absent_day = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        int weight  = sc.nextInt();
        if (age > 20 && age < 31) {
            salary = (working_day * 300) - (absent_day * 50); 
        } else if (age  > 30 && age < 41) {
            salary = (working_day * 500) - (absent_day * 50); 
        } else if (age > 40 && age < 51) {
            salary = (working_day * 1000) - (absent_day * 50); 
        } else {
            salary = (working_day * 3000); 
        }
        if (weight > 9 && weight < 61) {
            salary_bonus = salary + 5000;
        } else if (weight > 60 && weight < 91) {
            salary_bonus = salary + (5000 - ((weight - 60) * 10));
        }
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        System.out.println("Your salary and bonus is " + salary_bonus + " Baht");
    }
}
