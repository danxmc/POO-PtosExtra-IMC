/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author danx_
 */
public class ActivityIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float IMC;
        IMC persona = new IMC();
        IMC = persona.calculaIMC(persona.getPeso(), persona.getEstatura());
        persona.showMensajeDeSalud(IMC);
    }
    
}
