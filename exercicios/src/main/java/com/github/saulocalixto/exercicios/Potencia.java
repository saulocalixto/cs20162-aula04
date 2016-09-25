package main.java.com.github.saulocalixto.exercicios;

import java.util.Scanner;

/**
 *Algoritmo que retorna um número elevado a uma potência.
 * @author Saulo Calixto
 */
public class Potencia {

    /**
     *
     * @param x número que vai receber a potência
     * @param y potência do número x
     * @return retorna o número x ^ y.
     */
    public static int resultado (int x, int y) {
        
        if (x < 0 || y < 0){
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int cont = 1, potencia = 1;

        while (cont <= y) {
            potencia = potencia * x;
            cont++;
        }

        return (potencia);
    }

}
