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
public class Fatorial {
    
    public static int fatorar(int n) {
        
        if(n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int i = 2, f = 1;
        
        while(i <= n) {
            f *= i;
            i++;
        }
        
        return (f);
    }
    
}
