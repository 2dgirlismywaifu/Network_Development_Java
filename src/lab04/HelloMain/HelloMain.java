/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04.HelloMain;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngoth
 */
public class HelloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               int idx = 1;
 
       for (int i = 0; i < 2; i++) {
           try {
               System.out.println("Main thread running " + idx++);
               // Sleep 2101 milliseconds.
               Thread.sleep(2101);
           } catch (InterruptedException ex) {
               Logger.getLogger(HelloMain.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
 
       HelloThreads helloThread = new HelloThreads();
 
       // Run thread
       helloThread.start();
 
       for (int i = 0; i < 3; i++) {
           try {
               System.out.println("Main thread running " + idx++);
               // Sleep 2101 milliseconds.
               Thread.sleep(2101);
           } catch (InterruptedException ex) {
               Logger.getLogger(HelloMain.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       System.out.println("==> Main thread stopped");
    }    
}
