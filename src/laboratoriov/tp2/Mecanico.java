/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriov.tp2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Paula
 */
public class Mecanico implements Observer{
    public float valorAceite;
    public float valorAgua;
    public float presionNeumaticos;
    
    
    @Override
    public void update(Observable o, Object arg) {
        
        switch((String)arg) {
            case "aceite":
                float aceiteAnterior = this.valorAceite;
                System.out.println("Aceite anterior: " + aceiteAnterior);
            
                this.valorAceite += ((Auto)o).getNivelAceite();
            
                System.out.println("Carga de aceite: " + ((Auto)o).getNivelAceite());
                System.out.println("Nivel de aceite actual: " + this.valorAceite);
                break;
            case "agua":
                float aguaAnterior = this.valorAgua;
                System.out.println("Agua anterior: " + aguaAnterior);
            
            
                System.out.println("Carga de agua: " + ((Auto)o).getNivelAgua());
            
                this.valorAgua += ((Auto)o).getNivelAgua();
                System.out.println("Nivel de agua actual: " + this.valorAgua);
                break;
            case "presion":
                float presionAnterior = this.presionNeumaticos;
                System.out.println("Presion anterior: " + presionAnterior);
            
                System.out.println("Carga de presion: " + ((Auto)o).getPresionNeumaticos());
            
                this.presionNeumaticos +=((Auto)o).getPresionNeumaticos();
                System.out.println("Nivel de presion actual: " + this.presionNeumaticos);
                break;
        }
        
        
         
        
    }

    
    
    
}
