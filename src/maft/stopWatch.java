/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maft;

/**
 *
 * @author Acer
 */
public class stopWatch {
    double start;
    
    public void stopthewatch() {
        start = 0;
    } 

    public void start(){
        start = System.currentTimeMillis();
    }
    
    public double elapsedTime() {
        if(start == 0) { return 0; } //You need to start it first
        double time = (double) ((System.currentTimeMillis() - start) / 1000.0);
        start = 0; // reset start to allow you to start it again later
        return time;
    }
}
