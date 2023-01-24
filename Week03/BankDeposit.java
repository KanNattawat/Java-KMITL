/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natta
 */
import java.util.*;
public class BankDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble(), ans;
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char account_type = sc.next().charAt(0);
        if (account_type == 'A' | account_type == 'C') {
            ans = money * (1.5 / 100);
        } else if (account_type == 'B') {
            ans = money * (2.0 / 100);
        } else {
            ans = money * (5.0 / 100);
        }
        System.out.println("Your total money in one year = " +(int)(ans + money));
    }
}
