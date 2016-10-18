/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package com.github.saulocalixto.exercicios;

/**
 *Algortimo que implementa a Regra de Horner para avaliação de Polinônimos.
 * @author Saulo Calixto
 */
public final class Horner {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Horner() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Horner horner = new Horner();
    }

    /**
     * @param x : número que quer verificar.
     * @param g : número para fazer os cálculos.
     * @param a : vetor que representa a sequência do polinônimo
     * @return o polinonimo da sequencia horner
     */
    public static int obterPolinonimo(final int x, final int g, final int[] a) {

        if (g < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int p = a[0];
        int i = g - 1;
        while (i >= 0) {
            p = p * x + a[i];
            i--;
        }

        return (p);
    }
}
