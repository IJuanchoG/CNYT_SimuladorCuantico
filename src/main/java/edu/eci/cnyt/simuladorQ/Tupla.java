/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.simuladorQ;

import edu.eci.cnyt.Exceptions.CanicasException;
import edu.eci.cnyt.tdd.src.Complejo;

/**
 *
 * @author 2152030
 */
public class Tupla {
    private Complejo peso;
    private int adyacencia;
    
    public Tupla(int adyacencia,Complejo peso) throws CanicasException{
        this.peso = peso;
        this.adyacencia = adyacencia;        
    }
    public Complejo getPeso(){
        return peso;
    }
    public int getAdy(){
        return adyacencia;
    }
    public void setPeso(Complejo peso){
        this.peso = peso;        
    }
    
    
}
