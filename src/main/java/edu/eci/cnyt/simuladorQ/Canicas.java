package edu.eci.cnyt.simuladorQ;


public class Canicas
{
    private int[][] matriz;
    private int[][] estado0;
    public Canicas(int[] estI, int[][] ady){
        estado0=new int[][]{estI};
        matriz = new int[ady.length][ady.length];
        for(int i = 0; i < ady.length; i++) for(int j: ady[i]) matriz[j-1][i] = 1;
        
    }
    public void printear(){
        for(int i = 0; i< matriz.length; i++) {
            System.out.print("\n (");
            for (int j = 0; j<matriz.length;j++)System.out.print(matriz[i][j]+" ");
            System.out.print(")");
        }
    }
    public void click(int n){
        int[][] y = estado0;
        for(int i=0; i<n; i++){
            y = multiplicar(y);
        }
    }
    public int[][] multiplicar(int[][] y){
        return null;
    }
}
