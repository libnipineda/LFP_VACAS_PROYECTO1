/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author libni
 */
public class ELista {
    NodoE star;
    int count;
    
    
    public boolean registrar(int number, String elex, int ecol, int efila, String etkn, int eid){
        if(star == null){
            star = new NodoE(null,number,elex,ecol,efila,etkn,eid);
            count++;
            return true;
        }
        else{
            NodoE aux = star;
            while(aux.Errorsiguiente()){
                aux.Errorsiguiente();
            }
            aux.setSig(new NodoE(null,number,elex,ecol,efila,etkn,eid));
            count++;
            return true;
        }
    }
    
    public void Errorimprimir(){
        if(star == null)
        {
            System.out.println("No hay errores");
            JOptionPane.showMessageDialog(null,"No hay errores.");
        }
        else
        {
            System.out.println("Hay errores");
            JOptionPane.showMessageDialog(null,"Hay errores.");
            ReporteError();  
        }
    }
    
    public void ReporteError(){
        String archivo="";
        
        archivo = archivo + "<tr>"
                + "<td><strong>" + star.getEnum() +"</strong></td>"
                + "<td><strong>" + star.getElex() +"</strong></td>"
                + "<td><strong>" + star.getEfila() +"</strong></td>"
                + "<td><strong>" + star.getEcol() +"</strong></td>"
                + "<td><strong>" + star.getEtoken() +"</strong></td>"
                +"</tr>";        
        try
        {
         FileWriter file = new FileWriter("C:/Users/libni/Desktop/ReporteError.html");
         PrintWriter write = new PrintWriter(file);
        write.println("<html>");
        write.println("<head>");
        write.println("<title> LFP PRACTICA NO. 1  TABLA DE ERRORES</title>");
        write.println("</head>");
        write.println("<body>");
        write.println("<h1> Listado de Errores</h1>");
        write.println("<table border>");
        write.println("<tr>");
        write.println("<td><strong>No</strong></td>");
        write.println("<td><strong>Caracter</strong></td>");
        write.println("<td><strong>Fila</strong></td>");
        write.println("<td><strong>Columna</strong></td>");
        write.println("<td><strong>Descripcion</strong></td>");
        write.println("</tr>");
        write.println(archivo);
        write.println("</table>");
        write.println("</body>");
        write.println("</html>");
        file.close();
        EAbrir();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    public void EAbrir()
    {        
     try
     {
         File f = new File("C:/Users/libni/Desktop/ReporteError.html");
         Desktop.getDesktop().open(f);
     }
     catch(IOException e)
     {
         e.printStackTrace();
     }
     catch(IllegalArgumentException e)
     {
         JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
         e.printStackTrace();
     }
    }
        
}
