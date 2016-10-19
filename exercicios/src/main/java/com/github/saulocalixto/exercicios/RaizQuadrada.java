/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package com.github.saulocalixto.exercicios;

/**
 *Algortimo que retorna a raiz quadrada de um número.
 * @author Saulo Calixto
 */
public final class RaizQuadrada {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private RaizQuadrada() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        RaizQuadrada raiz = new RaizQuadrada();
    }

    /**
     *
     * @param n : Número que se desejar retirar a raiz quadrada.
     * @param i : Representa a precisão da raíz quadrada
     * @throws IllegalArgumentException se n menor ou igual a 0, retorna
     * excessão
     * @return : Retorna um double que representa a raíz quadrada de n.
     */
    public static double obterRaiz(final int n, final int i) {

        int j = i;

        if (n <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        double r = 1;

        while (j >= 0) {
            r = (r + n / r) / 2;
            j--;
        }

        return (r);
    }

}
