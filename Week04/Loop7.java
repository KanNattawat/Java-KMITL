/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natta
 */
import java.util.*;
public class Loop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, odd = 0, even = 0;
        while (true) {
            num = sc.nextInt();
            if (num == -1) {
                break;
            } else if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        } System.out.println("Odd number = " + odd + " and Even number = " + even);

    }
}
