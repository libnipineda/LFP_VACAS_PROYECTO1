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
public class NodoE {   
    private NodoE sig;
    private int Enum;
    private String Elex;
    private int Ecol;
    private int Efila;
    private String Etoken;
    private int Eidtkn;  

    public NodoE(NodoE sig, int Enum, String Elex, int Ecol, int Efila, String Etoken, int Eidtkn) {
        this.sig = sig;
        this.Enum = Enum;
        this.Elex = Elex;
        this.Ecol = Ecol;
        this.Efila = Efila;
        this.Etoken = Etoken;
        this.Eidtkn = Eidtkn;
    }

    public NodoE(){        
    }
        

    public int getEnum() {
        return Enum;
    }

    public void setEnum(int Enum) {
        this.Enum = Enum;
    }

    public String getElex() {
        return Elex;
    }

    public void setElex(String Elex) {
        this.Elex = Elex;
    }

    public int getEcol() {
        return Ecol;
    }

    public void setEcol(int Ecol) {
        this.Ecol = Ecol;
    }

    public int getEfila() {
        return Efila;
    }

    public void setEfila(int Efila) {
        this.Efila = Efila;
    }

    public String getEtoken() {
        return Etoken;
    }

    public void setEtoken(String Etoken) {
        this.Etoken = Etoken;
    }

    public int getEidtkn() {
        return Eidtkn;
    }

    public void setEidtkn(int Eidtkn) {
        this.Eidtkn = Eidtkn;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }        
    
    public boolean Errorsiguiente(){
        return sig!=null;
    }
    
}
