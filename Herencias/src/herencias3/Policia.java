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
public class Policia extends Persona{
    private String rango;//atributo específico de Policía
    
    public Policia (String n, String a, int e, String rang){
        super(n, a, e);//uso de métodos de la clase Persona, la clase padre
        setRango(rang);//agregando valor al atributo rango
    }
    public void setRango(String rang){//método para agregar valor a rango
        rango = rang;
    }
    
    public String getRango(){//método para obtener rango
        return rango;
    }
    
    @Override
    public String toString(){// reescribiendo toString para presentar también el valor de rango
    
        return String.format("%s - %s", super.toString(), getRango());
    }
}
