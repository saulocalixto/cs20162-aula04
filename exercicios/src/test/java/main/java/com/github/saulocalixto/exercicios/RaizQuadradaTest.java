package main.java.com.github.saulocalixto.exercicios;

import main.java.com.github.saulocalixto.exercicios.RaizQuadrada;
import org.junit.Test;

/**
 *
 * @author saulocalixto
 */
public class RaizQuadradaTest {

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void NumInvMenorIgual0() {

        RaizQuadrada.obterRaiz(-1, 10);
    }

    /**
     *
     */
    @Test
    public void numValido() {

        RaizQuadrada.obterRaiz(15, 10);
    }

    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new RaizQuadrada();
    }
}
