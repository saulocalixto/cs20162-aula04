/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que retorna o PI.
 * @author Saulo Calixto
 */
public class Pi {
    
    /**
     *
     * @param n : limite do somatório para se obter o PI
     * @return : Retorna o PI
     */
    public static double calcPi(double n) {
        if(n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int i = 1;
        double s = -1, d = -1, p = 0;
        
        while(i <= n) {
            d = d+2;
            s *= (-1);
            p += (4*s/d);
            i++;
        }
        
        return (p);
    }
    
}
