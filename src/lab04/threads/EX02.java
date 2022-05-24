/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04.threads;

/**
 *
 * @author ngoth
 */
//dùng Runnable
//Explain: cũng như bài 1 nhưng ở đây ta dùng thực thi là Runnable và khai báo một thread mới dựa vào class EX02 
public class EX02 implements Runnable  {
    
    @Override
    public void run() {
        int count = 10;
        for (int i = count; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Time is up");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EX02 countDownThread = new EX02();
        Thread thread = new Thread(countDownThread);
        thread.start();
    }
    
}
