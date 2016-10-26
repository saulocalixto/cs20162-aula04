/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.exercicios;

/**
 *Algoritimo retorna o resto da divisão entre dois números.
 * @author Saulo Calixto
 */
public final class RestoDivisao {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private RestoDivisao() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        RestoDivisao resto = new RestoDivisao();
    }

    /**
     * @param x : Dividendo
     * @param y : Divisor
     * @throws IllegalArgumentException se o dividendo for menor ou igual a 0,
     * ou divisor menor que 0, retorna excessão.
     * @return : Resto da divisão.
     */
    public static int obterResto(final int x, final int y) {

        if (y < 0 || x <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int s = x;

        while (y <= s) {
            s -= y;
        }
        return (s);
    }
}
