/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

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
        }        
        else
        {
            System.out.println("Datos insertados correctamente.");
        }
    }             
}
