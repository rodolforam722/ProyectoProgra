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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

class ListaDeUsuarios
        extends JFrame 
	implements ActionListener { 
	
	//frame 
	static JFrame f;  
	
	//lists 
	static JList b; 


	//main class 
	public static void main(String[] args) 
	{ 
		//create a new frame 
		f = new JFrame("frame"); 
		
		//create a object 
		ListaDeUsuarios s=new ListaDeUsuarios(); 
		
		//create a panel 
		JPanel p =new JPanel(); 
		
		//create a new label 
		JLabel l= new JLabel("Seleccione el usuario que desee ver"); 

		//String array to store weekdays 
		String week[]= { "Andrey","Alejandro","Marcos", 
						"Andres","Rafael","Jafeth","Mariana"}; 
		
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
} 



    

	// Components of the Form 
	
		
	 
    

