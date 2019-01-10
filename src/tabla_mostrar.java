

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class tabla_mostrar extends JFrame
{
    JScrollPane jsbarras;
    JTable tabladatos;
    JLabel lti;
    String encabezados[]={"Entero","Caracter","Texto","Doble"};
    String  datos[][];   
    tabla_mostrar(Variables autos)
    {
        setLayout(null);        
        datos=new String[autos.garage.length][4];
        for(int i=0;i<autos.indice;i++)
        {
            datos[i][0]=autos.garage[i].marca;
            datos[i][1]=autos.garage[i].modelo;
            datos[i][2]=autos.garage[i].color;
            datos[i][3]=""+autos.garage[i].precio;
        }
        tabladatos=new JTable (datos,encabezados);
        jsbarras=new JScrollPane(tabladatos);
        jsbarras.setBounds(20,70,200,200);
        Container c=getContentPane();
        c.add(jsbarras);
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        
    }
    
}
