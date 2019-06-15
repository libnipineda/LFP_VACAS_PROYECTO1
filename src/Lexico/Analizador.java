/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexico;

import Listas.ELista;
import Listas.ListaTkn;
import javax.swing.JOptionPane;

/**
 *
 * @author libni
 */
public class Analizador {
    ListaTkn lista = new ListaTkn();
    ELista listaE = new ELista();
    int idtkn;
    int nutknen = 0;
    int idtkns = 0; // numero de tokens definidos
    int fila = 0;
    int columna = 0;
    String token = "";
    
    
    public void Scanner(String entrada)
    {
       int estado = 0;
       String concatenar="";
       String Econcatenar = "";
       
       char tab,salto,espacio,comillas,mayorque,menorque,igual,barra;
       tab = (char)9; salto = (char)10; espacio = (char)32;
       comillas = (char)34; mayorque = (char)62; igual = (char)61; menorque = (char)60;barra = (char)47;
       for(int j =0; j < entrada.length(); j++){
           switch(estado){
               case 0:
                   if(entrada.charAt(j)==(tab) || entrada.charAt(j)==(salto) || entrada.charAt(j)==(espacio))
                   {
                       estado=0; concatenar += entrada.charAt(j); fila++; columna++;
                   }
                   else if(Character.isLetter(entrada.charAt(j)))
                   {
                       estado =1; concatenar += entrada.charAt(j); columna++;
                   }
                   else if(Character.isDigit(entrada.charAt(j)))
                   {
                    estado = 2; concatenar += entrada.charAt(j); columna++;
                   }
                   else if(entrada.charAt(j)==(mayorque) || entrada.charAt(j)==(menorque) || entrada.charAt(j)==(barra) || entrada.charAt(j)==(igual))
                   {
                       estado =3; concatenar += entrada.charAt(j); columna++;
                   }
                   else if(entrada.charAt(j)==(comillas))
                   {
                       estado =4; concatenar += entrada.charAt(j); columna++;
                   }
                   else
                   {
                       Econcatenar += entrada.charAt(j);
                       listaE.registrar(nutknen, Econcatenar, columna, fila,"Valor desconocido", idtkn);
                       nutknen++; concatenar=""; Econcatenar=""; estado=0;
                   }
                   break;
               case 1:
                   if(Character.isLetter(entrada.charAt(j)))
                   {
                       estado = 1; concatenar += entrada.charAt(j); columna++;
                   }
                   else if(Character.isDigit(entrada.charAt(j)))
                   {
                       estado = 1; concatenar += entrada.charAt(j); columna++;
                   }
                   else
                   {
                       Patron(concatenar); j--; estado = estado-1; estado=0;
                       lista.adicionar(nutknen, concatenar, fila, columna, idtkn, token);
                       nutknen++; concatenar="";
                   }
                   break;
                case 2:
                    if(Character.isDigit(entrada.charAt(j)))
                    {
                        estado = 2; concatenar += entrada.charAt(j); columna++;
                    }
                    else
                    {
                       Patron(concatenar); j--; estado = estado-1; estado=0;
                       lista.adicionar(nutknen, concatenar, fila, columna, idtkn, token);
                       nutknen++; concatenar="";
                    }
                   break;
                case 3:
                       Patron(concatenar); j--; estado = estado-1; estado=0;
                       lista.adicionar(nutknen, concatenar, fila, columna, idtkn, token);
                       nutknen++; concatenar="";
                   break;
                case 4:
                    estado = 5; concatenar += entrada.charAt(j); columna++;
                   break;
                case 5:
                    if(entrada.charAt(j)==(comillas))
                    {
                        estado = 6; concatenar += entrada.charAt(j); columna++;
                    }
                    else
                    {
                        estado = 5; concatenar += entrada.charAt(j); columna++;
                    }
                   break;
                case 6:
                       Patron(concatenar); j--; estado = estado-1; estado=0;
                       lista.adicionar(nutknen, concatenar, fila, columna, idtkn, token);
                       nutknen++; concatenar="";
                   break;
           }
       }
       JOptionPane.showMessageDialog(null,"Analisis completo");
       verTkn(); verError();
    }

    public void Patron(String tkn){
        tkn.trim();
        switch(tkn){
            case "":
                break;
            default:
                break;
        }            
    }
            
    public void verTkn(){
        lista.imprimir();
    }
    
    public void verError(){
        listaE.Errorimprimir();
    }
}
