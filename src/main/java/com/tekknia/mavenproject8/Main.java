/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*Java reto 8 Universidad de Antioquia Alejandro restrepo - Vladimir Ortega*/


package Reto8;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Vladimir
 */
public class Reto8_ParaEntregar {
    
    public static void main(String[] args) throws IOException {
        String ruta = "C:\\Users\\Vladimir\\Desktop\\Reto8\\TSLA - copia.txt";
        
        leerPorBytes (ruta);
        System.out.println();
        leerArchivo(ruta);
        System.out.println();
       // concepto_accion(ruta);
       // System.out.println();
        numeral3 (ruta);
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
    
    public static String concepto_accion(String ruta) throws IOException{
           
            try {
                
            FileInputStream file = new FileInputStream(new File("C:\\Users\\Vladimir\\Desktop\\Reto8\\TSLA - copia.txt"));
                        
           
            double celda = Double.parseDouble(ruta);
           
             if (celda<200) return "MUY BAJO";
            {
                         
            }
            if (200<=celda && celda<300) return " BAJO";
            {
            }
            if (300<=celda && celda<500) return " MEDIO";
            {
            }   
            if (500<=celda && celda<600) return " ALTO";
            {    
            } 
            if (600<=celda) return " MUY ALTO";
            {    
            }  
         
                                    
            file.close();
            
            FileOutputStream output = new FileOutputStream("C:\\Users\\Vladimir\\Desktop\\Reto8\\TSLA111.txt");
            //file.write(output);
            output.close();
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    }
    
     public static void numeral3(String ruta) {
    
         System.out.println("Responda: ¿Qué utilidad tiene aplicar uno u otro de los dos métodos anteriores?");
         System.out.println("R//= Considero mucho mejor el primer metodo, porque permite leer linea por linea,\n y cada byte ser "
                 + "tenido en cuenta mas facilmente evitando menos errores o perdida de informacion");
         
    }
      
}
