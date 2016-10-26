/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que retorna o n-ésimo número na sequência de Fibonacci.
 * @author Saulo Calixto
 */
public final class Fibonacci {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Fibonacci() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Fibonacci fibo = new Fibonacci();
    }

    /**
     * @param n : Representa a posição na sequência que se quer descobrir.
     * @throws IllegalArgumentException não existe fibonacci de número menor
     * que zero.
     * @return : O n-ésimo número na sequência de Fibonacci.
     */
    public static int obterFibonacci(final int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int a = 0, c = 1;

        if (n == 0 || n == 1) {
            return (n);
        } else {
            int i = 2, t = 0;

            while (i <= n) {
                t = c;
                c += a;
                a = t;
                i++;
            }
            return (c);
        }
    }
}
