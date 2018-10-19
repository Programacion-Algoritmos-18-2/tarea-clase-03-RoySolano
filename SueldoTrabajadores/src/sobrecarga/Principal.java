/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();
        
        if(numero_nombres==1){
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        }else{
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);
        
        }
        
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        
        System.out.println("Ingrese su tipo de sueldo:");
        String respuesta = scanner.nextLine();
        
        if (respuesta.equals("semanal")){
            System.out.println("¿Desea guardar sus datos?");
            String respuesta_2 = scanner.nextLine();
            if(respuesta_2.equals("si")){
                scanner.nextLine();
                double[] sueldos = new double[4];
                for (int i = 0; i < sueldos.length; i++){
                System.out.println("Ingrese su sueldo semanal:" + i);
                sueldos[i] = scanner.nextDouble();
                } 
                t.agregar_sueldo(sueldos);
            }else{
                System.out.println("Ingrese su sueldo semanal 1:");
                double sueldo_1 = scanner.nextDouble();    
                System.out.println("Ingrese su sueldo semanal 2:");
                double sueldo_2 = scanner.nextDouble();
                System.out.println("Ingrese su sueldo semanal 3:");
                double sueldo_3 = scanner.nextDouble();
                System.out.println("Ingrese su sueldo semanal 4:");
                double sueldo_4 = scanner.nextDouble();
                
                t.agregar_sueldo(sueldo_1, sueldo_2, sueldo_3, sueldo_4);
                
            } 
        }else{
            System.out.println("Ingrese su sueldo mensual:");
            double sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
        }
        double sueldo = scanner.nextDouble();
        t.agregar_sueldo(sueldo);
        
        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());         
    }
}
