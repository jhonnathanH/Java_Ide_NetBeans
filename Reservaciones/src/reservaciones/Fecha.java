package Reservaciones;

public class Fecha {

	String dd;
	String mm;
	String dia;
	String aa;
	int DD,AA,numdia,nummes;
       
       
   //objeto para la obtencion de cada variable de entrada de la FECHA   
 public Fecha (String cadena){

	dd=""+cadena.charAt(0)+cadena.charAt(1);
	DD= Integer.parseInt(dd);
	mm=""+cadena.charAt(2)+cadena.charAt(3)+cadena.charAt(4);
	dia=""+cadena.charAt(6)+cadena.charAt(7)+cadena.charAt(8);
	aa=""+cadena.charAt(10)+cadena.charAt(11)+cadena.charAt(12)+cadena.charAt(13);
	AA= Integer.parseInt(aa);

	}
 
 public int dianumero(){
	      return DD;    //devuelve el numero del dia
	  }
	  
  public String diaSemana(){
	      return dia;	       //devuelve el nombre del dia
	  }
	  
  public int aaaa(){
	      return AA;     //devuelve el a;o
	  }
	  
 public String Mes(){
	      return mm;      //devuelve el mes
	  }
 
 public int vectordia(String dial){
     
                                        if((dial.equals("mon"))){

                                         numdia=0; 
                                       }

                                       if((dial.equals("tue"))){
                                         numdia=1; 
                                          
                                       }
                                       if((dial.equals("wed"))){
                                         numdia=2; 
                                          
                                       }
                                       if((dial.equals("thu"))){
                                         numdia=3; 
                                           
                                       }
                                       if((dial.equals("fri"))){

                                          numdia=4; 
                                       }
                                       if((dial.equals("sat"))){

                                           numdia=5; 
                                       }

                                       if((dial.equals("sun"))){

                                           numdia=6; 
                                       }
     
    return numdia;
    
}
 
 public int vectormes(String mes){
     
                                        if((mes.equals("jan"))){

                                         nummes=0; 
                                       }

                                       if((mes.equals("feb"))){
                                         nummes=1; 
                                          
                                       }
                                       if((mes.equals("mar"))){
                                         nummes=2; 
                                          
                                       }
                                       if((mes.equals("apr"))){
                                         nummes=3; 
                                           
                                       }
                                       if((mes.equals("may"))){

                                          nummes=4; 
                                       }
                                       if((mes.equals("jun"))){

                                           nummes=5; 
                                       }

                                       if((mes.equals("jul"))){

                                           nummes=6; 
                                       }
                                       
                                       if((mes.equals("aug"))){

                                         nummes=7; 
                                       }

                                       if((mes.equals("sep"))){
                                         nummes=8; 
                                          
                                       }
                                       if((mes.equals("oct"))){
                                         nummes=9; 
                                          
                                       }
                                       if((mes.equals("nov"))){
                                         nummes=10; 
                                           
                                       }
                                       if((mes.equals("dec"))){

                                          nummes=11; 
                                       }
                                       
     
    return nummes;
    
}
 
 
 
 
}
	    

