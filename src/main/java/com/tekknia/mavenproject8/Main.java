/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekknia.mavenproject8;

/**
 *
 * @author Vladimir
 */
public class Main {
    public static void main(String[] args) {
        String unaRuta = "C:\\Users\\Vladimir\\Desktop\\Reto8\\TSLA - copia.txt";
        leerPorBytes (unaRuta);
        System.out.println();
        leerPorLineas(unaRuta);
        System.out.println();
        //pasarLineasNuevoArchivo (unaRuta);
       // System.out.println();
        pasarNuevoArchivo (unaRuta);
        System.out.println();
        leerPorLineasSeparando(unaRuta);
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
    public static void leerPorLineas(String ruta) {
       
        Path miRuta = Paths.get(ruta);
        
        List <String> lineasArchivo;
        try {
            
            lineasArchivo = Files.readAllLines(miRuta);
            for (String lineaActual : lineasArchivo){
                System.out.println(lineaActual);
                }
            
        }catch(IOException e){
            System.out.println("Hubo un error al acceder el archivo"+ e.getMessage());
        }
         
    }
    
    public class NuevoArchivo{
        private String cedula;
	private String nombres;
   
    public NuevoArchivo() {
        
        }
        public String getCedula() {
		return cedula;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
    }
     
    
    public static void pasarNuevoArchivo (ArrayList lista) {
        FileWriter flwriter  = null;
        try {
            flwriter = new FileWriter("C:\\Users\\Vladimir\\Desktop\\Reto8\\Registro_Aleatorio\\Aleatorios.txt");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (NuevoArchivo nuevoArchivo : lista) {
               bfwriter.write(nuevoArchivo.getCedula() + "," + nuevoArchivo.getNombres() + "," + "\n");
            }
            bfwriter.close();
            System.out.println("Archivo creado satisfactoriamente..");


        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (flwriter != null) {
            try {
                  flwriter.close();
                 }catch (IOException e) {
                    e.printStackTrace();
            }
            
        }
        
    }
}
    
    /*public static void pasarLineasNuevoArchivo (String ruta) {
        String unaRuta = "C:\\Users\\Vladimir\\Desktop\\Reto8\\Registro_Aleatorio\\Aleatorios.txt";
        try {
            escribirArchivoInicial (unaRuta);
        }catch (IOException e){
            System.out.println("Hubo un error al acceder al archivo" + e.getMessage());
        }
                        
    }
    public static void escribirArchivoInicial (String ruta) throws IOException {
        String cadena = "Esta es la posicion 01\r\nEsta es la posicion 02\r\n";
        //"C:\\Users\\Vladimir\\Desktop\\Reto8\\Registro_Aleatorio\\aleatorio.txt"
        Path miRuta = Paths.get(ruta);
        byte [] bytesCadena = cadena.getBytes(); 
        Files.write(miRuta, bytesCadena);
        
        
    }*/
    
    public static void leerPorLineasSeparando(String ruta) {
        String[] palabras;
        Path miRuta = Paths.get(ruta);
        
         List <String> lineasArchivo;
        try {
            lineasArchivo = Files.readAllLines(miRuta);
            for (String lineaActual : lineasArchivo){
                palabras = lineaActual.split(" ");
                System.out.println("La primera palabra es " + palabras[0] + "La segunda palabra es "+ palabras[1]);
            }
            
        }catch(IOException e){
            System.out.println("Hubo un error al acceder el archivo"+ e.getMessage());
        }
    
}
}
