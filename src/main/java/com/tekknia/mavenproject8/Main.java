/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import Reto8.NuevoArchivo.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class Reto8_ParaEntregar {
    
    public static void main(String[] args) {
        String unaRuta = "C:\\Users\\Vladimir\\Desktop\\Reto8\\TSLA - copia.txt";
        leerPorBytes (unaRuta);
        System.out.println();
        leerArchivo(unaRuta);
        System.out.println();
   
        
    }
    public static void leerPorBytes(String ruta){
        Path miRuta =Paths.get(ruta);
        byte [] bytesArchivo;
        try {
            bytesArchivo = Files.readAllBytes(miRuta);
            for (byte actual : bytesArchivo){
                System.out.println(actual);
            }
            }catch (IOException e){
                System.out.println("Hubo un error al acceder el archivo: " + e.getMessage());
            }
        
    }
    public static void leerArchivo(String ruta) {
       
   // Fichero del que queremos leer
		File fichero = new File("C:\\Users\\Vladimir\\Desktop\\Reto8\\TSLA - copia.txt");
		Scanner s = null;

		try {
			
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);
                        
                        
                   
			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	
				System.out.println(linea);      
                                                               
			}

		} catch (FileNotFoundException ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
    

   

    
   

    
}
