/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallercorte1;

import java.util.Scanner;

public class TallerCorte1 {

   
     
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        String nombre,apellido;
        int edad;
        double cuenta;
        double resultado;
        System.out.print("Buenas noches ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.print("ingrese su apellido: ");
        apellido=leer.nextLine();
        System.out.print("ingrese su edad: ");
        edad = leer.nextInt();
        System.out.print("ingrese la cuenta: ");
        cuenta = leer.nextDouble();

        resultado = calculardescuento(cuenta, edad);

        System.out.print(" " + nombre.toUpperCase() + " " +apellido.toUpperCase()+  " su edad es " + edad + " cuenta con descuento es de: " + resultado);
    }

    public static double calculardescuento(double cuenta, int edad) {
        double descuento = 0.0;
        if (edad >= 18 || edad < 19) {
            descuento = cuenta * 0.05;
        } else if (edad >= 19 || edad < 30) {
            descuento = cuenta * 0.10;
        }
        return cuenta - descuento;
    }
}

      
    
    

