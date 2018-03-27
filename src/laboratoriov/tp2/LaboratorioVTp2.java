/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriov.tp2;

/**
 *
 * @author Paula
 */
public class LaboratorioVTp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a = new Auto(0,0,0);
        Mecanico b = new Mecanico();
        
        System.out.println("Agua inicial: " + a.getNivelAgua());
        System.out.println("aceite inicial: " + a.getNivelAceite());
        System.out.println("Presion inicial: " + a.getPresionNeumaticos());
        
        a.addObserver(b);
        
        a.cambiarNivelAceite(2);
        a.cambiarNivelAceite(2);
        a.cambiarNivelAceite(2);
        
        a.cambiarNivelAgua(5);
        a.cambiarNivelAgua(2);
        
       
        a.cambiarPresionNeumaticos(2);
        a.cambiarPresionNeumaticos(9);
    }
    
}
