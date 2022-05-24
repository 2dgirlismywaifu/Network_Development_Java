/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04.multi_threads;

/**
 *
 * @author ngoth
 */


class A extends Thread
{
       @Override
       public void run()
         {
              System.out.println("Thread A started");
              for(int i=1;i<=4;i++)
                {
                    System.out.println("\t From ThreadA: i= "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println("Exit from A");
         }
}

class B extends Thread
{
       @Override
       public void run()
         {
              System.out.println("Thread B started");
              for(int j=1;j<=4;j++)
                {
                    System.out.println("\t From ThreadB: j= "+j);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println("Exit from B");
         }
}
class C extends Thread
{
       @Override
       public void run()
         {
              System.out.println("Thread C started");
              for(int k=1;k<=4;k++)
                {
                    System.out.println("\t From ThreadC: k= "+k);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println("Exit from C");
         }
}


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //now call all threads
        new A().start();
        new B().start();
        new C().start();

    }
    
}
