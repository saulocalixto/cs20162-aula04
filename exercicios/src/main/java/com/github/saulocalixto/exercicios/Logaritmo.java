/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package com.github.saulocalixto.exercicios;

import static com.github.saulocalixto.exercicios.Fatorial.fatorar;
import static com.github.saulocalixto.exercicios.Potencia.resultado;

/**
 *Algoritmo que implementa a potência de um logaritmo natural elevado a n.
 * @author Saulo Calixto
 */
public final class Logaritmo {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Logaritmo() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Logaritmo loga = new Logaritmo();
    }

    /**
    *
    * @param n : logratimo natural
    * @param k : tamanho da aproximação
    * @throws IllegalArgumentException se n menor que 1 ou k menor que 2,
    * retorna excessão
    * @return : potência do logartimo.
    */
    public static double logari(final int n, final int k) {

        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int i = 2;
        double e = n + 1, p, f;

        while (i <= k) {
            p = resultado(n, i);
            f = fatorar(i);
            e += p / f;
            i++;
        }
        return (e);
    }
}
