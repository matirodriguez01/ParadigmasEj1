/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradigmas1;
import paradigmas1.ViajeroFrecuente;

/**
 *
 * @author USUARIO
 */
public class gestor {
    //private ViajeroFrecuente[] grViajeros = new ViajeroFrecuente[3];

    
    public void getViajeros(Integer i, ViajeroFrecuente[] grViajeros){
        System.out.println(grViajeros[i-1].getNombre());
    }
    
    
    
    public static void main(String[] args){
        ViajeroFrecuente[] grViajeros = new ViajeroFrecuente[3];
        for (int i=0;i<grViajeros.length;i++){
            grViajeros[i]= new ViajeroFrecuente();
        }
        String wad = getViajeros(2);

    }
    
    
}
