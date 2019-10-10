/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.simuladorQ;

import edu.eci.cnyt.Exceptions.CanicasException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2152030
 */
public class NewClass {
    
    public static void main( String[] args )
    {
        
        Canicas canicas;
        DobleRendijaClasica rendijaC;
        try {
            canicas = new Canicas(new int[]{1,2,0,0}, new int[][]{{1,3},{3,4},{2,1},{1,2}});
            canicas.click(4);
            rendijaC = new DobleRendijaClasica(2,5,new int[][]{{2,3},{4,5,6},{6,7,8},{4},{5},{6},{7},{8}});
            //DobleRendijaClasica.printearMatriz(rendijaC.getMatriz());
            rendijaC.click(5);
        } catch (CanicasException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
