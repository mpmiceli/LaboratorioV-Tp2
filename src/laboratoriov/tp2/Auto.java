/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriov.tp2;

import java.util.Observable;

/**
 *
 * @author Paula
 */
public class Auto extends Observable{
    
    public float nivelAceite;
    public float nivelAgua;
    public float presionNeumaticos;
    
    public Auto (float nivel_aceite, float nivel_agua, float presion_neumaticos){
        this.nivelAceite = nivel_aceite;
        this.nivelAgua = nivel_agua;
        this.presionNeumaticos = presion_neumaticos;
    }

    public float getNivelAceite() {
        return nivelAceite;
    }

    public void setNivelAceite(float nivelAceite) {
        this.nivelAceite = nivelAceite;
    }

    public float getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(float nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public float getPresionNeumaticos() {
        return presionNeumaticos;
    }

    public void setPresionNeumaticos(float presionNeumaticos) {
        this.presionNeumaticos = presionNeumaticos;
    }
    
    public void cambiarNivelAceite(float dato){
        this.setNivelAceite(this.nivelAceite += dato);
        setChanged();
        String flag = "aceite";
        notifyObservers(flag);
        
    }
    
    public void cambiarNivelAgua(float dato){
        this.setNivelAgua(this.nivelAgua += dato);
        //System.out.println("Carga de agua: " + this.getNivelAgua());
        setChanged();
        String flag = "agua";
        notifyObservers(flag);
    }
    
    public void cambiarPresionNeumaticos(float dato){
        this.setPresionNeumaticos(this.presionNeumaticos += dato); 
        //System.out.println("Carga de presion: " + this.getPresionNeumaticos());
        setChanged();
        String flag = "presion";
        notifyObservers(flag);
    }
    
}
