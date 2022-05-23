/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notmiyouji
 */
public class Downloader {
    private URL url; 

     

    // Constructs downloader to read from the given URL. 

    public Downloader(String urlString) { 

        try { 
            url = new URL(urlString);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Downloader.class.getName()).log(Level.SEVERE, null, ex);
        }

    } 

    
    // Reads downloader's URL and writes contents to the given file. 

    public void download(String targetFileName) { 
        FileOutputStream out;
        InputStream in; 
        try {
            in = url.openStream();
            out = new FileOutputStream(targetFileName);
            while (true) { 

            int n = in.read(); 

            if (n == -1) {      // -1 means end-of-file 

                break; 

            } 

            out.write(n); 

        } 

        in.close(); 

        out.close(); 
        } catch (IOException ex ) {
            Logger.getLogger(Downloader.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 
}
