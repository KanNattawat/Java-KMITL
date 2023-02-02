/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natta
 */
import java.util.*;
public class Tower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a height of tower : ");
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            System.out.println("#-#-#-#-#");
        }
    }
}
