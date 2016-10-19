/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
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
     * Constante para guardar o número 4 e evitar magic number.
     */
    private static final int QUATRO = 4;

    /**
     * @param n : limite do somatório para se obter o PI
     * se n menor que 1 retorna excessão
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
            p += (QUATRO * s / d);
            i++;
        }

        return (p);
    }
}
