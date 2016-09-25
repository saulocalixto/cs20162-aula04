/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package com.github.saulocalixto.exercicios;

/**
 *Algortimo que implementa a Regra de Horner para avaliação de Polinônimos
 * @author Saulo Calixto
 */
public class Horner {
    
    /**
     *
     * @param x : número que quer verificar.
     * @param g : número para fazer os cálculos.
     * @param a : vetor que representa a sequência do polinônimo
     * @return
     */
    public static int obterPolinonimo (int x, int g, int a[]) {
        
        if(g < 1) {
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
