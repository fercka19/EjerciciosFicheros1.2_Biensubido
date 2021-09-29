/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Alumno
 */

import java.io.IOException;
import java.lang.reflect.Array;





public class Main {
	
	public static void main(String[] args) throws IOException {
            //prubar git y no sale bien por ahora
		String ruta = "C:\\Users\\Fernando\\EjerciciosFicheros1.2\\src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";
                //ej1------------------
		FicherosTexto.leer(ruta);
                //ej3-----------------------------
               int resultado =  FicherosTexto.contarCaracteres(ruta);
               System.out.println(resultado);
                //ej5-------------
                int res =  FicherosTexto.contarLineas(ruta);
                 System.out.println(res);
                 //ej9------------------------
                 int[] numeros =new int[10];
                 String[] vocales={"a", "e", "i", "o","u","A","E","I","O","U"};
                 
                numeros =  FicherosTexto.frecuenciaVocales(ruta);
                int i=0;
                while(i<=numeros.length-1){
                    System.out.println(numeros[i]+ "  frecuencia de cada vocal     ->"+vocales[i]);
                    i++;
                }
                //el ej 7 me supero. no lo consegui acabar, consegui aislar la palabra pero no consegui comparar las letras, me frustre
                FicherosTexto.palabrasPentavocalica(ruta);
           
	}

}
