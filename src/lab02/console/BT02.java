/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngoth
 */
public class BT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        URL url = null ;
        try {
            url = new URL("http://hanu.vn");
        } catch (MalformedURLException ex) {
            Logger.getLogger(BT02.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedReader br = new BufferedReader (new InputStreamReader(url.openStream())) ;
            String line ;
            while ((line=br.readLine())!=null)
                    System.out.println(line) ;
            br.close() ;
        } catch (IOException ex) {
            Logger.getLogger(BT02.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
