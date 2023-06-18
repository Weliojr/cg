package org.example.transform;

public class Transformacao3d {
    public void tranladar(int tX, int tY, int tZ){
        double[][] matrizT = {{1,0,0,tX},
                              {0,1,0,tY},
                              {0,0,1,tZ},
                              {0,0,0,1}};

    }
    public void escalar(int sX, int sY, int sZ){
        double[][] matrizS = {{sX,0,0,0},
                              {0,sY,0,0},
                              {0,0,sZ,0},
                              {0,0,0,1}};
    }
    public void rotacionarPositivoZ(int rX, int rY){
        double cosseno = Math.cos(rX);
        double seno = Math.sin(rY);
        double[][] matrizR = {{cosseno,-seno,0,0},
                              {seno,cosseno,0,0},
                              {0,0,1,0},
                              {0,0,0,1}};
    }
    public void rotacionarNegativoZ(int rX, int rY){
        double cosseno = Math.cos(rX);
        double seno = Math.sin(rY);
        double[][] matrizR = {{cosseno,seno,0,0},
                              {-seno,cosseno,0,0},
                              {0,0,1,0},
                              {0,0,0,1}};
    }
    public void rotacionarPositivoX(int rX, int rY){
        double cosseno = Math.cos(rX);
        double seno = Math.sin(rY);
        double[][] matrizR = {{1,0,0,0},
                              {0,cosseno,-seno,0},
                              {0,seno,cosseno,0},
                              {0,0,0,1}};
    }
    public void rotacionarNegativoX(int rX, int rY){
        double cosseno = Math.cos(rX);
        double seno = Math.sin(rY);
        double[][] matrizR = {{1,0,0,0},
                              {0,cosseno,seno,0},
                              {0,-seno,cosseno,0},
                              {0,0,0,1}};
    }
    public void rotacionarPositivoY(int rX, int rY){
        double cosseno = Math.cos(rX);
        double seno = Math.sin(rY);
        double[][] matrizR = {{cosseno,0,-seno,0},
                              {0,1,0,0},
                              {seno,0,cosseno,0},
                              {0,0,0,1}};
    }
    public void rotacionarNegativoY(int rX, int rY){
        double cosseno = Math.cos(rX);
        double seno = Math.sin(rY);
        double[][] matrizR = {{cosseno,seno,0,0},
                              {0,1,0,0},
                              {-seno,0,cosseno,0},
                              {0,0,0,1}};
    }
    public void refletirXy(int refX, int refY){
        double[][] matrizR ={{1,0,0,0},
                              {0,1,0,0},
                              {0,0,-1,0},
                              {0,0,0,1}};
    }
    public void refletirYz(int refX, int refY){
        double[][] matrizR = {{-1,0,0,0},
                              {0,1,0,0},
                              {0,0,1,0},
                              {0,0,0,1}};
    }
    public void refletirXz(int refX, int refY){
        double[][] matrizR = {{1,0,0,0},
                              {0,-1,0,0},
                              {0,0,1,0},
                              {0,0,0,1}};
    }
    
    public void cisalharZ(int cX, int cY, int cZ){
        double[][] matrizC = {{1,0,cX,0},
                              {0,1,cY,0},
                              {0,0,1,0},
                              {0,0,0,1}};
    }
    public void cisalharX(int cX, int cY, int cZ){
        double[][] matrizC = {{1,0,0,0},
                              {cY,1,0,0},
                              {cZ,0,1,0},
                              {0,0,0,1}};
    }
    public void cisalharY(int cX, int cY, int cZ){
        double[][] matrizC = {{1,cX,0,0},
                              {0,1,0,0},
                              {0,cZ,1,0},
                              {0,0,0,1}};
    }
    public void cisalharXYZ(int a, int b, int c, int d, int e, int f){
        double[][] matrizC = {{1,c,e,0},
                              {a,1,f,0},
                              {b,d,1,0},
                              {0,0,0,1}};
    }

}
