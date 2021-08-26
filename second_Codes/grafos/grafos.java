package grafos;


import java.util.Scanner;

public class grafos {
    private int[][] m;
    private int[] v;

    public grafos(int[][] m, int[] v) {
        this.m = m;
        this.v = v;
    }

    public void addAn(int a, int b, int p){
        m[a][b]=1*p;
        m[b][a]=1*p;
    }
    public void addAo(int a, int b, int p){
        m[a][b]=1*p;
    }



    public void printarMatriz() {
        for (int i = 0; i < v.length; i++) {
            for(int j=0;j<v.length;j++){
                System.out.print(m[i][j]+" ");
                if(j==v.length-1){
                    System.out.println();
                }
            }
        }
    }

}

