/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04.threads;

/**
 *
 * @author ngoth
 */
//Kế thừa threads
//Explain: Đếm ngược từ 10. Sau một lần đếm thread sẽ sleep trong 1s sau đó tiếp tục như thế cho đến khi 
// count = 0, vòng lặp for dừng và in ra màn hình "Hết giờ"
public class EX01 extends Thread{

    @Override
    public void run()
    {
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
        EX01 countDownThread = new EX01();
        countDownThread.start();

    }
    
}
