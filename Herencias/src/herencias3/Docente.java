/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author Usuario
 */
public class Docente extends Persona{
    private double sueldo;//atributo específico de Docente
    
    public Docente (String n, String a, int e, double sueld){
        super(n, a, e);
        setSueldo(sueldo);
    }
    public void setSueldo(double sueld){
        sueldo = sueld;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getSueldo());
    }
}
