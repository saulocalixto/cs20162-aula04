/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package main.java.com.github.saulocalixto.exercicios;

/**
 *Algortimo que obtém a razão aurea de dois números na sequência de fibonacci.
 * @author Saulo Calixto
 */
public class RazaoAurea {
    
    /**
     *
     * @param x : numero 1 da razão.
     * @param y : número 2 da razão.
     * @param k : tamanho da sequência
     * @return : a razão aurea entre x e y.
     */
    public static double obterRazao (int x, int y, int k) {
        if(x < 0 || x > y || k <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        double c = y, a = x,t;
        int i = 1;
        while(i <= k) {
            t = c;
            c += a;
            a = t;
            i++;
        }
        
        return (c/a);
    }
    
}
