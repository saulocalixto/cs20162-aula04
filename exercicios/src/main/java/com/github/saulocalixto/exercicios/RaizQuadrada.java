/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package com.github.saulocalixto.exercicios;

/**
 *Algortimo que retorna a raiz quadrada de um número.
 * @author Saulo Calixto
 */
public class RaizQuadrada {

    /**
     *
     * @param n : Número que se desejar retirar a raiz quadrada.
     * @param i : Representa a precisão da raíz quadrada
     * @return : Retorna um double que representa a raíz quadrada de n.
     */
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
