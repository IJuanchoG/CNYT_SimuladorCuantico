/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.simuladorQ;

import edu.eci.cnyt.Exceptions.CanicasException;
import edu.eci.cnyt.tdd.src.Complejo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2152030
 */
public class NewClass {
    
    public static void main( String[] args )
    {
        
        DobleRendijaCuantica rendijaQ;
        try {
            //canicas = new Canicas(new int[]{1,2,0,0}, new int[][]{{1,3},{3,4},{2,1},{1,2}});
            //canicas.click(4);
            rendijaQ = new DobleRendijaCuantica(2,5,new  Tupla[][]{
                                                    {new Tupla(2,new Complejo(1,2)),new Tupla(3,new Complejo(-1,0))},
                                                    {new Tupla(4,new Complejo(1,2)),new Tupla(5,new Complejo(-1,0)),new Tupla(6,new Complejo(-1,0))},
                                                    {new Tupla(6,new Complejo(1,2)),new Tupla(7,new Complejo(-1,0)),new Tupla(8,new Complejo(-1,0))},
                                                    {new Tupla(4,new Complejo(1,2))},{new Tupla(5,new Complejo(1,2))},{new Tupla(6,new Complejo(1,2))},
                                                    {new Tupla(7,new Complejo(1,2))},{new Tupla(8,new Complejo(1,2))}
                                                });
            //DobleRendijaCuantica.printearMatriz(rendijaQ.getMatriz());
            //Complejo[] click = rendijaQ.click(1);
            DobleRendijaCuantica.printearEstado(rendijaQ.getEstado());
        } catch (CanicasException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
