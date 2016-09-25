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
public class RazaoAurea {
    
    public static double obterRazao (int x, int y, int k) {
        if(x < 0 || x > y || k <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        double c = y, a = x,t;
        int i = 1;
        while(i <= k) {
            t = c;
            c += a;
            a = t;
            i++;
        }
        
        return (c/a);
    }
    
}
