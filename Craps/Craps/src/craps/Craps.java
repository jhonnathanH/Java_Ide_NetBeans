package craps;

/*
Realizado por:
Rafael Hernandez C.I. 21242608  
Frank Fung C.I. 20082306
 */
import javax.swing.*;

public class Craps {
public static void main(String[] args){ 
boolean gano,perdio;
int N;
int MontoA;
boolean seguirjugando = false;
// Inicio del Juego
int continuar = JOptionPane.showConfirmDialog(null, "Desea dar inicio al juego?", "Craps", JOptionPane.YES_NO_OPTION);
if (continuar == 0) {
// Solicita el nombre del jugador
String nomJugador =JOptionPane.showInputDialog(null, "Introduzca el nombre del jugador:","Craps",JOptionPane.QUESTION_MESSAGE);
// Si el nombre del jugador tiene al menos un carácter se procede a jugar
if (nomJugador != null && nomJugador.length() > 0 ) {
    // Solicitar el monto de la apuesta (JOptionPane)
    boolean validar= true ;
    try{
        String Montoapuesta =JOptionPane.showInputDialog(null, "Introduzca el  monto de la apuesta:","Craps",JOptionPane.QUESTION_MESSAGE);
        MontoA = Integer.parseInt(Montoapuesta);
        if (Montoapuesta != null && Montoapuesta.length() > 0 ){
        if (MontoA<=0){
        JOptionPane.showMessageDialog(null, "El numero de jugadas debe ser un numero entero positivo", "Craps", JOptionPane.PLAIN_MESSAGE); 
        }
    if (validar){
        validar=false;
            Dados inicio = new Dados(); // Lanzamiento Inicial
            String mensaje;
            mensaje = "Jugador: " + nomJugador + "\nLanzamiento Inicial -> Dado #1: " + inicio.d1 + " Dado #2: " + inicio.d2;
            JOptionPane.showMessageDialog(null, mensaje, "Craps", JOptionPane.PLAIN_MESSAGE);
            gano=inicio.Comparar711();
            perdio=inicio.Comparar2312();
            if (gano == true) {
                JOptionPane.showMessageDialog(null, "Usted gano el juego", "Craps", JOptionPane.PLAIN_MESSAGE); 
                }
            else if (perdio == true){
                JOptionPane.showMessageDialog(null, "Usted perdio el juego", "Craps", JOptionPane.PLAIN_MESSAGE);
                }
            else if (gano == false & perdio==false) {
                // Solicitar el número de jugadas a efectuar (JOptionPane)
                
                String Numerodejugadas =JOptionPane.showInputDialog(null, "Introduzca el  numero de jugadas:","Craps",JOptionPane.QUESTION_MESSAGE);
                if (Numerodejugadas!=null && Numerodejugadas.length()>0){
                N=Integer.parseInt(Numerodejugadas);
                // Generar vector de objetos dados
                    if (N>0 && N<101) {  
                        Dados jugadas[] = new Dados[N];
                        jugadas = inicio.generar(N);
                        for (int j=0; j<N;j++){
                            seguirjugando= inicio.Compara(jugadas[j]);
                            System.out.println(j + " " + jugadas[j].d1 + "  " + jugadas[j].d2);
                            String mensaje2="Jugador: " + nomJugador + "\nLanzamiento Inicial Numero:" + j+1 + "-> Dado #1: " + jugadas[j].d1 + " Dado #2: " + jugadas[j].d2; 
                            JOptionPane.showMessageDialog(null, mensaje2, "Craps", JOptionPane.PLAIN_MESSAGE);
                            // Evaluar las jugadas para determinar si el jugador ganó o no
                            if (seguirjugando ==true){
                                JOptionPane.showMessageDialog(null, "Usted gano el juego", "Craps", JOptionPane.PLAIN_MESSAGE);   
                                j=N;
                                }
                            else if((jugadas[j].d1+jugadas[j].d2)==7){
                                JOptionPane.showMessageDialog(null, "Usted perdio el juego", "Craps", JOptionPane.PLAIN_MESSAGE);   
                                j=N;
                                seguirjugando= true;
                                }
                            }    
                        if (seguirjugando == false){
                            JOptionPane.showMessageDialog(null, "Usted perdio el juego", "Craps", JOptionPane.PLAIN_MESSAGE);   
                            }
                        }
                else{
                    JOptionPane.showMessageDialog(null, "El numero de jugadas debe ser un numero entero positivo maximo de 100", "Craps", JOptionPane.PLAIN_MESSAGE);     
                    }
                    }
            else{
                JOptionPane.showMessageDialog(null, "Debe introducir el numero de jugadas", "Craps", JOptionPane.PLAIN_MESSAGE); 
                } 
                }

    }
    }
        else {
            JOptionPane.showMessageDialog(null, "Debe introducir el monto de la apuesta", "Craps", JOptionPane.PLAIN_MESSAGE);  
        }
        }
    catch(NumberFormatException e){
    JOptionPane.showMessageDialog(null, "Debe introducir la cantidad a apostar en un valor entero", "Craps", JOptionPane.PLAIN_MESSAGE);
}
    }
    else{
        JOptionPane.showMessageDialog(null, "Debe introducir el nombre del jugador", "Craps", JOptionPane.PLAIN_MESSAGE);
        }
}

else{
JOptionPane.showMessageDialog(null,"El juego se ha cancelado", "Craps", JOptionPane.INFORMATION_MESSAGE);
}
}
}