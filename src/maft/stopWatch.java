/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maft;

import javax.swing.JTextPane;

/**
 *
 * @author Acer
 */
public class stopWatch {
    boolean counterStatus = false;
    double start;
    
    public void stopthewatch() {
        start = 0;
        counterStatus = false;
    } 

    public void start(){
        start = System.currentTimeMillis();
        counterStatus = true;
    }
    
    public String displayTime() {
        String time = "";
        return time;
    }
    
    public boolean counterStatus(){
        return counterStatus;
    }
    
    public double elapsedTime() {
        if(start == 0) { return 0; } //You need to start it first
        double time = (double) ((System.currentTimeMillis() - start) / 1000.0);
        stopthewatch();
        //start = 0; // reset start to allow you to start it again later
        return time;
    }
}
class counterThread extends Thread {
    JTextPane textPaneElapsedTime = new JTextPane();
    public String counterValue = "";
    counterThread(JTextPane textPaneElapsedTime){
        this.textPaneElapsedTime = textPaneElapsedTime;
    }
    public void run(){
        int count = 0; 
        for(;;) { 
            try { 
                counterThread.sleep(1000); 
                count ++;
                counterValue = String.valueOf(count);
                textPaneElapsedTime.setText(counterValue+"s");
            } catch (InterruptedException e) { 
                // TODO Auto-generated catch block 
                e.printStackTrace(); 
            } 
        }
    }
    public String counterValue(String count){
        return counterValue;
    }
}
