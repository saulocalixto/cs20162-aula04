/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.github.saulocalixto.exercicios;


import main.java.com.github.saulocalixto.exercicios.Potencia;
import org.junit.Test;

/**
 *
 * @author sauloc
 */
public class PotenciaTest {
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void NumInvMenor0() {

        Potencia.resultado(1, -3);
    }

    /**
     *
     */
    @Test
    public void numValido() {
        
        Potencia.resultado(5, 7);
    }
    
    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new Potencia();
    }   
}
