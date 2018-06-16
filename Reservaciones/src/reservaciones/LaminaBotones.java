package Reservaciones;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class LaminaBotones extends JPanel { //clase de JPanel , construccion de lamina con todo los botones de la aplicacion

	private Image imagen; //logo
	int variable1, variable2; 
	private JButton search;
	private String h1="Lakewood";
	private String h2="Bridgewood";
	private String h3="Ridgewood";
	private JRadioButton op1, op2;
	private JTextField date1, date2, nombrehotel, costofinal, descuentotal;
	private JLabel fecha_inicio, fecha_salida, nombre_hotel, costo, descuento, custumer, nombre;
	int ban1=0, ban2=0, ban3=0,ban=0; //valor que tendra la variable para el costo del hotel
        int valordesc1=0,valordesc2=0,valordesc3=0,valorDESC=0, costovalor=0,k=0;
	int d2;
	String opcion,fechainicial ;

        String[] vectorDIA ={"mon","tue","wed","tue","fri","sat","sun"};
        String[] vectorMES ={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
	
	public LaminaBotones(){
		
		//colocamos los disferentes campo en nuestra lamina.
		setLayout(null);
		
		nombre=new JLabel("SEARCH");
		
		custumer=new JLabel("Custumer Type");
		
		ButtonGroup migrupo1=new ButtonGroup();
		
		op1=new JRadioButton("Regular");//constructor que recibe dos para par�etros,si el usuario es un cliente regular o premiado.
		
		op2=new JRadioButton("Rewards");
		
		fecha_inicio=new JLabel("Fecha de Inicio: ");
				
		fecha_salida=new JLabel("Fecha de Salida: ");
		
		nombre_hotel=new JLabel("HOTEL: ");
		
		costo=new JLabel("Costo: ");
		
		descuento=new JLabel("Descuento: ");
		
		search=new JButton("Search");//boton buscar
		
		date1=new JTextField("DDmm(dia)yyyy",10);
		
		date2=new JTextField("DDmm(dia)yyyy",10);
		
		nombrehotel=new JTextField(10);
	
		nombrehotel.setEnabled(false);
		
		costofinal=new JTextField(10);
		
		costofinal.setEnabled(false);
		
		descuentotal=new JTextField(10);
		
		descuentotal.setEnabled(false);		
		
		add(nombre);
		
		add(custumer);
		
		migrupo1.add(op1);

		migrupo1.add(op2);
		
		//agregamos el boton a la lamina
		
		add(op1);
		
		add(op2);
		
		add(fecha_inicio);
		
		add(date1);
		
		add(fecha_salida);
		
		add(date2);
		
		add(nombre_hotel);
		
		add(nombrehotel);
		
		add(costo);
		
		add(costofinal);
		
		add(descuento);
		
		add(descuentotal);
		
		add(search);
		
JOptionPane.showMessageDialog(null, "Ingresar Fecha DDMES(dia)AAAA  y  Tipo de usuario");
		
		ManejarOpciones manejador=new ManejarOpciones();//instancias para agregarle una accion a las opciones agregagada
		op1.addItemListener(manejador); op2.addItemListener(manejador);
		ManejarBoton manejarSearch=new ManejarBoton();//instancia del buscador 
		
		search.addActionListener(manejarSearch);//escuchar boton search
		
	}
	
public void paint(Graphics g){ 
	
	super.paint(g);
		
	
	try{//logo de a imagen de hotel search
		
		imagen=ImageIO.read(new File("src/imagen/hotelsearch.png"));//se crea una variable que tendra el archivo de la imagen requerida.
	
	}
	
	catch(IOException e){
		
		System.out.println("la imagen no se encuentra");//mensaje en caso de que no consiga la imagen en la pantalla
	
	}
	
	g.drawImage(imagen,10,10,null);//posicionamiento de la imagen en la pantalla 
	
}

private class ManejarOpciones implements ItemListener{ //se crea una clase privada para agregarle un i

	public void itemStateChanged(ItemEvent evento) { 
		
			if (op1.isSelected()){
			
				variable1=1;
				variable2=0;
			}
		
                        if (op2.isSelected()){
			
				variable2=1;
				variable1=0;
			}
	}
}
	

private class ManejarBoton implements ActionListener{

        @Override
	public void actionPerformed(ActionEvent e) {
		
				if (e.getSource() == search){
                                JOptionPane.showMessageDialog(null, "recuerde los diminutivos de dia y mes en INGLES");
				String v1= date1.getText();
                                Fecha algo1= new Fecha(v1);
                                String m1 = algo1.Mes();
                                int dd1 = algo1.dianumero();
                                        
                                String v2= date2.getText();    
				Fecha algo2= new Fecha(v2);
                                String m2 = algo2.Mes();
                                int dd2 = algo2.dianumero();
                                    if(m1.equals(m2)){ 
                                        k=dd2-dd1;
                                    }else{
                                        int ValorA= (algo2.vectormes(m2))-(algo1.vectormes(m1));
                                        k=(30*ValorA)+dd2-dd1;
                                    }
                                    
                                
                                    
                                    
                                    
                                    
                            for(int i=0;i<k;i+=1) {   
				String vtx1;
				
				vtx1= date1.getText();
				
				Fecha algo= new Fecha(vtx1);
				
				int dd = algo.dianumero();
				
				String dia = algo.diaSemana();
				
                                if (ban==0){
                                     fechainicial = vtx1;  
                                    ban=1;
                                }
                                
                                
				String mes = algo.Mes();
				
				int AA = algo.aaaa();
				
				//codigo principal para el calculo del costo diario en cada hotel
				//condicion de cuanto vale el hotel de lunes a viernes para un cliente regular
				if ((dia.equals("mon") || dia.equals("tue")|| dia.equals("wen")|| dia.equals("thu")|| dia.equals("fri") )&& variable1==1){
					ban1=ban1+110;
					ban2=ban2+160;
					ban3=ban3+220;
                                        
				   //si el cliente es rewards se le hace un descuento en los dia de la semana ( lunes a viernes) 
				} else if((dia.equals("mon") || dia.equals("tue")|| dia.equals("wen")|| dia.equals("thu")|| dia.equals("fri") )&& variable2==1) {
				    ban1=ban1+80;
				    ban2=ban2+110;
				    ban3=ban3+100;
                                    valordesc1=valordesc1+30; valordesc2=valordesc2+50; valordesc3=valordesc3+120;
                                    
				 }//si el usuario reserva el hotel los dia sabado y domingo este serial el costo del hotel
				if ((dia.equals("sat") || dia.equals("sun"))&& variable1==1){
					
					ban1=ban1+90;
					ban2=ban2+60;
					ban3=ban3+150;
					//si el cliente es un cliente rewards tendra el siguiente descuento en el fin de seamana
				}else if((dia.equals("sat") || dia.equals("sun"))&&variable2==1){
				    
					ban1=ban1+80;
				    ban2=ban2+50;
				    ban3=ban3+40;
                                     valordesc1=valordesc1+10; valordesc2=valordesc2+10; valordesc3=valordesc3+110;
				}
				//verificar cual hotel es la mejor opcion
				if(ban1==ban2 && ban2< ban3){
				    opcion=h2;
                                    costovalor=ban2;
                                    valorDESC=valordesc2;}
					if(ban2==ban3 && ban2< ban1){
						opcion=h3;
                                                 costovalor=ban3;
                                                 valorDESC=valordesc3;}
						if(ban1==ban3 && ban1< ban2){
							opcion=h3;
                                                        costovalor=ban3;
                                                        valorDESC=valordesc3;}
							if((ban1 < ban2 && ban2 < ban3) || (ban1< ban3 && ban3< ban2)){
								opcion=h1;
                                                                 costovalor=ban1;
                                                                  valorDESC=valordesc1;}
								if((ban3 < ban2 && ban2< ban1) ||( ban3< ban1 && ban3< ban2)){
									opcion=h3;
                                                                         costovalor=ban3;
                                                                         valorDESC=valordesc3;}
									if((ban2 < ban1 && ban1< ban3 )|| (ban2< ban1 && ban3< ban1)){
										opcion=h2;
                                                                                 costovalor=ban2;
                                                                                 valorDESC=valordesc2;}
		
				    
				System.out.println(opcion+"-----" +  ban1 +"  "+ ban2 +"  "+   ban3);
				//si desea agregar otro dia  
				if(dd<= 30){
					d2=dd+1;
				    if((dia.equals("mon"))){
				    
				    	date1.setText(d2+mes+"(tue)"+AA);
				    }
				    
				    if((dia.equals("tue"))){
				            
				    	date1.setText(d2+mes+"(wed)"+AA);
				    }
				    if((dia.equals("wed"))){
				    
				    	date1.setText(d2+mes+"(thu)"+AA);
				    }
				    if((dia.equals("thu"))){
				   
				    	date1.setText(d2+mes+"(fri)"+AA);
				    }
				    if((dia.equals("fri"))){
				     
				    	date1.setText(d2+mes+"(sat)"+AA);
				    }
				    if((dia.equals("sat"))){
				           
				    	date1.setText(d2+mes+"(sun)"+AA);
				    }
				    
				    if((dia.equals("sun"))){
				            
				    	date1.setText(d2+mes+"(mon)"+AA);
				    }
                                    
                                    if(dd==30 && (algo.vectormes(mes))%2!=0){
                                        mes=vectorMES[(algo.vectormes(mes))+1];
                                        if((dia.equals("sun"))){
                                            dia="mon";
                                        
                                        }else{
                                            dia=vectorDIA[(algo.vectordia(dia))+1];
                                        }
                                            
                                        date1.setText(01+mes+"("+dia+")"+AA);
                                    }
                                    if(dd==31 && (algo.vectormes(mes))%2==0){
                                        mes=vectorMES[(algo.vectormes(mes))+1];
                                        if((dia.equals("sun"))){
                                            dia="mon";
                                        
                                        }else{
                                            dia=vectorDIA[(algo.vectordia(dia))+1];
                                        }
                                            
                                        date1.setText(01+mes+"("+dia+")"+AA);
                                        
                                        }
                                        
                                    if(dd==28 && mes.equals("feb")){
                                        mes=vectorMES[(algo.vectormes(mes))+1];
                                        if((dia.equals("sun"))){
                                            dia="mon";
                                        
                                        }else{
                                            dia=vectorDIA[(algo.vectordia(dia))+1];
                                        }
                                          date1.setText(01+mes+"("+dia+")"+AA);
                                    }
                                    
                                    
                                    
                                    
                                    
				}//mostrar los valores solicitados
				
				
					 
					 
				  
                                 }
                                 
                           System.out.println(opcion+"-----" +  ban1 +   ban2    + ban3);
				 nombrehotel.setText(opcion);
                                 date1.setText(fechainicial);
                                 date1.setEnabled(false);
                                 date2.setEnabled(false);
				 costofinal.setText(""+costovalor);
                               
                                 if(variable2==1){
                                  descuentotal.setText(""+valorDESC); 
				 
				}
                            
                            
                            
                            
			}
				
		}
		
	}

}




