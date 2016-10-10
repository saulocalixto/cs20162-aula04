/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package main.java.com.github.saulocalixto.exercicios;

/**
 *Algoritimo que verifica se um número é quadrado perfeito ou não.
 * @author Saulo Calixto
 */
public class QuadradoPerfeito {
    
    /**
     *
     * @param k : Número que deseja verificar se é quadrado perfeito.
     * @return : True ou False, de acordo com a propriedade do número analisado.
     */
    public static boolean descobrirQuadrado (int k) {
        if(k < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        int i = 1, q = 1;
        while (q < k) {
            i += 2;
            q += i;
        }
        
        return (q == k);
    }
    
}
