/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.Exceptions;

/**
 *
 * @author IJuanKhoxD
 */
public class CanicasException extends Exception{
    public static final String ESTADO_INCOMPATIBLE = "El estado incial de las canicas es de dimesiones incorrectas";
    
    public CanicasException(String message){
        super(message);
    }
}
