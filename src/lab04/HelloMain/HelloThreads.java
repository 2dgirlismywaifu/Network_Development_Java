/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04.HelloMain;

/**
 *
 * @author ngoth
 */
public class HelloThreads extends Thread {
    @Override
    public void run() 
    {
        int index = 1;

        for (int i = 0; i < 10; i++) {
           System.out.println("HelloThread running " + index++);
           try {
               // Sleep 1030 milliseconds.
               Thread.sleep(1030);
           } catch (InterruptedException e) {
               System.out.println("Thread error!");
           }
       }
       System.out.println("HelloThread stopped!");
	}
    }
