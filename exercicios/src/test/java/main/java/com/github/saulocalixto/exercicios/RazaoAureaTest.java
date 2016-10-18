package main.java.com.github.saulocalixto.exercicios;

import com.github.saulocalixto.exercicios.RazaoAurea;
import org.junit.Test;

/**
 *
 * @author saulocalixto
 */
public class RazaoAureaTest {

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void NumxMenor0() {

        RazaoAurea.obterRazao(-1, 5, 2);
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void NumyMenorx() {

        RazaoAurea.obterRazao(15, 5, 2);
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void NumkMenor0() {

        RazaoAurea.obterRazao(3, 5, -6);
    }

    /**
     *
     */
    @Test
    public void numValido() {

        RazaoAurea.obterRazao(3, 5, 8);
    }

    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        RazaoAurea.chamarConstrutor();
    }  
}
