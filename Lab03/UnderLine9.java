/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natta
 */
import java.util.*;
public class UnderLine9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int myinput = sc.nextInt();
        for (int i = 1; i <= myinput; i++) {
            if (i % 5 == 0) {
                System.out.print("|");
                System.out.println("");
            } else {
                System.out.print("|");
            }
        }
    }
}
