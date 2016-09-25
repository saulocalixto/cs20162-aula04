/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.exercicios; 

import static com.github.saulocalixto.exercicios.Fatorial.fatorar;
import static main.java.com.github.saulocalixto.exercicios.Potencia.resultado;

/**
 *
 * @author saulocalixto
 */
public class Logaritmo {
    
    public static double logari (int n, int k) {
        
        if(n < 1 || k < 2) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int i = 2;
        double e = n + 1, p, f;
        
        while(i <= k){
            p = resultado(n, i);
            f = fatorar(i);
            e += p/f;
            i++;
        }
        
        return(e);
    }
    
}
