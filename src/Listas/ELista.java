/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Reportes.Reporte1;
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
    
//    int a,c,d;
//    String b,e,html;
//    
//    Reporte1 rp = new Reporte1();
    
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
        }
    }
        
//    public void Error(){
//     NodoE actual = star;
//     html = "";
//     while(actual != null){
//         a = actual.getEnum(); b = actual.getElex(); c = actual.getEcol(); d = actual.getEcol(); e = actual.getEtoken();
//         html = html + "<tr>"
//                      + "<td><strong>" + a + "</strong></td>"
//                      + "<td><strong>" + b + "</strong></td>"
//                      + "<td><strong>" + c + "</strong></td>"
//                      + "<td><strong>" + d + "</strong></td>"
//                      + "<td><strong>" + e + "</strong></td>"
//                      + "</tr>";         
//         actual.Errorsiguiente();
//     }
//     rp.ReporteError(html);
//    }    
}