/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.simuladorQ;

import edu.eci.cnyt.Exceptions.CanicasException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IJuanKhoxD
 */
public class SimuladroCuanticoTest {
    Canicas canicas;
    DobleRendijaClasica rendijaC;
    DobleRendijaCuantica rendijaQ;
    @Test
    public void deberiaHacerCanicas() {
        try {
            canicas = new Canicas(new int[]{1,2,0,0}, new int[][]{{1,3},{3,4},{2,1},{1,2}});
            canicas.click(4);
        } catch (CanicasException ex) {
            fail("no deberia fallar");
        }    
    }
    
    @Test
    public void deberiaHacerCanicas1() {
        try {
            canicas = new Canicas(new int[]{1,2,0,0}, new int[][]{{1,3},{3,4},{2,1},{1,2}});
            int[] click = canicas.click(1);
            assertArrayEquals(click,new int[]{1,0,3,2});
        } catch (CanicasException ex) {
            fail("no deberia fallar");
        }    
    }
    
    @Test
    public void noDeberiaHacerCanicas() {
        try {
            canicas = new Canicas(new int[]{1,2,0}, new int[][]{{1,3},{3,4},{2,1},{1,2}});
            canicas.click(4);            
            fail("deberia fallar");
        } catch (CanicasException ex) {
            assertTrue(true);
        }    
    }
    @Test
    public void noDeberiaHacerCanicas2() {
        try {
            
            canicas = new Canicas(new int[]{1,2,0,8}, new int[][]{{1,3},{3,1},{2,1},{1,2},{0,0}});
            int[] click = canicas.click(4);
            Canicas.printearEstado(click);
            fail("deberia fallar");
        } catch (CanicasException ex) {
            assertTrue(true);
        }    
    }
    
    @Test
    public void noDeberiaHacerDobleRendija() {
        try {
            rendijaC = new DobleRendijaClasica(0,5,new int[][]{{2,3},{4,5,6},{6,7,8},{4},{5},{6},{7},{8}});
            double[] click = rendijaC.click(4);
            DobleRendijaClasica.printearEstado(click);
            fail("deberia fallar");
        } catch (CanicasException ex) {
            assertTrue(true);
        }    
    }
    @Test
    public void deberiaHacerDobleRendija() {
        try {
            rendijaC = new DobleRendijaClasica(2,5,new int[][]{{2,3},{4,5,6},{6,7,8},{4},{5},{6},{7},{8}});
            double[] click = rendijaC.click(4);
        } catch (CanicasException ex) {
            fail("no deberia fallar");
        }    
    }
    @Test
    public void deberiaHacerDobleRendija2() {
        try {
            rendijaC = new DobleRendijaClasica(2,5,new int[][]{{2,3},{7,8,5,6},{6,7,8},{4},{5},{6},{7},{8}});
            double[] click = rendijaC.click(4);
        } catch (CanicasException ex) {
            fail("no deberia fallar");
        }    
    }
    @Test
    public void deberiaHacerDobleRendija3() {
        try {
            rendijaC = new DobleRendijaClasica(2,5,new int[][]{{2,3},{7,8,5,6},{6,7,8},{4},{5},{6},{7},{8}});
            double[] click = rendijaC.click(1);
            DobleRendijaClasica.printearEstado(click);
            assertArrayEquals(click,new double[]{0.0,0.5,0.5,0.0,0.0,0.0,0.0,0.0},0.0);
        } catch (CanicasException ex) {
            fail("no deberia fallar");
        }    
    }
    @Test
    public void noDeberiaHacerDobleRendijaQ() {
        try {
            rendijaQ = new DobleRendijaCuantica(0,5,new int[][]{{2,3},{4,5,6},{6,7,8},{4},{5},{6},{7},{8}});
            double[] click = rendijaQ.click(4);
            DobleRendijaClasica.printearEstado(click);
            fail("deberia fallar");
        } catch (CanicasException ex) {
            assertTrue(true);
        }    
    }
    @Test
    public void deberiaHacerDobleRendijaQ() {
        try {
            rendijaQ = new DobleRendijaCuantica(2,5,new int[][]{{2,3},{4,5,6},{6,7,8},{4},{5},{6},{7},{8}});
            double[] click = rendijaQ.click(4);
        } catch (CanicasException ex) {
            fail("no deberia fallar");
        }    
    }
    @Test
    public void deberiaHacerDobleRendijaQ2() {
        try {
            rendijaQ = new DobleRendijaCuantica(2,5,new int[][]{{2,3},{4,5,6},{6,7,8},{4},{5},{6},{7},{8}});
            double[] click = rendijaQ.click(4);
        } catch (CanicasException ex) {
            fail("no deberia fallar");
        }    
    }
    @Test
    public void deberiaHacerDobleRendijaQ3() {
        try {
            rendijaQ = new DobleRendijaCuantica(2,5,new int[][]{{2,3},{7,8,5,6},{6,7,8},{4},{5},{6},{7},{8}});
            double[] click = rendijaQ.click(2);
            DobleRendijaCuantica.printearEstado(click);
            assertArrayEquals(click,new double[]{0.0,0.0,0.0,0.0,0.2,0.4,0.4,0.4},0.0);
        } catch (CanicasException ex) {
            fail("no deberia fallar");
        }    
    }
}
