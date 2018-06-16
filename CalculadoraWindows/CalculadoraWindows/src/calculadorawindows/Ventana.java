



/*
Realizado por:
Rafael Hernandez C.I. 21242608  
Frank Fung C.I. 20082306 
 */
package calculadorawindows;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.JFrame;
public class Ventana  extends JFrame {
    private JPanel calculadora,pantalla,radiomemo,botones,botones1,botones2;
    private JTextField fila2;
    private JLabel fila1;
    private JRadioButton sexages,radianes,cent;
    private ButtonGroup gruporadio;
    private JButton mc,mr,ms,msuma,mresta;
    private JButton b11,b12,b13,b14,b15,b16,b17,b18,b19,b110;
    private JButton b21,b22,b23,b24,b25,b26,b27,b28,b29,b210;
    private JButton b31,b32,b33,b34,b35,b36,b37,b38,b39,b310;
    private JButton b41,b42,b43,b44,b45,b46,b47,b48,b49,b410;
    private JButton b51,b52,b53,b54,b55,b56,b57,b58;
    private JPanel conversor; 
    private JLabel l1,l2,l3;
    public JComboBox combo1,combo2,combo3;
    private JTextField tex1,tex2;
    public int ncombo2,ncombo3,ncombot,tamaño,b1;
    public double nro,nro2,aux,aux2,aux3,aux4,aux5;
    private String nrostr,nrostr2;
    private boolean b0=true,b2=false;
    private boolean funcion=false,xy=false;
    private double memoria,xybase;
    private String tipo[] ={"Ángulo", "Área", "Energía","Hora","Longitud","Peso/Masa","Potencia","Presión","Temperatura","Velocidad","Volumen"};  
    private String tipo1[]={"Gradián","Grado","Radián"};
    private double ntipo1[]={1,0.9,0.015707963267949};
    private String tipo2[]={"Acres","Centímetro cuadrado","Hectáreas","Kilómetro cuadrado","Metros cuadrados","Milímetro cuadrado","Milla cuadrada","Pies cuadrados","Pulgada cuadrada","Yarda cuadrada"};
    private double ntipo2[]={1,40468564.224,0.40468564224,0.0040468564224,4046.8564224,4046856422.4,0.0015625,43560,6272640,4840};
    private String tipo3[]={"Caloría","Electronvoltio","Julio","Kilocaloría","Kilojulio","Pie-Libra","Unidad térmica británica"};
    private double ntipo3[]={1,2.61319518892216e+19,4.1868,0.001,0.0041868,3.088025206594056,0.003968320164996};
    private String tipo4[]={"Día","Hora","Microsegundo","Milisegundo","Minuto","Segundo","Semana"};
    private double ntipo4[]={1,24,864e8,86400000,1440,86400,0.1428571428571429};
    private String tipo5[]={"Angstrom","Braza","Cadena","Centímetros","Extensión","Kilómetros","Nano","Metro","Micrones","Milímetros","Milla","Millas náuticas","Nanómetros","Pica","Pies","Pulgada","Rods","Vínculo","Yarda"};
    private double ntipo5[]={1,5.468066491688539e-11,4.970969537898672e-12,0.00000001,4.374453193350831e-10,0.0000000000001,9.84251968503937e-10,0.0000000001,0.0001,0.0000001,6.21371192237334e-14,5.399568034557235e-14,0.1,2.371063015836614e-8,3.280839895013123e-10,3.937007874015748e-9,1.988387815159469e-11,4.970969537898672e-10,1.093613298337708e-10};
    private String tipo6[]={"Centigramo","Decagramo","Decigramo","Gramo","Hectogramo","Kilogramo","Libra","Miligramo","Onza","Quilate","Stone","Tonelada corta","Tonelada larga","Tonelada métrica"};
    private double ntipo6[]={1,0.001,0.1,0.01,0.0001,0.00001,2.204622621848776e-5,10,3.527396194958041e-4,0.05,1.574730444177697e-6,1.102311310924388e-8,9.842065276110606e-9,0.00000001};
    private String tipo7[]={"BTU/minuto","Caballo","Kilovatio","Pie-Libra/minuto","Vatio"};
    private double ntipo7[]={1,0.0235808900293295,0.0175842666666667,778.1693709678747,17.58426666666667};
    private String tipo8[]={"Atmósfera","Bar","Kilopascal","Libra por pulgada cuadrada(PSI)","Milímetro de mercurio","Pascal"};
    private double ntipo8[]={1,1.01325,101.325,14.69594940039221,760.1275318829707,101325};
    private String tipo9[]={"Grados Celsius","Grados Fareheint","Kelvin"};
    private String tipo10[]={"Centímetro por segundo","Kilometro por hora","Mach(a atm estándar)","Metros por segundo","Millas por hora","Nudos","Pies por segundo"};
    private double ntipo10[]={1,0.036,2.938641460175678e-5,0.01,0.022369362920544,0.019438444924406,0.0328083989501312};
    private String tipo11[]={"Centímetro cúbico","Cuarto de galón (EE.UU.)","Cuarto de galón (R.U.)","Galón (EE.UU.)","Galón (R.U.)","Litro","Metro cúbico","Onza líquida (EE.UU.)","Onza líquida (R.U.)","Pies Cúbicos","Pinta (EE.UU.)","Pinta (R.U.)","Pulgada cúbica","Yarda cúbica"};
    private double ntipo11[]={1,0.0010566882094326,8.798769931963512e-4,2.641720523581484e-4,2.199692482990878e-4,0.001,0.000001,0.033814022701843,0.035195079727854,3.531466672148859e-5,0.0021133764188652,0.0017597539863927,0.0610237440947323,1.307950619314392e-6};
    
    
    public Ventana(){
     
     
    super("Calculadora Windows");

    Container contenedor = getContentPane();
    contenedor.setLayout(new GridLayout(1,2,10,10));
    this.setResizable(false);
    calculadora=new JPanel(new FlowLayout());
    calculadora.setBorder(BorderFactory.createLineBorder (Color.BLACK, 1));
    calculadora.setPreferredSize(new Dimension(420,350));
    
   
    pantalla =new JPanel(new GridLayout(2,1));
    fila1=new JLabel("");
    fila1.setHorizontalAlignment(SwingConstants.RIGHT);
    fila1.setPreferredSize(new Dimension(380,30));
   
    fila2=new JTextField("0");
    fila2.setHorizontalAlignment(SwingConstants.RIGHT);
    fila2.setPreferredSize(new Dimension(380,30));
    nrostr="0";
    nro=Double.parseDouble(nrostr);
    pantalla.add(fila1);
    pantalla.add(fila2);
    calculadora.add(pantalla);
    
    
    radiomemo =new JPanel(new FlowLayout());
    radiomemo.setPreferredSize(new Dimension(380,40));
    sexages=new JRadioButton ("Sexages.",true);
    sexages.setPreferredSize(new Dimension(65,35));
    sexages.setMargin(new java.awt.Insets(1, 1, 1, 1));
    sexages.setFont(new Font("sansserif", Font.BOLD, 8));
    radianes=new JRadioButton ("Radianes.",false);
    radianes.setPreferredSize(new Dimension(65,35));
    radianes.setMargin(new java.awt.Insets(1, 1, 1, 1));
    radianes.setFont(new Font("sansserif", Font.BOLD, 8));
    cent=new JRadioButton("Cent.",false);
    cent.setPreferredSize(new Dimension(40,35));
    cent.setMargin(new java.awt.Insets(1, 1, 1, 1));
    cent.setFont(new Font("sansserif", Font.BOLD, 8));
    gruporadio=new ButtonGroup();
    gruporadio.add(sexages);
    gruporadio.add(radianes);
    gruporadio.add(cent);
    radiomemo.add(sexages);
    radiomemo.add(radianes);
    radiomemo.add(cent);
    mc=new JButton("MC");
    mc.setPreferredSize(new Dimension(33,35));
    mc.setMargin(new java.awt.Insets(1, 1, 1, 1));
    mc.setFont(new Font("sansserif", Font.BOLD, 9));
    radiomemo.add(mc);
    mr=new JButton("MR");
    mr.setPreferredSize(new Dimension(33,35));
    mr.setMargin(new java.awt.Insets(1, 1, 1, 1));
    mr.setFont(new Font("sansserif", Font.BOLD, 9));
    radiomemo.add(mr);
    ms=new JButton("MS");
    ms.setPreferredSize(new Dimension(33,35));
    ms.setMargin(new java.awt.Insets(1, 1, 1, 1));
    ms.setFont(new Font("sansserif", Font.BOLD, 9));
    radiomemo.add(ms);
    msuma=new JButton("M+");
    msuma.setPreferredSize(new Dimension(33,35));
    msuma.setMargin(new java.awt.Insets(1, 1, 1, 1));
    msuma.setFont(new Font("sansserif", Font.BOLD, 9));
    radiomemo.add(msuma);
    mresta=new JButton("M-");
    mresta.setPreferredSize(new Dimension(33,35));
    mresta.setMargin(new java.awt.Insets(1, 1, 1, 1));
    mresta.setFont(new Font("sansserif", Font.BOLD, 9));
    radiomemo.add(mresta);
    calculadora.add(radiomemo);
    

    
    
    botones =new JPanel(new GridLayout(3,10,5,5));
    botones.setPreferredSize(new Dimension(380,120));
   
    b11=new JButton("");
    b11.setPreferredSize(new Dimension(33,35));
    botones.add(b11);
    
    b12=new JButton("Inv");
    b12.setPreferredSize(new Dimension(33,35));
    b12.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b12.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b12);
    
