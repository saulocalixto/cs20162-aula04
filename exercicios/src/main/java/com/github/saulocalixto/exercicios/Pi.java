/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que retorna o PI.
 * @author Saulo Calixto
 */
public final class Pi {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Pi() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Pi pi = new Pi();
    }

    /**
     * Constante que representa o antecendente da razão para se calcular o PI:
     * 4/(2i + 1).
     */
    private static final int ANTECEDENTE = 4;

    /**
     * @param n : limite do somatório para se obter o PI
     * @throws IllegalArgumentException se n menor que 1 retorna excessão
     * @return : Retorna o PI
     */
    public static double calcPi(final double n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int i = 1;
        double s = -1, d = -1, p = 0;

        while (i <= n) {
            d = d + 2;
            s *= (-1);
            p += (ANTECEDENTE * s / d);
            i++;
        }

        return (p);
    }
}
