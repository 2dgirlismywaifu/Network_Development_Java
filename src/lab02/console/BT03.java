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
import java.net.URLConnection;

/**
 *
 * @author ngoth
 */
public class BT03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        URL url = null;
	BufferedReader in = null; 
	try {
		url = new URL("https://en.wikipedia.org/wiki/Computer_science");
	} catch(MalformedURLException e) { 
		System.out.println("Cannot find webpage " + url); 
                System.exit(-1);
	}
	
	try {
		URLConnection	aConnection = url.openConnection();
		in = new BufferedReader(
		new InputStreamReader(aConnection.getInputStream()));
	}
	catch (IOException e) {
		System.out.println("Cannot connect to webpage " + url); System.exit(-1);
	}
	try {
	// Now read the webpage file
		String lineOfWebPage;
		while ((lineOfWebPage = in.readLine()) != null) System.out.println(lineOfWebPage);
		in.close(); // Close the connection to the net
	} catch(IOException e) {
		System.out.println("Cannot read from webpage " + url);
	}

    }
    
}