    b13=new JButton("ln");
    b13.setPreferredSize(new Dimension(33,35));
    b13.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b13.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b13);
    
    b14=new JButton("(");
    b14.setPreferredSize(new Dimension(33,35));
    b14.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b14.setFont(new Font("sansserif", Font.BOLD, 10));
    b14.setEnabled(false);
    botones.add(b14);
   
    b15=new JButton(")");
    b15.setPreferredSize(new Dimension(33,35));
    b15.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b15.setFont(new Font("sansserif", Font.BOLD, 10));
    b15.setEnabled(false);
    botones.add(b15);
    
    b16=new JButton("←");
    b16.setPreferredSize(new Dimension(33,35));
    b16.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b16.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b16);
    
    b17=new JButton("CE");
    b17.setPreferredSize(new Dimension(33,35));
    b17.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b17.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b17);
    
    b18=new JButton("C");
    b18.setPreferredSize(new Dimension(33,35));
    b18.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b18.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b18);
    
    b19=new JButton("±");
    b19.setPreferredSize(new Dimension(33,35));
    b19.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b19.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b19);
    
    b110=new JButton("√");
    b110.setPreferredSize(new Dimension(33,35));
    b110.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b110.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b110);
    
    b21=new JButton("Int");
    b21.setPreferredSize(new Dimension(33,35));
    b21.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b21.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b21);
    
    b22=new JButton("sinh");
    b22.setPreferredSize(new Dimension(33,35));
    b22.setMargin(new java.awt.Insets(1, 1, 1, 1));
    b22.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b22);
    
    b23=new JButton("sin");
    b23.setPreferredSize(new Dimension(33,35));
    b23.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b23.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b23);
    
    b24=new JButton("x˄2");
    b24.setPreferredSize(new Dimension(33,35));
    b24.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b24.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b24);
    
    b25=new JButton("n!");
    b25.setPreferredSize(new Dimension(33,35));
    b25.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b25.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b25);
    
    b26=new JButton("7");
    b26.setPreferredSize(new Dimension(33,35));
    b26.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b26.setFont(new Font("sansserif", Font.BOLD, 15));
    botones.add(b26);
    
    b27=new JButton("8");
    b27.setPreferredSize(new Dimension(33,35));
    b27.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b27.setFont(new Font("sansserif", Font.BOLD, 15));
    botones.add(b27);
    
    b28=new JButton("9");
    b28.setPreferredSize(new Dimension(33,35));
    b28.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b28.setFont(new Font("sansserif", Font.BOLD, 15));
    botones.add(b28);
    
    b29=new JButton("/");
    b29.setPreferredSize(new Dimension(33,35));
    b29.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b29.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b29);
    
    b210=new JButton("%");
    b210.setPreferredSize(new Dimension(33,35));
    b210.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b210.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b210);
    
    b31=new JButton("dms");
    b31.setPreferredSize(new Dimension(33,35));
    b31.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b31.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b31);
    
    b32=new JButton("cosh");
    b32.setPreferredSize(new Dimension(33,35));
    b32.setMargin(new java.awt.Insets(1, 1, 1, 1));
    b32.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b32);
    
    b33=new JButton("cos");
    b33.setPreferredSize(new Dimension(33,35));
    b33.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b33.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b33);
    
    b34=new JButton("x˄y");
    b34.setPreferredSize(new Dimension(33,35));
    b34.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b34.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b34);
    
    b35=new JButton("y√x");
    b35.setPreferredSize(new Dimension(33,35));
    b35.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b35.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b35);
    
    b36=new JButton("4");
    b36.setPreferredSize(new Dimension(33,35));
    b36.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b36.setFont(new Font("sansserif", Font.BOLD, 15));
    botones.add(b36);
    
    b37=new JButton("5");
    b37.setPreferredSize(new Dimension(33,35));
    b37.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b37.setFont(new Font("sansserif", Font.BOLD, 15));
    botones.add(b37);
    
    b38=new JButton("6");
    b38.setPreferredSize(new Dimension(33,35));
    b38.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b38.setFont(new Font("sansserif", Font.BOLD, 15));
    botones.add(b38);
    
    b39=new JButton("*");
    b39.setPreferredSize(new Dimension(33,35));
    b39.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b39.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b39);
    
    b310=new JButton("1/x");
    b310.setPreferredSize(new Dimension(33,35));
    b310.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b310.setFont(new Font("sansserif", Font.BOLD, 10));
    botones.add(b310);
    
    botones1 =new JPanel(new BorderLayout());
    botones1.setPreferredSize(new Dimension(380,80));

    botones2=new JPanel(new FlowLayout());
    
    b41=new JButton("π");
    b41.setPreferredSize(new Dimension(33,35));
    b41.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b41.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b41);
    
    b42=new JButton("tanh");
    b42.setPreferredSize(new Dimension(33,35));
    b42.setMargin(new java.awt.Insets(1, 1, 1, 1));
    b42.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b42);
    
    b43=new JButton("tan");
    b43.setPreferredSize(new Dimension(33,35));
    b43.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b43.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b43);
    
    b44=new JButton("x˄3");
    b44.setPreferredSize(new Dimension(33,35));
    b44.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b44.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b44);
    
    b45=new JButton("3√x");
    b45.setPreferredSize(new Dimension(33,35));
    b45.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b45.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b45);
    
    b46=new JButton("1");
    b46.setPreferredSize(new Dimension(33,35));
    b46.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b46.setFont(new Font("sansserif", Font.BOLD, 15));
    botones2.add(b46);
    
    b47=new JButton("2");
    b47.setPreferredSize(new Dimension(33,35));
    b47.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b47.setFont(new Font("sansserif", Font.BOLD, 15));
    botones2.add(b47);
    
    b48=new JButton("3");
    b48.setPreferredSize(new Dimension(33,35));
    b48.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b48.setFont(new Font("sansserif", Font.BOLD, 15));
    botones2.add(b48);
    
    b49=new JButton("-");
    b49.setPreferredSize(new Dimension(33,35));
    b49.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b49.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b49);
    
    b410=new JButton("=");
    b410.setPreferredSize(new Dimension(33,70));
    b410.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b410.setFont(new Font("sansserif", Font.BOLD, 15));
    botones1.add(b410,BorderLayout.EAST);
    
    b51=new JButton("F-E");
    b51.setPreferredSize(new Dimension(33,35));
    b51.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b51.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b51);
    
    b52=new JButton("Exp");
    b52.setPreferredSize(new Dimension(33,35));
    b52.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b52.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b52);
    
    b53=new JButton("Mod");
    b53.setPreferredSize(new Dimension(33,35));
    b53.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b53.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b53);
    
    b54=new JButton("log");
    b54.setPreferredSize(new Dimension(33,35));
    b54.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b54.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b54);
    
    b55=new JButton("10˄x");
    b55.setPreferredSize(new Dimension(33,35));
    b55.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b55.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b55);
    
    b56=new JButton("0");
    b56.setPreferredSize(new Dimension(71,35));
    b56.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b56.setFont(new Font("sansserif", Font.BOLD, 15));
    botones2.add(b56);
    
    
    b57=new JButton(",");
    b57.setPreferredSize(new Dimension(33,35));
    b57.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b57.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b57);
    
    b58=new JButton("+");
    b58.setPreferredSize(new Dimension(33,35));
    b58.setMargin(new java.awt.Insets(3, 3, 3, 3));
    b58.setFont(new Font("sansserif", Font.BOLD, 10));
    botones2.add(b58);
    
    botones1.add(botones2,BorderLayout.CENTER);
    calculadora.add(botones);
    calculadora.add(botones1);
    contenedor.add(calculadora);
  
    conversor=new JPanel(new FlowLayout());
    conversor.setBorder(BorderFactory.createLineBorder (Color.BLUE, 1));
    l1=new JLabel("Seleccionar el tipo de unidad que desea convertir");
    l1.setPreferredSize(new Dimension(350,40));
    conversor.add(l1);
    combo1 = new JComboBox(tipo);
    combo1.setMaximumRowCount(11);
    combo1.setPreferredSize(new Dimension(350,20));
    conversor.add(combo1);
    l2=new JLabel ("De");
    l2.setPreferredSize(new Dimension(350,40));
    conversor.add(l2);
    tex1 = new JTextField();
    tex1.setPreferredSize(new Dimension(350,20));
    conversor.add(tex1);
    combo2 = new JComboBox(tipo1);
    combo2.setPreferredSize(new Dimension(350,20));
    conversor.add(combo2);
    l3=new JLabel ("A");
    l3.setPreferredSize(new Dimension(350,40));
    conversor.add(l3);
    tex2=new JTextField();
    tex2.setPreferredSize(new Dimension(350,20));
    conversor.add(tex2);
    combo3 = new JComboBox(tipo1);
    combo3.setPreferredSize(new Dimension(350,20));
    conversor.add(combo3);
    contenedor.add(conversor);
    
    ControlTecla ctrlTecla = new ControlTecla();
    tex1.addKeyListener(ctrlTecla);
    ControlTecla2 ctrlTecla2 = new ControlTecla2();
    fila2.addKeyListener(ctrlTecla2);
   
    ManejadorComboBox ctrlComboBox = new ManejadorComboBox();
    combo1.addItemListener(ctrlComboBox);
    
    ManejadorRadioButton radio = new ManejadorRadioButton();
    sexages.addItemListener(radio);
    radianes.addItemListener(radio);
    cent.addItemListener(radio);
    
    ManejadorAcciones manejador = new ManejadorAcciones(); 
    b13.addActionListener( manejador );
     b12.addActionListener( manejador );
    b17.addActionListener( manejador );
    b18.addActionListener( manejador );
    b19.addActionListener( manejador );
    b21.addActionListener( manejador );
    b22.addActionListener( manejador );
    b23.addActionListener( manejador );
    b26.addActionListener( manejador );
    b27.addActionListener( manejador );
    b28.addActionListener( manejador );
    b29.addActionListener( manejador );
    b31.addActionListener( manejador );
    b32.addActionListener( manejador );
    b33.addActionListener(manejador);
    b36.addActionListener( manejador );
    b37.addActionListener( manejador );
    b38.addActionListener( manejador );
    b39.addActionListener( manejador );
    b310.addActionListener( manejador );
    b42.addActionListener( manejador );
    b43.addActionListener( manejador );
    b46.addActionListener( manejador );
    b47.addActionListener( manejador );
    b48.addActionListener( manejador );
    b49.addActionListener( manejador );
    b54.addActionListener( manejador );
    b56.addActionListener( manejador );
    b58.addActionListener( manejador );
    b410.addActionListener( manejador );
    b110.addActionListener( manejador );
    b41.addActionListener(manejador);
    b57.addActionListener(manejador);
    msuma.addActionListener(manejador);
    mresta.addActionListener(manejador);
    ms.addActionListener(manejador);
    mr.addActionListener(manejador);
    mc.addActionListener(manejador);
    b16.addActionListener(manejador);
    b24.addActionListener(manejador);
    b44.addActionListener(manejador);
    b45.addActionListener(manejador);
    b55.addActionListener(manejador);
    b34.addActionListener(manejador);
    setSize(800,355);
    setVisible( true );
    nrostr2="";
      b1=0;
      aux=1;
      aux4=0;
    }  
    

