/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.simuladorQ;

/**
 *
 * @author 2152030
 */
public class NewClass {
    
    public static void main( String[] args )
    {
        
        Canicas canicas = new Canicas(new int[]{1,2}, new int[][]{{1,3},{3,4},{2,1},{1,2}});
        canicas.printear();
    }
}
