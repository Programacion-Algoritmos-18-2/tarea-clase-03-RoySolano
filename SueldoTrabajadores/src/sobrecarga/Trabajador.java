/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author reroes
 */
public class Trabajador {
    //atributos de clase
    private String nombres;
    private double sueldo_mensual;
    private String apellidos;
    
    public void agregar_nombres(String n){//método para agregar un solo nombre
        nombres = n;
    }
    
    public void agregar_nombres(String n1, String n2){//método para agregar 2 nombres
        nombres = String.format("%s-%s", n1, n2);
    }
    
    
    public void agregar_sueldo(double sueldo){//agregar sueldo directamente
        sueldo_mensual = sueldo;
    }
    
    public void agregar_sueldo(double[] x){//agregar sueldo mediante arreglo
        double suma = 0;
        for(int i = 0; i < x.length; i++){
            suma = suma + x[i];
        }
        sueldo_mensual = suma;
    }
    
    public void agregar_sueldo(double sueldo_1, double sueldo_2, 
                               double sueldo_3, double sueldo_4){/**método para
                                * agregar sueldo mediante 4 variables
                                */
        sueldo_mensual = sueldo_1 + sueldo_2 + sueldo_3 + sueldo_4;
    }
    
    public void agregar_apellidos(String n){
        apellidos = n;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public double obtener_sueldo_mensual(){
        return sueldo_mensual;
    }
    
    public String presentar_datos(){
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
    
    
}
