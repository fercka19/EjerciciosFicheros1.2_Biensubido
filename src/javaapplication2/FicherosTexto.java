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


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Escribe_aqui_tu_nombre
 * @date 
 * @version 
 * @license GPLv3
 *
 */
public class FicherosTexto {

	public static void leer(String rutaFichero) {
		
                //opcion leer ruta , no se si el ejercicio se refiere a leer la ruta o a leer el fichero
                //con lo cual hare las dos.
                
                for(int i=0;i<=rutaFichero.length()-1;i++){
                    System.out.println(rutaFichero.charAt(i));
                }
                
          File fichero = new File(rutaFichero);
        //declarar fichero
        try (FileReader fr = new FileReader(fichero)) { //crear el flujo de entrada   
            int caracter;
            while ((caracter = fr.read()) != -1) //se va leyendo un carácter
            {
                System.out.print((char) caracter);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
        }        
        catch (IOException e) {
            System.err.println(e);
        }
	}

	public static int contarCaracteres(String rutaFichero) throws IOException {
		// TODO Auto-generated method stub
        int cont=0;
        
            File fichero = new File(rutaFichero);
        //declarar fichero
        try (FileReader fr = new FileReader(fichero)) { //crear el flujo de entrada   
            int caracter;
            
            while ((caracter = fr.read()) != -1) //se va leyendo un carácter
            {
                cont++;
          
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
        }        
        catch (IOException e) {
            System.err.println(e);
        }
	
		return cont;
	}

	public static int contarLineas(String rutaFichero) throws FileNotFoundException {
		// TODO Auto-generated method stub
                File input = new File(rutaFichero); 
                Scanner iterate = new Scanner(input);
                int numLines=0;
                while(iterate.hasNextLine()) { 
                    iterate.nextLine(); 
                    numLines++;
                }
		return numLines;
	}

public static int contarPalabras(String rutaFichero) {

		
		return 0;
	}

	public static int palabrasPentavocalica(String rutaFichero) {
		 File archivo = null;
try {
archivo = new File(rutaFichero);
String linea;
FileReader fr = new FileReader (archivo);
BufferedReader br = new BufferedReader(fr);
int i,j,a=0;
 String guardarPal ="",aux="";
while((linea=br.readLine())!=null) {
    System.out.println(linea);System.out.println(linea.length());
for(i=0;i<linea.length()-1;i++)
{
  System.out.println("VALORES   : "+linea.charAt(i)+" EN POSICION  : "+i);


        if(linea.charAt(i)== ' ' || linea.charAt(i) =='\n'||  linea.charAt(i) ==',' ||  linea.charAt(i) ==';'||  linea.charAt(i) =='.' ){
         aux = guardarPal;
         guardarPal="";
      System.out.println(aux);
         }else{
             guardarPal  = guardarPal +String.valueOf(linea.charAt(i));
        }
         }
   



         j=0;
     } 
   
 
     //System.out.println("estoy aqui    : "+i +" con este valor        :"+linea.charAt(i));

 


fr.close();
}
catch(IOException a){
System.out.println(a);
}

		return 0;
	}

	public int palabraMasLarga(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}





	


	public static int[] frecuenciaVocales(String rutaFichero) {
		int i,j;	
		int count_a = 0,count_e = 0,count_i = 0,count_o = 0,count_u = 0,count_A = 0,count_E = 0,count_I = 0,count_O = 0,count_U = 0;
                try {
		File archivo = new File(rutaFichero);
                String linea;
                FileReader fr = new FileReader (archivo);
                BufferedReader br = new BufferedReader(fr);
		while((linea=br.readLine())!=null) {
             
                    for(i=0;i<linea.length()-1;i++){
                        switch ((char)linea.charAt(i)) {
					case 'a':
                                            count_a++;
					case 'e':
                                            count_e++;
                                            
					case 'i':
                                            count_i++;
					case 'o':
                                            count_o++;
					case 'u':
                                            count_u++;
					case 'A':
                                            count_A++;
					case 'E':
                                            count_E++;
                                        case 'I':
                                            count_I++;
                                        case 'O':
                                            count_O++;
                                        case 'U':
                                            count_U++;

						
				}
                    }	
			}
		
                
        
		
                fr.close();
}
catch(IOException a){
System.out.println(a);
}
            
      int array[] = {count_a,count_e,count_i,count_o,count_u,count_A,count_E,count_I,count_O,count_U};  
	
	
  return array ;


        }
     
	public int frecuenciaLetras(String rutaFichero) {
		// TODO Auto-generated method stub
		return 0;
	}
}

