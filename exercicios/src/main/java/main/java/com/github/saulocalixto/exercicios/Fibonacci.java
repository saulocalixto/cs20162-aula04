/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package main.java.com.github.saulocalixto.exercicios;

/**
 *Algoritmo que retorna o n-ésimo número na sequência de Fibonacci.
 * @author Saulo Calixto
 */
public class Fibonacci {
    
    /**
     *
     * @param n : Representa a posição na sequência que se quer descobrir.
     * @return : O n-ésimo número na sequência de Fibonacci.
     */
    public static int obterFibonacci (int n) {
        
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int a = 0, c = 1;
        
        if(n == 0 || n == 1) {
            return (n);
        } else {
            int i = 2, t = 0;
            
            while( i <= n) {
                t = c;
                c += a;
                a = t;
                i++;
            }
            
            return (c);
        }
    }
    
}
