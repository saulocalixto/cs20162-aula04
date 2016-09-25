/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 * 
 */
package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que implementa o fatorial de um número natural
 * @author Saulo Calixto
 */
public class Fatorial {
    
    /**
     *
     * @param n : Número natural o qual queremos fatorar.
     * @return : Retorna o número fatorado.
     */
    public static int fatorar(int n) {
        
        if(n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int i = 2, f = 1;
        
        while(i <= n) {
            f *= i;
            i++;
        }
        
        return (f);
    }
    
}
