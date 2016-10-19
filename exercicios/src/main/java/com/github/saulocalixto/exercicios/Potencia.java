package com.github.saulocalixto.exercicios;

/**
 *Algoritmo que retorna um número elevado a uma potência.
 * @author Saulo Calixto
 */
public final class Potencia {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Potencia() {
    //Para atender ao checkstyle
}
    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Potencia potencia = new Potencia();
    }

    /**
     * @param x número que vai receber a potência
     * @param y potência do número x
     * se x ou y menor que 0, retorna excessão
     * @return retorna o número x ^ y.
     */
    public static int resultado(final int x, final int y) {

        if (x < 0 || y < 0) {
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
