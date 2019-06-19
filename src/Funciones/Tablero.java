package Funciones;

import Listas.ListaTkn;
import Listas.NodoTkn;
import javax.swing.JOptionPane;


/**
 *
 * @author libni
 */
public class Tablero {
  int Dimx=0, Dimy=0,Posx = 0, Posy = 0, x = 0, y = 0, a = 0, b = 0;
  NodoTkn valor = new NodoTkn();  
  
  public void FunEdificio(){
      boolean num = false,num2 = false,numx = false, numy = false;      
      //------------------------------------------- Coordenada X ----------------------------------------------------------
      if(valor.getLexema().equals("DimensionX")){
          num = true;          
      }
      if(num){
          if(valor.getLexema().equals("=")){
              numx=true;
              num=false;
          }
      }
      if(numx){
          try
          {
              if(valor.getTkn().equals("Numero")){
                  Dimx = Integer.parseInt(valor.getLexema());
                  numx = false;
              }
          }
          catch(Exception e)
          {
              DimensionEdificio();
          }
       } // fin coordenada x
      //------------------------------------------- Y ----------------------------------------------------------
      if(valor.getLexema().equals("DimensionX")){
          num2 = true;
      }
      if(num2){
          if(valor.getLexema().equals("=")){
              numy = true;
              num = false;
          }
      }
      if(numy){
          try
          {
              if(valor.getTkn().equals("Numero")){
                  Dimy = Integer.parseInt(valor.getLexema());
                  numy = false;
              }
          }
          catch(Exception e){
              DimensionEdificio();
          }
      }
      }  
  
  public void DimensionEdificio(){
      if(Dimx > 0 && Dimx <= 15 || Dimy >0 && Dimy <= 15){
          
      }
      else
      {
          JOptionPane.showMessageDialog(null,"Los intervalos no permiten crear el edificio, intente cambiar las dimensiones.");
      }
  }
  
  public void FunBloque(){
      boolean num = false,numx = false, num2 = false, numy = false;
      //------------------------------------------- Coordenada X ----------------------------------------------------------
      if(valor.getLexema().equals("Bloque") && valor.getLexema().equals("PosicionX")){
          num = true;
      }
      if(num){
          if(valor.getLexema().equals("=")){
              numx=true;
              num=false;
          }
      }
      if(numx){
          try
          {
              if(valor.getTkn().equals("Numero")){
                  Posx = Integer.parseInt(valor.getLexema());
                  numx = false;
              }
          }
          catch(Exception e)
          {
              DimensionEdificio();
          }
       } 
      //------------------------------------------- Coordenada Y ----------------------------------------------------------
      if(valor.getLexema().equals("PosicionY")){
          num2 = true;
      }
      if(num2){
          if(valor.getLexema().equals("=")){
              numy=true;
              num=false;
          }
      }
      if(numy){
          try
          {
              if(valor.getTkn().equals("Numero")){
                  Posy = Integer.parseInt(valor.getLexema());
                  numy = false;
              }
          }
          catch(Exception e)
          {
              DimensionEdificio();
          }
      }
  }
  
  public void DimensionBloque(){
      if(Posx >= 0 || Posy >= 0){
          
      }
      else
      {
          JOptionPane.showMessageDialog(null,"Los intervalos no permiten crear el bloque, intente cambiar las dimensiones.");
      }
  }
  
  public void FunEscalera(){
      boolean num = false,numx = false, num2 = false, numy = false;
      //------------------------------------------- Coordenada X ----------------------------------------------------------
      if(valor.getLexema().equals("Escalera") && valor.getLexema().equals("PosicionX")){
          num = true;
      }
      if(num){
          if(valor.getLexema().equals("=")){
              numx=true;
              num=false;
          }
      }
      if(numx){
          try
          {
              if(valor.getTkn().equals("Numero")){
                  x = Integer.parseInt(valor.getLexema());
                  numx = false;
              }
          }
          catch(Exception e)
          {
              DimensionEdificio();
          }
       } 
      //------------------------------------------- Coordenada Y ----------------------------------------------------------
      if(valor.getLexema().equals("PosicionY")){
          num2 = true;
      }
      if(num2){
          if(valor.getLexema().equals("=")){
              numy=true;
              num=false;
          }
      }
      if(numy){
          try
          {
              if(valor.getTkn().equals("Numero")){
                  y = Integer.parseInt(valor.getLexema());
                  numy = false;
              }
          }
          catch(Exception e)
          {
              DimensionEdificio();
          }
      }
  }
  
  public void DimensionEscalera(){
      if(x >= 0 || y >= 0){
          
      }
      else
      {
          JOptionPane.showMessageDialog(null,"Los intervalos no permiten crear la escalera, intente cambiar las dimensiones.");
      }
  }
  
  public void ObtenerImagenEnemigo(){
      boolean img = false, obtener = false;
      
      if(valor.getLexema().equals("Personaje")){
          img = true;
      }
      if(img){
          if(valor.getLexema().equals("imagen")){
              img = false;
              obtener = true;
          }
      }
  }
  
  public void ObtenerImagenPersonaje(){
      
  }
  
  public void FunMovimientos(){
      boolean num = false,numx = false, num2 = false, numy = false;
       //------------------------------------------- Coordenada X ----------------------------------------------------------
      if(valor.getLexema().equals("Movimiento") && valor.getLexema().equals("PosicionX")){
          num = true;
      }
      if(num){
          if(valor.getLexema().equals("=")){
              numx=true;
              num=false;
          }
      }
      if(numx){
          try
          {
              if(valor.getTkn().equals("Numero")){
                  a = Integer.parseInt(valor.getLexema());
                  numx = false;
              }
          }
          catch(Exception e)
          {
              DimensionEdificio();
          }
       } 
      //------------------------------------------- Coordenada Y ----------------------------------------------------------
      if(valor.getLexema().equals("PosicionY")){
          num2 = true;
      }
      if(num2){
          if(valor.getLexema().equals("=")){
              numy=true;
              num=false;
          }
      }
      if(numy){
          try
          {
              if(valor.getTkn().equals("Numero")){
                  b = Integer.parseInt(valor.getLexema());
                  numy = false;
              }
          }
          catch(Exception e)
          {
              DimensionEdificio();
          }
      }
  }
  

  public void DimensionMovimiento(){
      if(a >= 0 || b >=0 ){
          
      }
      else
      {
          JOptionPane.showMessageDialog(null,"Los intervalos no permiten realizar los movimientos.");
      }
  }  
}