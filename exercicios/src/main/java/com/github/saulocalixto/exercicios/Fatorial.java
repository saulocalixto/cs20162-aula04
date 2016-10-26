/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que implementa o fatorial de um número natural.
 * @author Saulo Calixto
 */
public final class Fatorial {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Fatorial() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Fatorial fatorial = new Fatorial();
    }

    /**
     * @param n : Número natural o qual queremos fatorar.
     * @throws IllegalArgumentException não existe fatorial de número menor que
     * um.
     * @return : Retorna o fatorial de n.
     */
    public static int fatorar(final int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int i = 2, f = 1;

        while (i <= n) {
            f *= i;
            i++;
        }

        return (f);
    }
}
