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
        
        Scanner scanner = new Scanner(System.in);//declaración de objeto scanner
        Trabajador t = new Trabajador();//t como objeto tipo trabajador
        
        System.out.println("Número de nombres del trabajador 1 o 2");/**opción
         * de ingresar 1 o 2 apellidos
        */
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();//limpiar scanner
        
        if(numero_nombres==1){
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);/**uso de método agregar_nombres para un
             * solo nombre
             */ 
        }else{
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);/**uso de método agregar_nombres
             * para dos nombres
             */
        }
        
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);/*uso de método agregar_apellido para
        * agregar apellido.
        */
        
        System.out.printf("Ingrese su tipo de sueldo:\n1. semanal\n2. mensual");
        String respuesta = scanner.nextLine();/**por teclado el usuaio
         * ingresa la opción que crea conveniente
         */
        
        if (respuesta.equals("semanal")){//proceso para respuesta "semanal"
            System.out.println("¿Desea guardar sus datos?");/** el usuario decide
             * si quiere guardar sus datos mediante un arreglo o no
             */
            String respuesta_2 = scanner.nextLine();
            if(respuesta_2.equals("si")){
                double[] sueldos = new double[4];
                for (int i = 0; i < sueldos.length; i++){
                System.out.printf("Ingrese su sueldo semanal: %d", i+1);
                sueldos[i] = scanner.nextDouble();
                } 
                t.agregar_sueldo(sueldos);//método para arreglar sueldo mediante arreglo
            }else{
                System.out.println("Ingrese su sueldo semanal 1:");
                double sueldo_1 = scanner.nextDouble();    
                System.out.println("Ingrese su sueldo semanal 2:");
                double sueldo_2 = scanner.nextDouble();
                System.out.println("Ingrese su sueldo semanal 3:");
                double sueldo_3 = scanner.nextDouble();
                System.out.println("Ingrese su sueldo semanal 4:");
                double sueldo_4 = scanner.nextDouble();
                
                t.agregar_sueldo(sueldo_1, sueldo_2, sueldo_3, sueldo_4);/**
                 * método para agregar sueldo sueldo mensual mediante cuatro
                 * variables
                 */    
            } 
        }else{
            System.out.println("Ingrese su sueldo mensual:");/** método para
             * agregar sueldo directamente
             */
            double sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
        }
        
        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());/**
         * presentación de datos
         */         
    }
}
