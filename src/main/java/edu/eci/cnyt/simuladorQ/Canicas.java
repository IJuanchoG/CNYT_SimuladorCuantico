package edu.eci.cnyt.simuladorQ;

import edu.eci.cnyt.Exceptions.CanicasException;


public class Canicas
{
    private int[][] matriz;
    private int[] estado0;
    
    public Canicas(int[] estI, int[][] ady) throws CanicasException{
        if (estI.length != ady.length) throw new CanicasException(CanicasException.ESTADO_INCOMPATIBLE);
        estado0= estI;
        matriz = new int[ady.length][ady.length];
        for(int i = 0; i < ady.length; i++) for(int j: ady[i]) matriz[j-1][i] = 1;
        
    }
    
    public void printearMatriz(int [][] matriz){
        System.out.print("\n  ");
        for (int i = 0; i < matriz.length; i++) System.out.print(" "+(i));
        for(int i = 0; i< matriz.length; i++) {
            System.out.print("\n"+(i)+"| ");
            for (int j = 0; j<matriz.length;j++)System.out.print(matriz[i][j]+" ");
            System.out.print("|");
        }
    }
    public void printearEstado(int[] estado0){
        System.out.print("\n  ");
        for(int i = 0; i< estado0.length; i++) {
            System.out.print("\n"+(i)+"| ");
            System.out.print(estado0[i]+" ");
            System.out.print("|");
        }
    }
    public int[] click(int n){
        int[] y = estado0;
        for(int i=0; i<n; i++){
            y = multiplicarVector(y);
        }
        printearEstado(y);
        return y;
    }
    public int[] getEstado(){
        return estado0;
    }
    public int[][] getMatriz(){
        return matriz;
    }
    private int[] multiplicarVector(int[] y){
        int[] aux =  new int[y.length];
        for (int i = 0; i < matriz.length; i++){
            int cont = 0;
            for (int j = 0; j < matriz.length; j++){
                cont += matriz[i][j]*y[j]; 
            }
            aux[i] = cont;
        }
        return aux;
    }
    
}
