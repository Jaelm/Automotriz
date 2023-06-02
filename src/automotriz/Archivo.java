/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotriz;

import java.io.*;

/**
 *
 * @author Caja
 */
public class Archivo {
    
    public void Grabar(String datos) {
        
        try{
            FileWriter archivo = new FileWriter("Datos.txt");
            try(BufferedWriter almacen = new BufferedWriter(archivo)){
                almacen.write(datos + "\n");
                almacen.close();
            }
            archivo.close();
        }catch(Exception e){
            System.out.println("ayudaaaaaaaaaaaaaaaaaaaa");
        }
        

    }
    
    
       public String leertxt(String direccion){
       
           String texto = "";
           
           try{
               BufferedReader bf = new BufferedReader(new FileReader(direccion));
               String temp = "";
               String bfRead;
               
               while((bfRead = bf.readLine()) != null){
                   
                   temp = temp + bfRead;
               }
               
               texto = temp;
           }catch(Exception e){
               System.out.println("Error");
           }
       
           return texto;
       }
}
