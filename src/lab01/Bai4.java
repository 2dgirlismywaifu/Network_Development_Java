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
public class Bai4 {
    
    public static void countText(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
         for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                    letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                    num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                    space ++ ;
            }
            else{
                    other ++;
            }
        }
            
            System.out.println("Chữ cái: " + letter);
            System.out.println("Dấu cách: " + space);
            System.out.println("Số: " + num);
            System.out.println("Khác: " + other);
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap  chuoi theo y muon: " );
        String text = scanner.nextLine();
        System.out.println("Chuoi vua nhap: " + text);
        countText(text);
    }
    
}
