/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahmin;

import javax.swing.JOptionPane;

/**
 *
 * @author engin ülkü
 */
public class Tahmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {JOptionPane.showInputDialog("e=esit, b=büyük,k=kücük");
	int i;
		i = (int)(Math.random()*(100));
		JOptionPane.showMessageDialog(null, "tahminim " +i);
		
		String tah=JOptionPane.showInputDialog("tuttugunuz sayi 'k' mu?, 'b' mu?,'e'mi?");
		while(tah.equalsIgnoreCase("k")||tah.equalsIgnoreCase("buyuk"))
		{
		while(tah.equalsIgnoreCase("k"))
			{
			i = (int)(Math.random()*(i)); 
		JOptionPane.showMessageDialog(null, "tahminim " +i);
		tah=JOptionPane.showInputDialog("tuttugunuz sayi 'k' mu?, 'b' mu?,'esit'mi?");
	 	}
while(tah.equalsIgnoreCase("b"))
			{
				i = (int)(Math.random()*(100-i)+i); 
				JOptionPane.showMessageDialog(null, "tahminim " +i);
				tah=JOptionPane.showInputDialog("tuttugunuz sayi 'k' mu?, 'b' mu?,'e'mi?");	
			}
			if(tah.equalsIgnoreCase("e"))
			{	JOptionPane.showMessageDialog(null, "dogru bildiniz");
				break;
			 }
        // TODO code application logic here
    }}
    
}
