/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.simuladorQ;

import edu.eci.cnyt.Exceptions.CanicasException;
import edu.eci.cnyt.tdd.src.Complejo;
import edu.eci.cnyt.tdd.src.CplxMath;

/**
 *
 * @author IJuanKhoxD
 */
public class DobleRendijaCuantica {
    private Complejo[][] matriz;
    private Complejo[] estado0;
    private int blancos,rendijas;  

    public DobleRendijaCuantica(int rendijas, int blancos, Tupla[][] ady) throws CanicasException{
        if ( (rendijas+blancos+1) != ady.length) throw new CanicasException(CanicasException.ESTADO_INCOMPATIBLE); 
        this.rendijas = rendijas;
        this.blancos = blancos;
        estado0 = hallarEstadoInicial();
        matriz = hallarMatrizInicial();
        for(int i = 0; i < ady.length; i++) for(Tupla j: ady[i]){
        if(j.getAdy()>=rendijas && i>=0 && i<=rendijas) matriz[j.getAdy()-1][i] = j.getPeso();
        else matriz[j.getAdy()-1][i] = new Complejo(1,0);
        }
        
    } 
    public static void printearMatriz(Complejo [][] matriz){
        System.out.print("\n ");
        //for (int i = 0; i < matriz.length; i++) System.out.print("   "+(i));
        for(int i = 0; i< matriz.length; i++) {
            System.out.print("\n"+(i)+"| ");
            for (int j = 0; j<matriz.length;j++) {
                matriz[i][j].printear();
            }
            System.out.print("|\n");
        }
    }
    public static void printearEstado(Complejo[] estado0){
        System.out.print("\n  ");
        for(int i = 0; i< estado0.length; i++) {
            System.out.print("\n"+(i)+"| ");
            estado0[i].printear();
            System.out.print("|");
        }
    }
    public Complejo[] click(int n){
        Complejo[] y = estado0;
        for(int i=0; i<n; i++){
            y = multiplicarVector(y);
        }
        return y;
    }
    public Complejo[] getEstado(){
        return estado0;
    }
    public Complejo[][] getMatriz(){
        return matriz;
    }
    private Complejo[] multiplicarVector(Complejo[] y){
        Complejo[] aux =  new Complejo[y.length];
        for (int i = 0; i < matriz.length; i++){
            Complejo cont = new Complejo(0,0);
            for (int j = 0; j < matriz.length; j++){
                CplxMath.CompSuma(cont,CplxMath.CompMult(y[j],matriz[i][j]) ); 
            }
            aux[i] = cont;
        }
        return aux;
    }
    
    private Complejo[][] hallarMatrizInicial(){
        Complejo[][] aux = new Complejo[rendijas+blancos+1][rendijas+blancos+1];
        for (int i = 0; i < rendijas+blancos+1; i++) for (int j = 0; j < rendijas+blancos+1; j++)  aux[i][j] = new Complejo(0,0);
        return aux;
    }
    private Complejo[] hallarEstadoInicial(){
        Complejo[] aux = new Complejo[rendijas+blancos+1];
        for (int i = 0; i<aux.length; i++){
            if(i == 0) aux[i] = new Complejo(1,0);
            else aux[i]  =new Complejo(0,0);
        }
        return aux;
    }
}
