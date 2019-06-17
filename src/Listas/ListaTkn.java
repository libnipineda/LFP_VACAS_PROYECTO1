/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;
import Reportes.Reporte1;

/**
 *
 * @author libni
 */
public class ListaTkn {
    
    NodoTkn inicio;
    int tamaño;
    
    int a,c,d,e;
    String b,f,html;
    
    Reporte1 rp = new Reporte1();
    
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
    
//    public void imprimir(){
//        if(inicio == null)
//        {
//            System.out.println("No se registro ningun dato.");
//            JOptionPane.showMessageDialog(null,"No se registro ningun dato.");
//        }        
//        else
//        {
//            System.out.println("Datos insertados correctamente.");
//            JOptionPane.showMessageDialog(null,"Datos insertados correctamente."); 
//            Escribir();        
//        }
//    }
    
    public void Escribir(){
      NodoTkn actual = inicio;
      html = "";
      while(actual != null){
          a = actual.getNumero(); b = actual.getLexema(); c = actual.getFila(); d = actual.getColumna(); e = actual.getIdtkn(); f = actual.getTkn();
          html = html + "<tr>"
                      + "<td><strong>" + a + "</strong></td>"
                      + "<td><strong>" + b + "</strong></td>"
                      + "<td><strong>" + c + "</strong></td>"
                      + "<td><strong>" + d + "</strong></td>"
                      + "<td><strong>" + e + "</strong></td>"
                      + "<td><strong>" + f + "</strong></td>"
                      + "</tr>";
        actual = actual.getSiguiente();
      }
      rp.ReporteTkn(html);
    }    
}