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
        if((String)arg == "aceite"){
            
            float anterior = this.valorAceite;
            System.out.println("Aceite anterior: " + anterior);
            
            this.valorAceite += ((Auto)o).getNivelAceite();
            
            System.out.println("Carga de aceite: " + ((Auto)o).getNivelAceite());
            System.out.println("Nivel de aceite actual: " + this.valorAceite);
        }
         if((String)arg == "agua"){
            float anterior = this.valorAgua;
            System.out.println("Agua anterior: " + anterior);
            
            
            System.out.println("Carga de agua: " + ((Auto)o).getNivelAgua());
            
            this.valorAgua += ((Auto)o).getNivelAgua();
            System.out.println("Nivel de agua actual: " + this.valorAgua);
        }
        if((String)arg == "presion"){
            float anterior = this.presionNeumaticos;
            System.out.println("Presion anterior: " + anterior);
            
            System.out.println("Carga de presion: " + ((Auto)o).getPresionNeumaticos());
            
            this.presionNeumaticos +=((Auto)o).getPresionNeumaticos();
            System.out.println("Nivel de presion actual: " + this.presionNeumaticos);
        }
        
        /*switch((String)arg) {
            case "aceite":
                this.valorAceite += ((Auto) o).getNivelAceite();
                System.out.println("Nivel de aceite actual: " + this.valorAceite);
                break;
            case "agua":
                this.valorAgua += ((Auto)o).getNivelAgua();
                System.out.println("Nivel de agua actual: " + this.valorAgua);
                break;
            case "presion":
                this.presionNeumaticos +=((Auto)o).getPresionNeumaticos();
                System.out.println("Nivel de presion actual: " + this.presionNeumaticos);
        }*/
        
        
         
        
    }

    
    
    
}
