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
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // clase principal
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        
        Docente d = new Docente("Luis", "Álvarez", 33, 1000); // falta implementar
        System.out.println(d);
        
        Policia p = new Policia("Alex", "Mendoza", 33, "Cabo"); // falta implementar
        System.out.println(p);
        
    }
    
}
