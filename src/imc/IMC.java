/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import javax.swing.JOptionPane;

/**
 *
 * @author danx_
 */
public class IMC {
    //Atributos
    private float peso, estatura;
    private String nombre;
    
    //Methods
    //Constructor
    public IMC() {
        this.nombre = JOptionPane.showInputDialog(null, "¿Cual es tu nombre?", "Nombre", 3);
        this.peso = Float.valueOf(JOptionPane.showInputDialog(null, "¿Cual es tu peso (Kg)?", "Peso", 3));
        this.estatura = Float.valueOf(JOptionPane.showInputDialog(null, "¿Cual es tu estatura (mts)?", "Estatura", 3));
    }
    
    public float calculaIMC(float peso, float estatura) {
        float IMC = peso / (float)(Math.pow(estatura, 2));
        return IMC;
    }
    
    public void showMensajeDeSalud(float IMC) {
        if (IMC <= 18) {
            JOptionPane.showMessageDialog(null, "Tu IMC es de: " + IMC + "\nFelicidades " + this.nombre +" eres un esqueleto (BAJO PESO)", "IMC", 0);
        } else if (IMC <= 24.9) {
            JOptionPane.showMessageDialog(null, "Tu IMC es de: " + IMC + "\nFelicidades " + this.nombre +" eres normi (NORMAL)", "IMC", 1);
        } else if (IMC <= 26.9) {
            JOptionPane.showMessageDialog(null, "Tu IMC es de: " + IMC + "\nFelicidades " + this.nombre +" estas un poco pasadito (SOBREPESO)", "IMC", 0);
        } else if (IMC <= 29.9) {
            JOptionPane.showMessageDialog(null, "Tu IMC es de: " + IMC + "\nFelicidades " + this.nombre +" estas empezando la gran aventura de la obesidad (OBESIDAD GRADO I)\nRiesgo alto de desarrollar enferemedades cardiovasculares", "IMC", 0);
        } else if (IMC <= 39.9) {
            JOptionPane.showMessageDialog(null, "Tu IMC es de: " + IMC + "\nFelicidades " + this.nombre +" has subido de nivel ahora eres un obeso nivel 2 (OBESIDAD GRADO II)\nRiesgo muy alto de desarrollar enferemedades cardiovasculares", "IMC", 0);
        } else {
            JOptionPane.showMessageDialog(null, "Tu IMC es de: " + IMC + "\nFelicidades " + this.nombre +" eres un obeso nivel legendario(OBESIDAD MORBIDA)\nRiesgo extremadamente alto para desarrollo de enfermedades cardiovasculares", "IMC", 0);
        }
    }
    
    public float getPeso() {
        return this.peso;
    }
    
    public float getEstatura() {
        return this.estatura;
    }
}
