/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05.ex03;

/**
 *
 * @author notmiyouji
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ServerSocket listener = null;
 
       System.out.println("Server is waiting to accept user...");
       int clientNumber = 0;
 
       try {
           listener = new ServerSocket(7777);
       } catch (IOException e) {
           System.out.println(e);
           System.exit(1);
       }
 
       try {
           while (true) {
               Socket socketOfServer;
               try {
                   socketOfServer = listener.accept();
                   new ServiceThread(socketOfServer, clientNumber++).start();
               } catch (IOException ex) {
                   Logger.getLogger(ServerProgram.class.getName()).log(Level.SEVERE, null, ex);
               }               
           }
       } finally {
            try {
                listener.close();
            } catch (IOException ex) {
                Logger.getLogger(ServerProgram.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
 
   }
 
   private static void log(String message) {
       System.out.println(message);
   }
 
   private static class ServiceThread extends Thread {
 
       private int clientNumber;
       private Socket socketOfServer;
 
       public ServiceThread(Socket socketOfServer, int clientNumber) {
           this.clientNumber = clientNumber;
           this.socketOfServer = socketOfServer;
 
           // Log
           log("New connection with client# " + this.clientNumber + " at " + socketOfServer);
       }
 
       @Override
       public void run() {
 
           try {   
               BufferedReader is = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
               BufferedWriter os = new BufferedWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));
 
               while (true) {
                   String line = is.readLine();
 
                   os.write(">> " + line);
                   os.newLine();
                   os.flush();
 
                   if (line.equals("QUIT")) {
                       os.write(">> OK");
                       os.newLine();
                       os.flush();
                       break;
                   }
               }
 
           } catch (IOException e) {
               System.out.println(e);
               e.printStackTrace();
           }
       }
    }  
}
