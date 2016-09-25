/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que implementa o somatório dos primeiros naturais
 * @author Saulo Calixto
 */
public class SomaElementar {
    
    /**
     *
     * @param n : Tamanho da sequência de soma.
     * @return : n-ésimo número na sequência de soma elementar.
     */
    public static int soma (int n) {
        
        if(n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int i = 1, s = 0, d = 0;
        
        while(i <= n) {
            d = 1 + (i * i);
            s += 1 / d;
            i++;
        }
        
        return (s);
    }
    
}
