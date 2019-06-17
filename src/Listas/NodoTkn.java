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
public class NodoTkn {
    private int numero;
    private String lexema;
    private int fila;
    private int columna;
    private int idtkn;
    private String tkn;
    private NodoTkn siguiente;
    

    public NodoTkn(){        
    }
    
    public NodoTkn(NodoTkn siguiente,int numero, String lexema, int fila, int columna, int idtkn, String tkn) {
        this.numero = numero;
        this.lexema = lexema;
        this.fila = fila;
        this.columna = columna;
        this.idtkn = idtkn;
        this.tkn = tkn;
        this.siguiente = siguiente;
    }

    public NodoTkn getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTkn siguiente) {
        this.siguiente = siguiente;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getIdtkn() {
        return idtkn;
    }

    public void setIdtkn(int idtkn) {
        this.idtkn = idtkn;
    }

    public String getTkn() {
        return tkn;
    }

    public void setTkn(String tkn) {
        this.tkn = tkn;
    }
    

    public boolean tieneSiguiente(){
     return siguiente!=null;       
    }    
}
