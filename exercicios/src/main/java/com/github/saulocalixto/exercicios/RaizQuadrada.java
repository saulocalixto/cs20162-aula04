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
public class RaizQuadrada {

    public static double obterRaiz(int n, int i) {

        if (n <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        double r = 1;

        while (i >= 0) {
            r = (r + n / r) / 2;
            i--;
        }

        return (r);
    }

}
