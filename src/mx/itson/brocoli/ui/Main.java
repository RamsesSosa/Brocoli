package mx.itson.brocoli.ui;

import java.util.Scanner;
import mx.itson.brocoli.negocio.Operacion;

public class Main {
   
    public static void main(String[] args) {
     
        System.out.println("Ingrese el texto a separar: ");
        
        Scanner scanner = new Scanner(System.in);
        
        String oracion = scanner.nextLine();
        

        String[] resultado = new Operacion().separar(oracion);
        for(String s : resultado){
            System.out.println(s);
        }
        
    }
}
