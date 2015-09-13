/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author Artyom
 */
public class Practica1 {
    
    
    
    
    public static void main(String[] args) {
    
        int n;
        float[] vector;
        
        do
            n = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        while(n<=0);

        // Se inicializa el arreglo
        vector = new float[n];
        
        for(int i = 0; i<n; i++)
            vector[i] = Float.parseFloat(JOptionPane.showInputDialog("Dame un Numero"));

        // Codigo Lopez... xD

        // Se supone que esto busca valores repetidos y los borra, recorriendo el arreglo
        for (int i = 0; i < vector.length; i++) {
            for (int j = i+1; j < vector.length; j++) {
                if(vector[j] == vector[i]) {
                    if ((j + 1) < vector.length) {
                        vector[j] = vector[j + 1];
                        vector[j + 1] = -1;
                    }
                    else
                        vector[j] = -1;
                }
            }
        }

        for (float valor : vector) {
            System.out.println(valor);
        }
       
        
    }
    
}
