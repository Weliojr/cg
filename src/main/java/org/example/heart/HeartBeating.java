package org.example.heart;

import java.awt.*;
import javax.swing.*;
public class HeartBeating extends JFrame{
    int y = 250;
    int x = 300;
    public HeartBeating(){
    //  setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(x,y);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        // add(js,BorderLayout.CENTER);
    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        //g2d.drawString("Hello world!",30,50);
        g2d.setBackground(Color.white);    
        long data = System.currentTimeMillis();
        int n = 10;
        for(int o=0;o<n;o++){
            g2d.setColor(Color.black);
            int j1 = 125;
            int j2 = 175;
            int j3 = 125;
            int j4= 75;
            for(int i=0; i<=50;i++){
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            g2d.drawLine(i, 125, i, 125);
            }
            for(int i=50;i<=100;i++){
                j1++;
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
                g2d.drawLine(i, j1, i, j1);
             }
            for(int i=100;i<=150;i++){
                j2--;
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
                g2d.drawLine(i, j2, i, j2);
            }
            for(int i=150;i<=200;i++){
                j3--;
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
                g2d.drawLine(i, j3, i, j3);
            }
            for(int i=200;i<=250;i++){
                j4++;
                try {
                Thread.sleep(1);
                 } catch (InterruptedException e) {
                e.printStackTrace();
                }
            g2d.drawLine(i, j4, i, j4);
            }
            for(int i=250;i<=300;i++){
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            g2d.drawLine(i, 125, i, 125);
            }
            g2d.setColor(Color.white);
            int y1 = 125;
            int y2 = 175;
            int y3 = 125;
            int y4= 75;
            for(int i=0; i<=50;i++){
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            g2d.drawLine(i, 125, i, 125);
            }
            for(int i=50;i<=100;i++){
                y1++;
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
                g2d.drawLine(i, y1, i, y1);
             }
            for(int i=100;i<=150;i++){
                y2--;
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
                g2d.drawLine(i, y2, i, y2);
            }
            for(int i=150;i<=200;i++){
                y3--;
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
                g2d.drawLine(i, y3, i, y3);
            }
            for(int i=200;i<=250;i++){
                y4++;
                try {
                Thread.sleep(1);
                 } catch (InterruptedException e) {
                e.printStackTrace();
                }
            g2d.drawLine(i, y4, i, y4);
            }
            for(int i=250;i<=300;i++){
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            g2d.drawLine(i, 125, i, 125);
            }
       
        
        }
            
    
        
        
    }
    public static void main(String[] args) {
        new HeartBeating();
    }
    
}
