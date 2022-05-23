/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.Scanner;

/**
 *
 * @author ngoth
 */
public class Bai2 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Nhap n: " );
         String num = scanner.nextLine();
         //convert string to int
         int convert_input = Integer.parseInt(num);
         System.out.println("Ket qua tra ve:");
         for (int i = 1; i <= 10; i++)
         {
             System.out.println(convert_input+" x "+i +" = "+(convert_input*i));
         }
         
     }
}
