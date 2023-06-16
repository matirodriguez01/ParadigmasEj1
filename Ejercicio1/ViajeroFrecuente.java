/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paradigmas1;
import java.util.Scanner;

//INCISO A

public class ViajeroFrecuente {
   
   
    private Integer numero;
    private String dni;
    private String nombre;
    private String apellido;
    private Integer millas;

    public ViajeroFrecuente(Integer numero, String dni, String nombre, String apellido, Integer millas) {
        this.numero = numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.millas = millas;
    }
    
    public ViajeroFrecuente(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del viajero");
        this.nombre=in.nextLine();
        
        System.out.println("Ingrese apellido del viajero");
        this.apellido=in.nextLine();        
        
        System.out.println("Ingrese dni del viajero");
        this.dni=in.nextLine();
        
                System.out.println("Ingrese numero del viajero");
        if(in.hasNextInt()) { //Chequea si hay un entero en la linea...
            this.numero=in.nextInt();        
        }    
        
        System.out.println("Ingrese cantidad de millas del viajero");
        if(in.hasNextInt()) { //Chequea si hay un entero en la linea...
            this.millas=in.nextInt();
        }    


    }
// INCISO B
    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public Integer getNumero(){
        return numero;
    }
    public Integer getMillas(){
        return millas;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setMillas(Integer millas) {
        this.millas = millas;
    }
    
}

