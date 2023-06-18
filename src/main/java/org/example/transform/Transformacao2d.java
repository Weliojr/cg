package org.example.transform;
import org.example.Matrizes.*;
import org.netlib.util.doubleW;

import java.util.ArrayList;


public class Transformacao2d {

    private double[][] matriz = {{ 1,2,1,2},{1,1,2,2},{1,1,1,1}};
    

    

    
    public void tranladar(int tX, int tY){
        double[][] matrizT = {{1,0,tX},{0,1,tY},{0,0,1}};

    }
    public void escalar(int sX, int sY){
        double[][] matrizS = {{sX,0,0},{0,sY,0},{0,0,1}};
    }
    public void rotacionarPositivo(int rX, int rY){
        double cosseno = Math.cos(rX);
        double seno = Math.sin(rY);
        double[][] matrizR = {{cosseno,(-seno),0},{seno,cosseno, 0},{0,0,1}};
    }
    public void rotacionarNegativo(int rX, int rY){
        double cosseno = Math.cos(rX);
        double seno = Math.sin(rY);
        double[][] matrizR = {{cosseno,seno,0},{(-seno),cosseno, 0},{0,0,1}};
    }
    public void refletirX(int refX, int refY){
        double[][] matrizR = {{1,0,0},{0,-1, 0},{0,0,1}};
    }
    public void refletirY(int refX, int refY){
        double[][] matrizR = {{-1,0,0},{0,1, 0},{0,0,1}};
    }
    public void refletirOri(int refX, int refY){
        double[][] matrizR = {{-1,0,0},{0,-1, 0},{0,0,1}};
    }
    public void refletirXY(int refX, int refY){
        double[][] matrizR = {{0,1,0},{1,0, 0},{0,0,1}};
    }
    public void refletirReta(int refX, int refY){
        double[][] matrizR = {{1,0,0},{0,-1, 0},{0,0,1}};
    }
    public void cisalharX(int cX, int cY){
        double[][] matrizC = {{1,cX,0},{0,1,0},{0,0,1}};
    }
    public void cisalharY(int cX, int cY){
        double[][] matrizC = {{1,0,0},{cY,1,0},{0,0,1}};
    }
    public void cisalharXY(int cX, int cY){
        double[][] matrizC = {{1,cX,0},{cY,1,0},{0,0,1}};
    }

    public void multiplicar(double[][] original, double[][] transforma){
        double p1 = original[0][0] ; 
    }

    





    
    
}
