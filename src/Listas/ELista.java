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
        }
        else
        {
            System.out.println("Hay errores");
        }
    }
}
