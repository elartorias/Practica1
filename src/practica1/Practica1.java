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
    
    
    
    
    public static void main(String[] args) 
    {
    
        int n;
        
        do
        {
            n = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
            
        }while(n<=0);
        
        float[] vector = new float[n];
        
        for(int i = 0; i<n; i++)
        {
            vector[i] = Float.parseFloat(JOptionPane.showInputDialog("Dame un Numero")); 
        }
        
       
        
    }
    
}
