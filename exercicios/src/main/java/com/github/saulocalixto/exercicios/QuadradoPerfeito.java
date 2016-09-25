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
public class QuadradoPerfeito {
    
    public static boolean descobrirQuadrado (int k) {
        if(k < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        int i = 1, q = 1;
        while (q < k) {
            i += 2;
            q += i;
        }
        
        return (q == k);
    }
    
}
