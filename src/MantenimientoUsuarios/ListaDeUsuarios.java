/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MantenimientoUsuarios;

/**
 *
 * @author https://www.geeksforgeeks.org/java-swing-simple-user-registration-form/
 */
// Java program to implement 
// a Simple Registration Form 
// using Java Swing 


// java Program to create a simple JList 

import javax.swing.*; 

class ListaDeUsuarios
        extends JFrame 
	{ 
	
	//frame 
	static JFrame f;  
	
	//lists 
	static JList b; 
        
        


	//main class 
	public void iniciarVentana()
	{ 
		//create a new frame 
		f = new JFrame("Listado de usuarios"); 
		
		
		//create a panel 
		JPanel p =new JPanel(); 
		
		
		 

		 String week[]= new String[100]; 
		
		//create list 
		b= new JList(week); 
		
		//set a selected index 
		b.setSelectedIndex(2); 
		
		//add list to panel 
		p.add(b); 

		f.add(p); 
		
		//set the size of frame 
		f.setSize(400,400); 
		
		f.show(); 
	} 

   
	
	
} 



    


	
		
	 
    

