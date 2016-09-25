/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.exercicios;

/**
 *
 * @author saulocalixto
 */
public class Pi {
    
    public static double calcPi(double n) {
        if(n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int i = 1;
        double s = -1, d = -1, p = 0;
        
        while(i <= n) {
            d = d+2;
            s *= (-1);
            p += (4*s/d);
            i++;
        }
        
        return (p);
    }
    
}
