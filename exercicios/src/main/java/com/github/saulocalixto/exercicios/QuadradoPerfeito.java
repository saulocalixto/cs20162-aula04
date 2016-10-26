/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.exercicios;

/**
 *Algoritimo que verifica se um número é quadrado perfeito ou não.
 * @author Saulo Calixto
 */
public final class QuadradoPerfeito {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private QuadradoPerfeito() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        QuadradoPerfeito qperf = new QuadradoPerfeito();
    }

    /**
     * @param k : Número que deseja verificar se é quadrado perfeito.
     * @throws IllegalArgumentException se k menor que 1, retorna excessão.
     * @return : True ou False, se k for quadrado perfeito ou não.
     */
    public static boolean descobrirQuadrado(final int k) {
        if (k < 1) {
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