private class ManejadorAcciones implements ActionListener { // Inicio ManejadorBotones
public void actionPerformed ( ActionEvent a) { 
    
    
    /* Boton x^y */
    if (a.getSource()==b34 ){
        xy=true;
        xybase=Double.parseDouble(fila2.getText());
        fila1.setText(nrostr2 +fila2.getText()+ "^");
        b0=true;
        funcion=true;
        b2=false;
    }
    
    /* Boton 10^x */
    if (a.getSource()==b55 ){
        nro=Math.pow(10,Double.parseDouble(fila2.getText()));
        fila1.setText(nrostr2+ "10^" +fila2.getText());
        fila2.setText(String.valueOf(nro));
        b0=true;
        funcion=true;
        b2=false;
    }
    /* Boton +-*/
    if (a.getSource()==b19 ){
       aux3=Double.parseDouble(fila2.getText());
       if (aux3 > 0)
           fila2.setText(String.valueOf(-aux3));
       if (aux3 < 0)
           fila2.setText(String.valueOf(-aux3));
    }
    /*Boton Inv ¨*/
     if (a.getSource()==b12 ){
      if (aux4==0){
          b23.setText("sin-1");
          b23.setFont(new Font("sansserif", Font.BOLD, 8));
          b33.setText("cos-1");
          b33.setFont(new Font("sansserif", Font.BOLD, 8));
          b43.setText("tan-1");
          b43.setFont(new Font("sansserif", Font.BOLD, 8));
          b22.setText("sinh-1");
          b22.setFont(new Font("sansserif", Font.BOLD, 8));
          b32.setText("cosh-1");
          b32.setFont(new Font("sansserif", Font.BOLD, 8));
          b42.setText("tanh-1");
          b42.setFont(new Font("sansserif", Font.BOLD, 8));
          b13.setText("e^x");
          b41.setText("2π");
          b21.setText("Frac");
          b21.setFont(new Font("sansserif", Font.BOLD, 9));
          b31.setText("deg");
                  }
      if (aux4==1){
          b23.setText("sin");
           b23.setFont(new Font("sansserif", Font.BOLD, 10));
          b33.setText("cos");
           b33.setFont(new Font("sansserif", Font.BOLD, 10));
          b43.setText("tan");
           b43.setFont(new Font("sansserif", Font.BOLD, 10));
          b22.setText("sinh");
           b22.setFont(new Font("sansserif", Font.BOLD, 10));
          b32.setText("cosh");
           b32.setFont(new Font("sansserif", Font.BOLD, 10));
          b42.setText("tanh");
           b42.setFont(new Font("sansserif", Font.BOLD, 10));
         b13.setText("ln");
         b41.setText("π");
          b21.setText("Int");
           b21.setFont(new Font("sansserif", Font.BOLD, 10));
          b31.setText("dms");
                  }
      if (aux4==0){
          aux4=1;
          
      }
      else{
          aux4=0;
      }
    }
    /* Boton M+*/
    if (a.getSource()== msuma){
        memoria+=Double.parseDouble(fila2.getText());
    }
    /* Boton M-*/
    if (a.getSource()== mresta){
        memoria-=Double.parseDouble(fila2.getText());
    }
    /* Boton MC*/
    if (a.getSource()== mc){
        memoria=0;
    }
    /* Boton MR*/
    if (a.getSource()== mr){
        fila2.setText(String.valueOf(memoria));
    }
    /* Boton MS*/
    if (a.getSource()== ms){
        memoria=Double.parseDouble(fila2.getText());
    }
    /* Boton ← */
    if (a.getSource()== b16){
        if(fila2.getText().length()>0){
        fila2.setText(fila2.getText().substring(0,fila2.getText().length()-1));
        if(fila2.getText().length()==0)
            fila2.setText("0");
        }
        else{
        fila2.setText("0");}
    }
      /* Boton 0*/
    if (a.getSource()== b56){  
        
    if (b0==true){
      fila2.setText("0");
      b0=false;
      }   
      else if (b0==false){      
    nrostr=fila2.getText()+ "0";
    nro=Double.parseDouble(nrostr);
    fila2.setText(nrostr);
      }
    b2=false;
}
      /* Boton 1*/
     if (a.getSource()==b46){
    
      if (b0==true){
      fila2.setText("1");
      b0=false;
      }   
      else if (b0==false){     
    nrostr=fila2.getText()+ "1";
    nro=Double.parseDouble(nrostr);
    fila2.setText(nrostr);
    }
   b2=false;
}
       /* Boton 2*/
   if (a.getSource()==b47){
      if (b0==true){
      fila2.setText("2");
      b0=false;
      }   
      else if (b0==false){
    nrostr=fila2.getText()+ "2";
    nro=Double.parseDouble(nrostr);
    fila2.setText(nrostr);
      }
      b2=false;
}
     /* Boton 3*/
    if (a.getSource()==b48){
      if (b0==true){
      fila2.setText("3");
      b0=false;
      }   
      else if (b0==false){         
    nrostr=fila2.getText()+ "3";
    nro=Double.parseDouble(nrostr);
    fila2.setText(nrostr);
      }
      b2=false;
}
      /* Boton 4*/
      if (a.getSource()==b36){
       if (b0==true){
      fila2.setText("4");
      b0=false;
      }   
      else if (b0==false){        
    nrostr=fila2.getText()+ "4";
    nro=Double.parseDouble(nrostr);
    fila2.setText(nrostr);
      }
       b2=false;
}
        /* Boton 5*/
        if (a.getSource()==b37){
        if (b0==true){
      fila2.setText("5");
      b0=false;
      }   
      else if (b0==false){       
    nrostr=fila2.getText()+ "5";
    nro=Double.parseDouble(nrostr);
    fila2.setText(nrostr);
      }
        b2=false;
}
          /* Boton 6*/
          if (a.getSource()==b38){
        if (b0==true){
      fila2.setText("6");
      b0=false;
      }   
      else if (b0==false){       
    nrostr=fila2.getText()+ "6";
    nro=Double.parseDouble(nrostr);
    fila2.setText(nrostr);
      }
        b2=false;
}
            /* Boton 7*/
     if (a.getSource()==b26){
        if (b0==true){
      fila2.setText("7");
      b0=false;
      }   
      else if (b0==false){       
    nrostr=fila2.getText()+ "7";
    nro=Double.parseDouble(nrostr);
    fila2.setText(nrostr);
      }
        b2=false;
     }
       /* Boton 8*/
      if (a.getSource()==b27){
               if (b0==true){
      fila2.setText("8");
      b0=false;
      }   
      else if (b0==false){
    nrostr=fila2.getText()+ "8";
    nro=Double.parseDouble(nrostr);
    fila2.setText(nrostr);
      }
               b2=false;
      }
        /* Boton 9*/
       if (a.getSource()==b28){
           if (funcion==true){
           fila1.setText("");
           fila2.setText("9");
           
           }
               if (b0==true){
      fila2.setText("9");
      b0=false;
      }   
      else if (b0==false){
    nrostr=fila2.getText()+ "9";
    nro=Double.parseDouble(nrostr);
    fila2.setText(nrostr);
      }
               b2=false;
    }
       /* Boton CE*/
      if (a.getSource()==b17){
       nrostr="0";
       nro=Double.parseDouble(nrostr);
       fila2.setText(nrostr);
       b0=true;
        } 
       /* Boton C*/
      if (a.getSource()==b18){
       nrostr="0";
       nro=Double.parseDouble(nrostr);
       fila2.setText(nrostr);
       nrostr2="";
       nro2=Double.parseDouble(nrostr);
       fila1.setText("");
       b1=0;
       b0=true;
       b2=false;
       funcion=false;
       prendererror();
        } 
        /* Boton +*/
       if (a.getSource()==b58){
           
           if (b0==true && b2==true){
           fila1.setText(fila1.getText().substring(0,fila1.getText().length()-3)+" + ");
           aux2=1;
           }
           else if (b1==0){                
               if (funcion==true){
                   if (xy==true){
                       nro2=Math.pow(xybase,Double.parseDouble(fila2.getText()));
                       nrostr=fila1.getText()+fila2.getText();
                       fila2.setText(String.valueOf(nro2));
                       xy=false;
                   }
                   else{
                    nrostr=fila1.getText();
                    nro2=Double.parseDouble(fila2.getText());}
                   funcion=false;
               }
               else{
                nrostr=fila2.getText(); 
                nro2=Double.parseDouble(nrostr);
               }
               b1=1;               
                nrostr2=nrostr + " + ";
                nrostr="0";
                nro=0;
                fila1.setText(nrostr2);
                aux2=1;
           }
          
           else{
               
               nrostr=fila2.getText();
               nro=Double.parseDouble(nrostr);
               
               nrostr2= nrostr2 + nrostr + " + " ;
               fila1.setText(nrostr2);
                if (aux2 == 1){
               nro2=nro2+nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 2){
               nro2=nro2-nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 3){
               nro2=nro2*nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 4){
               if (nro != 0){
               nro2=nro2/nro;
                fila2.setText(String.valueOf(nro2));
               aux2=4;
               }
               else {
               nro=0;
               nro2=0;
               fila2.setText("No se puede dividir entre cero");
               apagarerror();
               }  
           }
           aux2=1; 
        } 
           b0=true;
           b2=true;
        }
         /* Boton -*/
       if (a.getSource()==b49){
           if (b0==true && b2==true){
           fila1.setText(fila1.getText().substring(0,fila1.getText().length()-3)+" - ");
           aux2=2;
           }
          else if (b1==0){
     if (funcion==true){
               nrostr=fila1.getText();
               nro2=Double.parseDouble(fila2.getText());
               }
               else{
                nrostr=fila2.getText(); 
                nro2=Double.parseDouble(nrostr);
               }
               b1=1;               
                nrostr2=nrostr + " - ";
                nrostr="0";
                nro=0;
                fila1.setText(nrostr2);
                aux2=2;
           }
           else{
               nrostr=fila2.getText();
               nro=Double.parseDouble(nrostr);
               
               nrostr2= nrostr2  +  nrostr + " - ";
               fila1.setText(nrostr2);
                if (aux2 == 1){
               nro2=nro2+nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 2){
               nro2=nro2-nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 3){
               nro2=nro2*nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 4){
               if (nro != 0){
               nro2=nro2/nro;
                fila2.setText(String.valueOf(nro2));
               aux2=4;
               }
               else {
               nro=0;
               nro2=0;
               fila2.setText("No se puede dividir entre cero");
               apagarerror();
               }  
           }
           aux2=2; 
        } 
           b0=true;
           b2=true;
        }
       /* Boton * */
        if (a.getSource()==b39){
             if (b0==true && b2==true){
           fila1.setText(fila1.getText().substring(0,fila1.getText().length()-3)+" * ");
           aux2=3;
           }
             else if (b1==0){
      if (funcion==true){
               nrostr=fila1.getText();
               nro2=Double.parseDouble(fila2.getText());
               }
               else{
                nrostr=fila2.getText(); 
                nro2=Double.parseDouble(nrostr);
               }
               b1=1;               
                nrostr2=nrostr + " * ";
                nrostr="0";
                nro=0;
                fila1.setText(nrostr2);
                aux2=3;
           }
           else{
               nrostr=fila2.getText();
               nro=Double.parseDouble(nrostr);
             
               nrostr2= nrostr2  +  nrostr + " * " ;
               fila1.setText(nrostr2);
                if (aux2 == 1){
               nro2=nro2+nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 2){
               nro2=nro2-nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 3){
               nro2=nro2*nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 4){
               if (nro != 0){
               nro2=nro2/nro;
                fila2.setText(String.valueOf(nro2));
               aux2=4;
               }
               else {
               nro=0;
               nro2=0;
               fila2.setText("No se puede dividir entre cero");
               apagarerror();
               }
               aux2=3;
               
           }
        } 
           b0=true;
           b2=true;
        }
         /* Boton / */
        if (a.getSource()==b29){
            if (b0==true && b2==true){
           fila1.setText(fila1.getText().substring(0,fila1.getText().length()-3)+" / ");
           aux2=4;
           }
            else if (b1==0){
      if (funcion==true){
               nrostr=fila1.getText();
               nro2=Double.parseDouble(fila2.getText());
               }
               else{
                nrostr=fila2.getText(); 
                nro2=Double.parseDouble(nrostr);
               }
               b1=1;               
                nrostr2=nrostr + " / ";
                nrostr="0";
                nro=0;
                fila1.setText(nrostr2);
                aux2=4;
           }
           else{
               nrostr=fila2.getText();
               nro=Double.parseDouble(nrostr);
               nrostr2= nrostr2  +  nrostr + " / " ;
               fila1.setText(nrostr2);
               if (aux2 == 1){
               nro2=nro2+nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 2){
               nro2=nro2-nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 3){
               nro2=nro2*nro;
                fila2.setText(String.valueOf(nro2));}
               if (aux2 == 4){
               if (nro != 0){
               nro2=nro2/nro;
                fila2.setText(String.valueOf(nro2));
               aux2=4;
               }
               else {
               nro=0;
               nro2=0;
               fila2.setText("No se puede dividir entre cero");
               apagarerror();
               }  
           }
           aux2=4; 
        } 
            b0=true;
            b2=true;
        }
         /* Boton = */
         if (a.getSource()==b410){
             
            
                nrostr=fila2.getText();
               nro=Double.parseDouble(nrostr);
               
                if (aux2 == 1){
               nro2=nro2+nro;
                fila2.setText(String.valueOf(nro2));
               }
               if (aux2 == 2){
               nro2=nro2-nro;
                fila2.setText(String.valueOf(nro2));
              }
               if (aux2 == 3){
               nro2=nro2*nro;
                fila2.setText(String.valueOf(nro2));
               }
               if (aux2 == 4){
               if (nro != 0){
               nro2=nro2/nro;
                fila2.setText(String.valueOf(nro2));
               aux2=4;
               }
               else {
               
               fila2.setText("No se puede dividir entre cero");
               }
         }

               fila1.setText("");
               nro=0;
               nro2=0;
               b1=0;
               b0=true;
               b2=false;
               nrostr2="";
               funcion=false;             
         }
        
        /* Boton , */
          if (a.getSource()==b57){
              try{
             Integer.parseInt(fila2.getText());
            nrostr=fila2.getText()+ ".";
            nro=Double.parseDouble(nrostr);
            fila2.setText(nrostr); 
            b0=false;
              }
              catch(NumberFormatException e){
                  
              }
              b2=false;
          }
         
         
         /* Boton √ */
         
          if (a.getSource()==b110){
              
          aux3=Double.parseDouble(fila2.getText());
          fila1.setText(nrostr2+ "sqrt(" +fila2.getText()+ ")");
          if (aux3 >= 0){
          nro=Math.sqrt(Double.parseDouble(fila2.getText()));
          fila2.setText(String.valueOf(nro));

          }
          else {
            nro=0;
            nro2=0;
            fila2.setText("Entrada no valida");
            apagarerror();  
          }
          b0=true;
          funcion=true;
          b2=false;
          }
          /* Boton 3√x */
           if (a.getSource()==b45){
          nro=Math.cbrt(Double.parseDouble(fila2.getText()));
          fila1.setText(nrostr2+ "3√" +fila2.getText());
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
          
           }
          
          /* Boton x^2 */
          if (a.getSource()==b24){
          nro=Double.parseDouble(fila2.getText())*Double.parseDouble(fila2.getText());
          fila1.setText(nrostr2 +fila2.getText()+"^2 ");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
          
          
          }
          /* Boton Int */
          if (a.getSource()==b21){
              if (aux4==0){
          nro=Math.floor(Double.parseDouble(fila2.getText()));
          fila1.setText(nrostr2 + "Int(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
              }
              /* Boton Fracc */
              else{      
          nro=Double.parseDouble(fila2.getText());        
          aux5=Math.floor(Double.parseDouble(fila2.getText()));
          nro=nro-aux5;
          fila1.setText(nrostr2 + "frac("+ fila2.getText()+")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;  
           b23.setText("sin");
           b23.setFont(new Font("sansserif", Font.BOLD, 10));
          b33.setText("cos");
           b33.setFont(new Font("sansserif", Font.BOLD, 10));
          b43.setText("tan");
           b43.setFont(new Font("sansserif", Font.BOLD, 10));
          b22.setText("sinh");
           b22.setFont(new Font("sansserif", Font.BOLD, 10));
          b32.setText("cosh");
           b32.setFont(new Font("sansserif", Font.BOLD, 10));
          b42.setText("tanh");
           b42.setFont(new Font("sansserif", Font.BOLD, 10));
         b13.setText("ln");
         b41.setText("π");
          b21.setText("Int");
           b21.setFont(new Font("sansserif", Font.BOLD, 10));
          b31.setText("dms");
          aux4=0;
              }
                 
          }
          /* Boton x^3 */
          if (a.getSource()==b44){
          nro=Double.parseDouble(fila2.getText())*Double.parseDouble(fila2.getText())*Double.parseDouble(fila2.getText());
          fila1.setText(nrostr2 +fila2.getText()+"^3 ");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
   
          }        
          /* Boton π */
          if (a.getSource()==b41){
              /* Boton π */
              if(aux==0){
          fila2.setText(String.valueOf(Math.PI));
          b2=false;
              }
          /* Boton 2π */
              else{
          fila2.setText(String.valueOf(2*Math.PI));
          b2=false; 
           b23.setText("sin");
           b23.setFont(new Font("sansserif", Font.BOLD, 10));
          b33.setText("cos");
           b33.setFont(new Font("sansserif", Font.BOLD, 10));
          b43.setText("tan");
           b43.setFont(new Font("sansserif", Font.BOLD, 10));
          b22.setText("sinh");
           b22.setFont(new Font("sansserif", Font.BOLD, 10));
          b32.setText("cosh");
           b32.setFont(new Font("sansserif", Font.BOLD, 10));
          b42.setText("tanh");
           b42.setFont(new Font("sansserif", Font.BOLD, 10));
         b13.setText("ln");
         b41.setText("π");
          b21.setText("Int");
           b21.setFont(new Font("sansserif", Font.BOLD, 10));
          b31.setText("dms");
          aux4=0;
              }
          }
        /* Boton sen */
        
        if (a.getSource()==b23){
            if (aux4==0){
          if (aux==1){      
          nro=Math.sin(Math.toRadians(Double.parseDouble(fila2.getText())));
          }
          if (aux==2){      
          nro=Math.sin(Double.parseDouble(fila2.getText()));
          }
          if (aux==3){      
          nro=Math.sin(Math.PI*Double.parseDouble(fila2.getText())/200);
          }
          fila1.setText(nrostr2+ "sen(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
            }
            /* Boton sen-1 */
            else{
            aux5=Double.parseDouble(fila2.getText());
            if ((aux5 <= 1) && (aux5 >= -1) ){
           if (aux==1){      
          nro=Math.asin(Double.parseDouble(fila2.getText()))*180/Math.PI;
          }
          if (aux==2){      
          nro=Math.asin(Double.parseDouble(fila2.getText()));
          }
          if (aux==3){      
          nro=Math.asin(Double.parseDouble(fila2.getText()))*200/Math.PI;
          }
          fila1.setText(nrostr2+ "sen-1(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
            }
          else{
             nro=0;
            nro2=0;
            fila2.setText("Entrada no valida");
            apagarerror(); 
        }
            b23.setText("sin");
           b23.setFont(new Font("sansserif", Font.BOLD, 10));
          b33.setText("cos");
           b33.setFont(new Font("sansserif", Font.BOLD, 10));
          b43.setText("tan");
           b43.setFont(new Font("sansserif", Font.BOLD, 10));
          b22.setText("sinh");
           b22.setFont(new Font("sansserif", Font.BOLD, 10));
          b32.setText("cosh");
           b32.setFont(new Font("sansserif", Font.BOLD, 10));
          b42.setText("tanh");
           b42.setFont(new Font("sansserif", Font.BOLD, 10));
         b13.setText("ln");
         b41.setText("π");
          b21.setText("Int");
           b21.setFont(new Font("sansserif", Font.BOLD, 10));
          b31.setText("dms");
          aux4=0;
            }
          }



       
        /* Boton cos */
        if (a.getSource()==b33){
          if (aux4==0){
          if (aux==1){      
          nro=Math.cos(Math.PI/180*Double.parseDouble(fila2.getText()));
          }
          if (aux==2){      
          nro=Math.cos(Double.parseDouble(fila2.getText()));
          }
          if (aux==3){      
          nro=Math.cos(Math.PI*Double.parseDouble(fila2.getText())/200);
          }
          fila1.setText(nrostr2+ "cos(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;    
          }
        /* Boton cos-1 */
        else{
            aux5=Double.parseDouble(fila2.getText());
            if ((aux5 <= 1) && (aux5 >= -1) ){
           if (aux==1){      
          nro=Math.acos(Double.parseDouble(fila2.getText()))*180/Math.PI;
          }
          if (aux==2){      
          nro=Math.acos(Double.parseDouble(fila2.getText()));
          }
          if (aux==3){      
          nro=Math.acos(Double.parseDouble(fila2.getText()))*200/Math.PI;
          }
          fila1.setText(nrostr2+ "cos-1(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
            }
          else{
             nro=0;
            nro2=0;
            fila2.setText("Entrada no valida");
            apagarerror(); 
        }
            b23.setText("sin");
           b23.setFont(new Font("sansserif", Font.BOLD, 10));
          b33.setText("cos");
           b33.setFont(new Font("sansserif", Font.BOLD, 10));
          b43.setText("tan");
           b43.setFont(new Font("sansserif", Font.BOLD, 10));
          b22.setText("sinh");
           b22.setFont(new Font("sansserif", Font.BOLD, 10));
          b32.setText("cosh");
           b32.setFont(new Font("sansserif", Font.BOLD, 10));
          b42.setText("tanh");
           b42.setFont(new Font("sansserif", Font.BOLD, 10));
         b13.setText("ln");
         b41.setText("π");
          b21.setText("Int");
           b21.setFont(new Font("sansserif", Font.BOLD, 10));
          b31.setText("dms");
          aux4=0;
            }
        }
        /* Boton tan */
        if (a.getSource()==b43){
          if (aux4==0){
          if (aux==1){ 
              aux3=Math.cos(Math.PI/180*Double.parseDouble(fila2.getText()));
             if(aux3 != 0){
          nro=Math.tan(Math.PI/180*Double.parseDouble(fila2.getText()));  
            fila1.setText(nrostr2+ "tan(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;    
          }
             else{
            nro=0;
            nro2=0;
            fila2.setText("Entrada no valida");
            apagarerror();  
             }
          }
          
          if (aux==2){ 
              aux3=Math.cos(Double.parseDouble(fila2.getText()));
             if(aux3 != 0){
          nro=Math.tan(Double.parseDouble(fila2.getText()));  
            fila1.setText(nrostr2+ "tan(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;    
          }
             else{
            nro=0;
            nro2=0;
            fila2.setText("Entrada no valida");
            apagarerror();  
             }
          }
          if (aux==3){ 
              aux3=Math.cos(Math.PI*Double.parseDouble(fila2.getText())/200);
             if(aux3 != 0){
          nro=Math.tan(Math.PI*Double.parseDouble(fila2.getText())/200);  
            fila1.setText(nrostr2+ "cos(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;    
          }
             else{
            nro=0;
            nro2=0;
            fila2.setText("Entrada no valida");
            apagarerror();  
             }
          }
        }
          else{
            if (aux==1){      
          nro=Math.atan(Double.parseDouble(fila2.getText()))*180/Math.PI;
          }
          if (aux==2){      
          nro=Math.atan(Double.parseDouble(fila2.getText()));
          }
          if (aux==3){      
          nro=Math.atan(Double.parseDouble(fila2.getText()))*200/Math.PI;
          }
          fila1.setText(nrostr2+ "tan-1(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
          b23.setText("sin");
           b23.setFont(new Font("sansserif", Font.BOLD, 10));
          b33.setText("cos");
           b33.setFont(new Font("sansserif", Font.BOLD, 10));
          b43.setText("tan");
           b43.setFont(new Font("sansserif", Font.BOLD, 10));
          b22.setText("sinh");
           b22.setFont(new Font("sansserif", Font.BOLD, 10));
          b32.setText("cosh");
           b32.setFont(new Font("sansserif", Font.BOLD, 10));
          b42.setText("tanh");
           b42.setFont(new Font("sansserif", Font.BOLD, 10));
         b13.setText("ln");
         b41.setText("π");
          b21.setText("Int");
           b21.setFont(new Font("sansserif", Font.BOLD, 10));
          b31.setText("dms");
          aux4=0;
          }
        }
        /* Boton senh*/
          if (a.getSource()==b22){
          if(aux4==0){
              
          
          if (aux==1){      
          nro=Math.sinh(Math.PI/180*Double.parseDouble(fila2.getText()));
          }
          if (aux==2){      
          nro=Math.sinh(Double.parseDouble(fila2.getText()));
          }
          if (aux==3){      
          nro=Math.sinh(Math.PI*Double.parseDouble(fila2.getText())/200);
          }
          fila1.setText(nrostr2+ "sinh(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;    
          }
          
        } 
        
         /* Boton cosh */
         if (a.getSource()==b32){
          
          if (aux==1){      
          nro=Math.cosh((Double.parseDouble(fila2.getText())));
          }
          if (aux==2){      
          nro=Math.cosh(Math.toDegrees(Double.parseDouble(fila2.getText())));
          }
          if (aux==3){      
          nro=Math.cosh(360/400*Double.parseDouble(fila2.getText())/200);
          }
          fila1.setText(nrostr2+ "cosh(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;    
           
        } 
          /* Boton tanh */
         if (a.getSource()==b42){
          
          if (aux==1){      
          nro=Math.tanh((Double.parseDouble(fila2.getText())));
          }
          if (aux==2){      
          nro=Math.tanh(Math.toDegrees(Double.parseDouble(fila2.getText())));
          }
          if (aux==3){      
          nro=Math.tanh(360/400*Double.parseDouble(fila2.getText())/200);
          }
          fila1.setText(nrostr2+ "tanh(" +fila2.getText()+ ")");
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;    
           
        } 
     
        
          if (a.getSource()==b13){
                /* Boton ln */
              if (aux4==0){
          aux3=Double.parseDouble(fila2.getText());
          fila1.setText(nrostr2 +"ln("+fila2.getText()+")");
          if (aux3 > 0){
          nro=Math.log(Double.parseDouble(fila2.getText()));
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
          }
          else{
              nro=0;
            nro2=0;
            fila2.setText("Entrada no valida");
            apagarerror();  
          }
          }
                /* Boton e^x */
              else{
          nro=Math.exp(Double.parseDouble(fila2.getText()));
          fila1.setText(nrostr2 +"e^"+ fila2.getText());
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
           b23.setText("sin");
           b23.setFont(new Font("sansserif", Font.BOLD, 10));
          b33.setText("cos");
           b33.setFont(new Font("sansserif", Font.BOLD, 10));
          b43.setText("tan");
           b43.setFont(new Font("sansserif", Font.BOLD, 10));
          b22.setText("sinh");
           b22.setFont(new Font("sansserif", Font.BOLD, 10));
          b32.setText("cosh");
           b32.setFont(new Font("sansserif", Font.BOLD, 10));
          b42.setText("tanh");
           b42.setFont(new Font("sansserif", Font.BOLD, 10));
         b13.setText("ln");
         b41.setText("π");
          b21.setText("Int");
           b21.setFont(new Font("sansserif", Font.BOLD, 10));
          b31.setText("dms");
          aux4=0;
              }
          }
          /* Boton log */
          if (a.getSource()==b54){
          aux3=Double.parseDouble(fila2.getText());
          fila1.setText(nrostr2 +"log("+fila2.getText()+")");
          if (aux3 > 0){
          nro=Math.log10(Double.parseDouble(fila2.getText()));
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
          ;
          }
          else{
              nro=0;
            nro2=0;
            fila2.setText("Entrada no valida");
            apagarerror();  
          }
          }
          /* Boton 1/x */
          if (a.getSource()==b310){
          aux3=Double.parseDouble(fila2.getText());
          fila1.setText(nrostr2 +"reciproc("+fila2.getText()+")");
          if (aux3 > 0){
          nro=1/Double.parseDouble(fila2.getText());
          fila2.setText(String.valueOf(nro));
          b0=true;
          funcion=true;
          b2=false;
          ;
          }
          else{
              nro=0;
            nro2=0;
            fila2.setText("Entrada no valida");
            apagarerror();  
          }
          }
    }
}   
void apagarerror () {
               sexages.setEnabled(false);
               cent.setEnabled(false);
               radianes.setEnabled(false);
               fila2.setEnabled(false);
               mc.setEnabled(false);
               mr.setEnabled(false);
               msuma.setEnabled(false);
               mresta.setEnabled(false);
               ms.setEnabled(false);
               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b19.setEnabled(false);
               b110.setEnabled(false);
               b21.setEnabled(false);
               b22.setEnabled(false);
               b23.setEnabled(false);
               b24.setEnabled(false);
               b25.setEnabled(false);
               b26.setEnabled(false);
               b27.setEnabled(false);
               b28.setEnabled(false);
               b29.setEnabled(false);
               b210.setEnabled(false);
               b31.setEnabled(false);
               b32.setEnabled(false);
               b33.setEnabled(false);
               b34.setEnabled(false);
               b35.setEnabled(false);
               b36.setEnabled(false);
               b37.setEnabled(false);
               b38.setEnabled(false);
               b39.setEnabled(false);
               b310.setEnabled(false);
               b41.setEnabled(false);
               b42.setEnabled(false);
               b43.setEnabled(false);
               b44.setEnabled(false);
               b45.setEnabled(false);
               b46.setEnabled(false);
               b47.setEnabled(false);
               b48.setEnabled(false);
               b49.setEnabled(false);
               b410.setEnabled(false);
               b51.setEnabled(false);
               b52.setEnabled(false);
               b53.setEnabled(false);
               b54.setEnabled(false);
               b55.setEnabled(false);
               b56.setEnabled(false);
               b57.setEnabled(false);
               b58.setEnabled(false);
              
}
void prendererror () {
               sexages.setEnabled(true);
               cent.setEnabled(true);
               radianes.setEnabled(true);
               fila2.setEnabled(true);
               mc.setEnabled(true);
               mr.setEnabled(true);
               msuma.setEnabled(true);
               mresta.setEnabled(true);
               ms.setEnabled(true);
               b11.setEnabled(true);
               b12.setEnabled(true);
               b13.setEnabled(true);
               b16.setEnabled(true);
               b17.setEnabled(true);
               b19.setEnabled(true);
               b110.setEnabled(true);
               b21.setEnabled(true);
               b22.setEnabled(true);
               b23.setEnabled(true);
               b24.setEnabled(true);
               b25.setEnabled(true);
               b26.setEnabled(true);
               b27.setEnabled(true);
               b28.setEnabled(true);
               b29.setEnabled(true);
               b210.setEnabled(true);
               b31.setEnabled(true);
               b32.setEnabled(true);
               b33.setEnabled(true);
               b34.setEnabled(true);
               b35.setEnabled(true);
               b36.setEnabled(true);
               b37.setEnabled(true);
               b38.setEnabled(true);
               b39.setEnabled(true);
               b310.setEnabled(true);
               b41.setEnabled(true);
               b42.setEnabled(true);
               b43.setEnabled(true);
               b44.setEnabled(true);
               b45.setEnabled(true);
               b46.setEnabled(true);
               b47.setEnabled(true);
               b48.setEnabled(true);
               b49.setEnabled(true);
               b410.setEnabled(true);
               b51.setEnabled(true);
               b52.setEnabled(true);
               b53.setEnabled(true);
               b54.setEnabled(true);
               b55.setEnabled(true);
               b56.setEnabled(true);
               b57.setEnabled(true);
               b58.setEnabled(true);
              
}
private class ManejadorComboBox implements ItemListener{
    public void itemStateChanged ( ItemEvent i ) {
           if(i.getStateChange()==ItemEvent.SELECTED){
               int idx=combo1.getSelectedIndex();
               switch(idx){
                   case 0:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo1.length;n++){
                        combo2.addItem(tipo1[n]);
                        combo3.addItem(tipo1[n]);}
                       
                       break;
                   case 1:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo2.length;n++){
                        combo2.addItem(tipo2[n]);
                        combo3.addItem(tipo2[n]);}
                       break;
                   case 2:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo3.length;n++){
                        combo2.addItem(tipo3[n]);
                        combo3.addItem(tipo3[n]);}
                       break;
                   case 3:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo4.length;n++){
                        combo2.addItem(tipo4[n]);
                        combo3.addItem(tipo4[n]);}
                       break;
                   case 4:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo5.length;n++){
                        combo2.addItem(tipo5[n]);
                        combo3.addItem(tipo5[n]);}
                       break;
                   case 5:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo6.length;n++){
                        combo2.addItem(tipo6[n]);
                        combo3.addItem(tipo6[n]);}
                       break;
                   case 6:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo7.length;n++){
                        combo2.addItem(tipo7[n]);
                        combo3.addItem(tipo7[n]);}
                       break;
                   case 7:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo8.length;n++){
                        combo2.addItem(tipo8[n]);
                        combo3.addItem(tipo8[n]);}
                       break;
                   case 8:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo9.length;n++){
                        combo2.addItem(tipo9[n]);
                        combo3.addItem(tipo9[n]);}
                       break;
                   case 9:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo10.length;n++){
                        combo2.addItem(tipo10[n]);
                        combo3.addItem(tipo10[n]);}
                       break;
                   case 10:
                       combo2.removeAllItems();
                       combo3.removeAllItems();
                       for (int n=0; n<tipo11.length;n++){
                        combo2.addItem(tipo11[n]);
                        combo3.addItem(tipo11[n]);}
                       break;
               }
           }
           
       }
   }
private class ManejadorRadioButton implements ItemListener { // Inicio ManejadorBotonOpcion 
    public void itemStateChanged ( ItemEvent evento) { 
        if (evento.getSource() == sexages) {
            aux=1;
        }
        if (evento.getSource() == radianes){
            aux=2;
        } 
        if (evento.getSource() == cent) {
            aux=3; 
        } 
    }
    // Fin Manejador
}
private class ControlTecla implements KeyListener {      // Inicio ControlTecla
        int nroCaracteres=0,vtex1;
public void keyPressed(KeyEvent keyEvent) {}
public void keyReleased(KeyEvent keyEvent) {
    if ( nroCaracteres!=0){
       switch(combo1.getSelectedIndex()){
                case 0:
                  tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())*ntipo1[combo3.getSelectedIndex()]/ntipo1[combo2.getSelectedIndex()]));  
                  break;
                case 1:
                  tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())*ntipo2[combo3.getSelectedIndex()]/ntipo2[combo2.getSelectedIndex()]));  
                  break;
                case 2:
                  tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())*ntipo3[combo3.getSelectedIndex()]/ntipo3[combo2.getSelectedIndex()]));  
                  break;
                case 3:
                  tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())*ntipo4[combo3.getSelectedIndex()]/ntipo4[combo2.getSelectedIndex()]));  
                  break;
                case 4:
                  tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())*ntipo5[combo3.getSelectedIndex()]/ntipo5[combo2.getSelectedIndex()]));  
                  break;
                case 5:
                  tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())*ntipo6[combo3.getSelectedIndex()]/ntipo6[combo2.getSelectedIndex()]));  
                  break;
                case 6:
                  tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())*ntipo7[combo3.getSelectedIndex()]/ntipo7[combo2.getSelectedIndex()]));  
                  break;
                case 7:
                  tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())*ntipo8[combo3.getSelectedIndex()]/ntipo8[combo2.getSelectedIndex()]));  
                  break;
                case 8:
                  if (combo2.getSelectedIndex()==1 && combo3.getSelectedIndex()==0){
                    tex2.setText(String.valueOf((Double.parseDouble(tex1.getText())-32)/1.8));
                    }
                    else if (combo2.getSelectedIndex()==1 && combo3.getSelectedIndex()==2){
                        if((Double.parseDouble(tex1.getText())+459.67)/1.8<=0){
                            tex2.setText("0");}
                        else{
                            tex2.setText(String.valueOf((Double.parseDouble(tex1.getText())+459.67)/1.8));}
                    }
                    else if (combo2.getSelectedIndex()==2 && combo3.getSelectedIndex()==0){
                        if(Double.parseDouble(tex1.getText())<0){
                            tex2.setText("0");}
                        else{
                            tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())-273.6));}
                    }
                    else if (combo2.getSelectedIndex()==2 && combo3.getSelectedIndex()==1){
                        if(Double.parseDouble(tex1.getText())<0){
                            tex2.setText("0");}
                        else{
                            tex2.setText(String.valueOf(1.8*Double.parseDouble(tex1.getText())-459.67));}
                    }
                    else if(combo2.getSelectedIndex()==0 && combo3.getSelectedIndex()==1){
                    tex2.setText(String.valueOf((1.8*Double.parseDouble(tex1.getText()))+32));  
                    }
                    else if(combo2.getSelectedIndex()==0 && combo3.getSelectedIndex()==2){                   
                        if ((Double.parseDouble(tex1.getText())+273.6)<0){
                            tex2.setText("0");}
                        else{
                            tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())+273.6));}
                    }
                    else{
                    tex2.setText(tex1.getText());}
                    break;
                case 9:
                  tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())*ntipo10[combo3.getSelectedIndex()]/ntipo10[combo2.getSelectedIndex()]));  
                  break;
                case 10:
                  tex2.setText(String.valueOf(Double.parseDouble(tex1.getText())*ntipo11[combo3.getSelectedIndex()]/ntipo11[combo2.getSelectedIndex()]));                            
                break;}
            }
    else{
        tex2.setText("");        
}
} 
public void keyTyped(KeyEvent keyEvent) {
    char caracter = keyEvent.getKeyChar();
    if ( ( (caracter < '0') || (caracter > '9') ) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '.') && (caracter != 'e'))
        {  //  Verifica el uso de caracteres válidos
        keyEvent.consume();
        }  // Fin verificación del uso de caracteres válidos
    else { 
        if (caracter == KeyEvent.VK_BACK_SPACE && nroCaracteres>0)  
            {//Verifica si se presionó la tecla de retroceso   if (nroCaracteres > 0)
            nroCaracteres -= 1;
            }
        else if (caracter == KeyEvent.VK_BACK_SPACE){
            //Verifica si se presiono la tecla de retroceso sin haber ningun caracter
            nroCaracteres=0;
            }
        else
        {//Sino se presiono la tecla de retroceso,entonces...
            nroCaracteres +=1;
        }
        if (nroCaracteres > 15)
           {  // Valida que el Numero Entero no tenga más de 9 caracteres
            keyEvent.consume();
            nroCaracteres -= 1;
            }  // Fin validación de la longitud del Numero Entero                                                                                  
    } // Fin ControlTecla    
}

}
 private class ControlTecla2 implements KeyListener {
    // Inicio ControlTecla
     int nroCaracteres2=0;
    public void keyPressed(KeyEvent keyEvent) { }
    
    public void keyReleased(KeyEvent keyEvent) { } 
    
    public void keyTyped(KeyEvent keyEvent) {
        char caracter = keyEvent.getKeyChar();
if ( ( (caracter < '0') || (caracter > '9')) && (caracter != '.') 
&& (caracter != KeyEvent.VK_BACK_SPACE)  ) {
    // Verifica el uso de caracteres válidos
    keyEvent.consume();
} // Fin verificación del uso de caracteres válidos 
else { 
if (caracter == KeyEvent.VK_BACK_SPACE) { 
// Verifica si se presionó la tecla de retroceso
if (nroCaracteres2 > 0) 
    nroCaracteres2 -= 1; } 
// Fin verificación de uso de la tecla de retroceso 
else nroCaracteres2 +=1; 
    if (nroCaracteres2>30){
    keyEvent.consume();
    nroCaracteres2 -= 1; }}
// Fin validación de la longitud de texto

  
} // Fin de la clase CampoTexto
}    
}   
