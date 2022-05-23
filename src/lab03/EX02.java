/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author notmiyouji
 */
public class EX02 {
    public static void main(String[] args) { 
        Scanner console = new Scanner(System.in); 

        System.out.print("URL to download? "); 

        String urlString = console.nextLine(); 

       

        Downloader down = null;   // create a downloader; 

        while (down == null) {    // re-prompt the user if this fails
            down = new Downloader(urlString); 

        } 

         

        System.out.print("Target file name: "); 

        String targetFileName = console.nextLine(); 

         

        // download bytes to file (print error if it fails)
        
        down.download(targetFileName);
        System.out.println("Downloaded successfully") ; 
        
    }
}
