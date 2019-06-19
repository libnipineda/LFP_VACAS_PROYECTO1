package Listas;

import Reportes.Reporte1;

public class ListaTkn {
    
    NodoTkn inicio;    
    int tamaño;        
    
    Reporte1 crear = new Reporte1();
    String filas="";
    
   public boolean adicionar(int numero, String lexema, int fila, int columna, int idtkn, String tkn){
       
      if(inicio==null)
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
          temp.setSiguiente(new NodoTkn(null, numero,lexema,fila,columna,idtkn,tkn));
          tamaño++;
          imprimir();
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
            NodoTkn temp = inicio;
            while(temp.tieneSiguiente()){
                temp.getSiguiente();               
            }            
//            System.out.println(temp.numero+" " +temp.lexema+" "+temp.fila+" "+temp.columna+" "+temp.idtkn+" "+temp.tkn);
               filas = filas + "<tr>" 
                    +"<td><strong>"+ temp.numero +"</strong></td>"
                    +"<td><strong>"+ temp.lexema +"<td><strong>"
                    +"<td><strong>"+ temp.idtkn +"</strong></td>"
                    +"<td><strong>"+ temp.tkn + "</strong></td>"
                    +"</tr>";
            crear.ReporteTkn(filas);
        }
    }             
}