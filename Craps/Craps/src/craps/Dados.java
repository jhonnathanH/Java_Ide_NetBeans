package craps;
import java.util.*;
public class Dados {
int d1;
int d2;
Dados vector[]= new Dados[100];
public Dados() {
Random r = new Random(); // Creación del objeto Random
r.setSeed(new Date().getTime());
d1 = (int)(r.nextInt(6) + 1);
d2 = (int)(r.nextInt(6) + 1);
}
// Método que recibe un objeto dados y lo compara con el objeto que ejecuta el método (this)
boolean Compara(Dados f){
    if((this.d1+this.d2)==(f.d1+f.d2)){
        return true;          
    }
    else return false;
}
// Método que genera un vector de objetos tipo dados
 public Dados[] generar( int n) {
    Dados v[] = new Dados[n];
    Random r = new Random(); // Creación del objeto Random
    r.setSeed(new Date().getTime()); 
    for (int i=0; i<n; i++) {
        v[i] = new Dados();
        v[i].d1 = (int)(r.nextInt(6) + 1);
        v[i].d2 = (int)(r.nextInt(6) + 1);
        }            
    return v;
    }
// Método que determina si una jugada es natural (7 u 11)
  boolean Comparar711(){
  if((this.d1+this.d2)==7){
      return true;
  }
  if((this.d1+this.d2)==11){
      return true;
  }
  else { return false;
 }
 
  }
// Método que determina si una jugada es igual al punto de inicio
  boolean CompararPinicio(Dados f){
  if((this.d1+this.d2)==(f.d1+f.d2)){
 return true;
  }
  else { return false;}
  }
// Método que determina si una jugada es craps (2,3,12)
   boolean Comparar2312(){
  if((this.d1+this.d2)==2){
      return true;
  }
  if((this.d1+this.d2)==3){
      return true;
  }
  if((this.d1+this.d2)==12){
      return true;
  }
  else { 
      return false;
  
  }
  
   }
  
}

