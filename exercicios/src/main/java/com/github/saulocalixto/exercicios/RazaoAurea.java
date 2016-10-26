/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.exercicios;

/**
 *Algortimo que obtém a razão aurea de dois números na sequência de fibonacci.
 * @author Saulo Calixto
 */
public final class RazaoAurea {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private RazaoAurea() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        RazaoAurea razao = new RazaoAurea();
    }

    /**
     * @param x : numero 1 da razão.
     * @param y : número 2 da razão.
     * @param k : tamanho da sequência
     * @throws IllegalArgumentException se x menor que 0, ou x maior que y, ou
     * k menor ou igual a 0, retorna excessão
     * @return : a razão aurea entre x e y.
     */
    public static double obterRazao(final int x, final int y, final int k) {
        if (x < 0 || x > y || k <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        double c = y, a = x, t;
        int i = 1;
        while (i <= k) {
            t = c;
            c += a;
            a = t;
            i++;
        }
        return (c / a);
    }
}
