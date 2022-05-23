/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author notmiyouji
 */
public class EX01 {
     public static void main(String[] args) { 
      //Input Stream   
      try { 
          InputStream in = new FileInputStream("data.txt"); 
          byte[] temp = new byte[10]; 
          int i = -1; 

          while ((i = in.read(temp)) != -1) { 

              String s = new String(temp, 0, i); 

              System.out.println(s);
              System.out.println("File FOUND!");

          } 

          in.close(); 

      } catch (IOException e) { 
          System.out.println("File NOT FOUND!");
      } 
      
      //Output stream
      //the dir folder may difficult than windows
      try { 

           File dir = new File("/home/notmiyouji/Documents/GitHub/Network_development_Java//Test"); 
           dir.mkdirs();                       
           OutputStream os = new FileOutputStream("/home/notmiyouji/Documents/GitHub/Network_development_Java//Test/test_writerOutputStream.txt");  
           //input string by using array.
           byte[] by = new byte[] { 'H', 'e', 'l', 'l', 'o', ' ', 31, 34, 92 }; 
           byte[] by2 = new byte[] { 'H', 'e', 'l', 'l', 'o', ' ', 'b', 'o', 'y' }; 
          
          os.write(by); 
          os.flush(); 
          os.write(by2); 
          os.close(); 
      } catch (IOException e) { 
          System.out.println("File NOT FOUND!");
      } 

  } 
}
