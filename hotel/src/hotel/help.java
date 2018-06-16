/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.     20mar(mon)2016
 */
package hotel;



/**
 *
 * @author Jhonnnathan               
 */
public class help {
    String dd;
String mm;
String dia;
String aa;
int DD,AA;
    //objeto para la obtencion de cada variable de entrada de la FECHA   
    public help (String cadena)
{

dd=""+cadena.charAt(0)+cadena.charAt(1);
DD= Integer.parseInt(dd);
mm=""+cadena.charAt(2)+cadena.charAt(3)+cadena.charAt(4);
dia=""+cadena.charAt(6)+cadena.charAt(7)+cadena.charAt(8);
aa=""+cadena.charAt(10)+cadena.charAt(11)+cadena.charAt(12)+cadena.charAt(13);
AA= Integer.parseInt(aa);

}
  public int dianumero(){
      return DD;
      //devuelve el numero del dia
  }
  
  public String diaSemana(){
      return dia;
       //devuelve el nombre del dia
  }
  
  public int año(){
      return AA;
       //devuelve el a;o
  }
  
   public String Mes(){
      return mm;
       //devuelve el mes
  }
          
        
}
    

