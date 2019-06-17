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
public class ListaTkn {
    
    NodoTkn inicio;
    int tamaño;
    
    public boolean adicionar(int numero, String lexema, int fila, int columna, int idtkn, String tkn){
      if(inicio == null)
      {
          inicio = new NodoTkn(null, numero,lexema,fila,columna,idtkn,tkn);
          tamaño++;
          return true;
      }
      else{
          NodoTkn temp = inicio;
          while(temp.tieneSiguiente()){
              temp = temp.getSiguiente();
          }
          temp.setSiguiente( new NodoTkn(null, numero,lexema,fila,columna,idtkn,tkn));
          tamaño++;
          return true;
      }
    }
    
    public void imprimir(){
        if(inicio == null)
        {
            System.out.println("No se registro ningun dato.");
            JOptionPane.showMessageDialog(null,"No se registro ningun dato.");
        }        
        else
        {
            System.out.println("Datos insertados correctamente.");
            JOptionPane.showMessageDialog(null,"Datos insertados correctamente."); 
            ReporteTkn();            
        }
    }
    
    
    public void ReporteTkn()
    {
        String datos = "";
        NodoTkn aux = inicio;        
        datos = datos +"<tr>"
                + "<td><strong>" + aux.getNumero() +"</strong></td>"
                + "<td><strong>" + aux.getLexema() +"</strong></td>"
                + "<td><strong>" + aux.getIdtkn() +"</strong></td>"
                + "<td><strong>" + aux.getTkn() +"</strong></td>"
                + "<td><strong>" + aux.getFila() +"</strong></td>"
                + "<td><strong>" + aux.getColumna() +"</strong></td>"
                +"</tr>";        
        try
        {
         FileWriter archivo = new FileWriter("C:/Users/libni/Desktop/ReporteToken.html");
         PrintWriter write = new PrintWriter(archivo);
         write.println("<html>");
         write.println("<head>");
         write.println("<title> LFP PRACTICA NO. 1  TABLA DE TOKEN´S</title>");
         write.println("</head>");
         write.println("<body>");
         write.println("<h1> Listado de Tokens</h1>");
         write.println("<table border>");
         write.println("<tr>");
         write.println("<td><strong>No</strong></td>");
         write.println("<td><strong>Lexema</strong></td>");
         write.println("<td><strong>ID_Token</strong></td>");
         write.println("<td><strong>Token</strong></td>");
        write.println("<td><strong>Fila</strong></td>");
        write.println("<td><strong>Columna</strong></td>");
         write.println("</tr>");
         write.println(datos);
         write.println( "</table>");
         write.println("</body>");
         write.println( "</html>");
        archivo.close();
        Abrir();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }        
    }
    
    public void Abrir()
    {        
     try
     {
         File f = new File("C:/Users/libni/Desktop/ReporteToken.html");
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