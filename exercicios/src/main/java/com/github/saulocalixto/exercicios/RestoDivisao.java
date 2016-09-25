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
public class RestoDivisao {
    
    public static int obterResto (int x, int y) {
        
        if(y < 0 || x <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int s = x;
        
        while(y <= s) {
            s -= y;
        }
        
        return (s);
    }
    
}
