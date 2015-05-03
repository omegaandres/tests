package tests;

import  java.awt.event.*; 
import javax.swing.*; 
import  java.awt.*; 

public class Tests extends JFrame { 
        JButton btnsuma=new JButton("Suma"); 
        JButton btnresta=new JButton("Resta"); 
        JButton btnmultiplicacion=new JButton("Multiplicacion"); 
        JButton btndivision=new JButton("Division"); 
        JToolBar Calcular = new JToolBar(); 
          public Tests() 
         { 
        Calcular.add(btnsuma); 
        Calcular.add(btnresta); 
        Calcular.add(btnmultiplicacion); 
        Calcular.add(btndivision); 
        add(Calcular, "North"); 
        setSize(300,400); 
        setVisible(true); 
         
        btnsuma.addActionListener(new ActionListener()   
        { public void actionPerformed(ActionEvent e){ 
     
            int a,b,valor; 
            a=Integer.parseInt(JOptionPane.showInputDialog("Valor para a es:")); 
            b=Integer.parseInt(JOptionPane.showInputDialog("Valor para b es:")); 
            valor=a+b; 
            JOptionPane.showMessageDialog(null,"La suma es:" + valor); 
               
    }    
    } 
    ); 
     
    btnresta.addActionListener(new ActionListener()   
        { public void actionPerformed(ActionEvent e){ 
            int a,b,valor; 
            a=Integer.parseInt(JOptionPane.showInputDialog( "Valor para a es:")); 
            b=Integer.parseInt(JOptionPane.showInputDialog("Valor para b es:")); 
            valor=a-b; 
            JOptionPane.showMessageDialog(null,"La reta es:" + valor); 
        } 
        } 
        ); 
         btnmultiplicacion.addActionListener(new ActionListener()   
        { public void actionPerformed(ActionEvent e){ 
            int a,b,valor; 
            a=Integer.parseInt(JOptionPane.showInputDialog("Valor para a es:")); 
            b=Integer.parseInt(JOptionPane.showInputDialog("Valor para b es:")); 
            valor=a*b; 
            JOptionPane.showMessageDialog(null,"La multiplicacion es:" + valor); 
        } 
        } 
        ); 
            btndivision.addActionListener(new ActionListener()   
        { public void actionPerformed(ActionEvent e){ 
            int a,b,valor; 
            a=Integer.parseInt(JOptionPane.showInputDialog("Valor para a es:")); 
            b=Integer.parseInt(JOptionPane.showInputDialog("Valor para b es:")); 
            valor=a/b; 
            JOptionPane.showMessageDialog(null,"La division es:" + valor); 
        } 
        } 
        ); 
         }       
    public static void main (String args[]) { 
        new Tests(); 
   } 
 