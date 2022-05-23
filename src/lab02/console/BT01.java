/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.console;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngoth
 */
public class BT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            URL url = new URL("http://java.sun.com:80/docs/books/tutorial/intro.html#DOWNLOADING") ;
            System.out.println("Protocol = "+url.getProtocol()) ;
            System.out.println("Host     = "+url.getHost()) ;
            System.out.println("FileName = "+url.getFile()) ;
            System.out.println("Port     = "+url.getPort()) ;
            System.out.println("Reference= "+url.getRef()) ;
        } catch (MalformedURLException ex) {
            Logger.getLogger(BT01.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
