/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package main.java.com.github.saulocalixto.exercicios; 

import static main.java.com.github.saulocalixto.exercicios.Fatorial.fatorar;
import static main.java.com.github.saulocalixto.exercicios.Potencia.resultado;

/**
 *Algoritmo que implementa a potência de um logaritmo natural elevado a n.
 * @author Saulo Calixto
 */
public class Logaritmo {
    
    /**
     *
     * @param n : logratimo natural
     * @param k : tamanho da aproximação
     * @return : potência do logartimo.
     */
    public static double logari (int n, int k) {
        
        if(n < 1 || k < 2) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int i = 2;
        double e = n + 1, p, f;
        
        while(i <= k){
            p = resultado(n, i);
            f = fatorar(i);
            e += p/f;
            i++;
        }
        
        return(e);
    }
    
}
