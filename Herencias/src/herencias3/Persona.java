/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;


/**
 *
 * @author reroes
 */
public class Persona {//clase padre
    //atributos de clase
    protected String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String n, String a,  int e){//modificación de constructor
        setNombre(n);
        setApellido(a);
        setEdad(e);
    }
    
    public void setNombre(String n){//método para agregar nombre
        nombre = n;
    }
    
    public void setApellido(String n){//método para agregar apellido
        apellido = n;
    }
    
    public void setEdad(int n){//método para agregar edad
        edad = n;
    }
    
    public int getEdad(){//método para obtener edad
        return edad;
    }
    
    public String getNombre(){//método para agregar apellido
        return nombre;
    }
    
    public String getApellido(){//método para obtener apellido
        return apellido;
    }
    
    @Override//reescribiendo toString
    public String toString(){
        return String.format("Nombre: %s - Apellido %s - Edad %d", 
                getNombre(), getApellido(), getEdad());
    }
    
    
}
