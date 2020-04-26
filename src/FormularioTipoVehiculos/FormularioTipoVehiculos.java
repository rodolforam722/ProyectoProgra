package FormularioTipoVehiculos;

/**
 *
 * @author https://www.geeksforgeeks.org/java-swing-simple-user-registration-form/
 */
// Java program to implement 
// a Simple Registration Form 
// using Java Swing 

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import static javax.swing.JFrame.EXIT_ON_CLOSE;

class FormularioTipoVehiculos
	extends JFrame 
	implements ActionListener { 

	// Components of the Form 
	private Container c; 
	private JLabel title; 
	private JLabel name; 
	private JTextField tname; 
	private JLabel mno; 
	private JTextField tmno; 
	private JLabel gender; 
	private JRadioButton Carro; 
	private JRadioButton Moto;
        private JRadioButton Camioneta;
	private ButtonGroup gengp; 
	private JLabel dob; 
	private JComboBox date; 
	private JComboBox month; 
	private JComboBox year; 
	private JLabel add; 
	private JTextArea tadd; 
	private JCheckBox term; 
	private JButton sub; 
	private JButton reset; 
	private JTextArea tout; 
	private JLabel res; 
	private JTextArea resadd; 

	private String dates[] 
		= { "1", "2", "3", "4", "5", 
			"6", "7", "8", "9", "10", 
			"11", "12", "13", "14", "15", 
			"16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", 
			"26", "27", "28", "29", "30", 
			"31" }; 
	private String months[] 
		= { "Jan", "feb", "Mar", "Apr", 
			"May", "Jun", "July", "Aug", 
			"Sup", "Oct", "Nov", "Dec" }; 
	private String years[] 
		= { "1995", "1996", "1997", "1998", 
			"1999", "2000", "2001", "2002", 
			"2003", "2004", "2005", "2006", 
			"2007", "2008", "2009", "2010", 
			"2011", "2012", "2013", "2014", 
			"2015", "2016", "2017", "2018", 
			"2019" }; 

	// constructor, to initialize the components 
	// with default values. 
	public FormularioTipoVehiculos() 
	{ 
		setTitle("Regristro De Vehiculos"); 
		setBounds(300, 90, 900, 600); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setResizable(false); 

		c = getContentPane(); 
		c.setLayout(null); 

		title = new JLabel("Registro De Vehiuclos"); 
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
		title.setSize(300, 30); 
		title.setLocation(300, 31); 
		c.add(title); 

		name = new JLabel("Marca"); 
		name.setFont(new Font("Arial", Font.PLAIN, 20)); 
		name.setSize(100, 20); 
		name.setLocation(50, 100); 
		c.add(name); 

		tname = new JTextField(); 
		tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tname.setSize(190, 20); 
		tname.setLocation(160, 100); 
		c.add(tname); 

		mno = new JLabel("Modelo"); 
		mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
		mno.setSize(220, 20); 
		mno.setLocation(50, 150); 
		c.add(mno); 

		tmno = new JTextField(); 
		tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tmno.setSize(190, 20); 
		tmno.setLocation(230, 150); 
		c.add(tmno); 

		gender = new JLabel("Tipos"); 
		gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
		gender.setSize(120, 20); 
		gender.setLocation(50, 200); 
		c.add(gender); 
                
             
		Carro = new JRadioButton("Carro"); 
		Carro.setFont(new Font("Arial", Font.PLAIN, 15)); 
		Carro.setSelected(true); 
		Carro.setSize(90, 20); 
		Carro.setLocation(220, 200); 
		c.add(Carro); 
                
                

		Moto = new JRadioButton("Moto"); 
		Moto.setFont(new Font("Arial", Font.PLAIN, 15)); 
		Moto.setSelected(false); 
		Moto.setSize(80, 20); 
		Moto.setLocation(310, 200); 
		c.add(Moto);
                
                Camioneta = new JRadioButton("Camioneta"); 
		Camioneta.setFont(new Font("Arial", Font.PLAIN, 15)); 
		Camioneta.setSelected(false); 
		Camioneta.setSize(80, 20); 
		Camioneta.setLocation(310, 200); 
		c.add(Camioneta);

		gengp = new ButtonGroup(); 
		gengp.add(Carro); 
		gengp.add(Moto);
                gengp.add(Camioneta);

		dob = new JLabel("Año del vehiculo"); 
		dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
		dob.setSize(200, 20); 
		dob.setLocation(50, 250); 
		c.add(dob); 

		/*date = new JComboBox(dates); 
		date.setFont(new Font("Arial", Font.PLAIN, 15)); 
		date.setSize(50, 20); 
		date.setLocation(260, 250); 
		c.add(date); 

		month = new JComboBox(months); 
		month.setFont(new Font("Arial", Font.PLAIN, 15)); 
		month.setSize(60, 20); 
		month.setLocation(330, 250); 
		c.add(month);*/ 

		year = new JComboBox(years); 
		year.setFont(new Font("Arial", Font.PLAIN, 15)); 
		year.setSize(70, 40); 
		year.setLocation(330, 250); 
		c.add(year); 

		add = new JLabel("Descripcion"); 
		add.setFont(new Font("Arial", Font.PLAIN, 20)); 
		add.setSize(200, 20); 
		add.setLocation(50, 300); 
		c.add(add); 

		tadd = new JTextArea(); 
		tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tadd.setSize(200, 20); 
		tadd.setLocation(190, 300); 
		tadd.setLineWrap(true); 
		c.add(tadd); 

		term = new JCheckBox("Accept Terms And Conditions."); 
		term.setFont(new Font("Arial", Font.PLAIN, 15)); 
		term.setSize(250, 20); 
		term.setLocation(150, 400); 
		c.add(term); 

		sub = new JButton("Submit"); 
		sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
		sub.setSize(100, 20); 
		sub.setLocation(150, 450); 
		sub.addActionListener(this); 
		c.add(sub); 

		reset = new JButton("Reset"); 
		reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
		reset.setSize(100, 20); 
		reset.setLocation(270, 450); 
		reset.addActionListener(this); 
		c.add(reset); 

		tout = new JTextArea(); 
		tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tout.setSize(300, 400); 
		tout.setLocation(500, 100); 
		tout.setLineWrap(true); 
		tout.setEditable(false); 
		c.add(tout); 

		res = new JLabel(""); 
		res.setFont(new Font("Arial", Font.PLAIN, 20)); 
		res.setSize(500, 25); 
		res.setLocation(100, 500); 
		c.add(res); 

		resadd = new JTextArea(); 
		resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
		resadd.setSize(200, 75); 
		resadd.setLocation(580, 175); 
		resadd.setLineWrap(true); 
		c.add(resadd); 

		setVisible(true); 
	} 

	// method actionPerformed() 
	// to get the action performed 
	// by the user and act accordingly 
	public void actionPerformed(ActionEvent e) 
	{ 
		if (e.getSource() == sub) { 
			if (term.isSelected()) { 
				String data1; 
				String data 
					= "Nombre : "
					+ tname.getText() + "\n"
					+ "Correo : "
					+ tmno.getText() + "\n"; 
				if (Carro.isSelected()) 
					data1 = "Tipo : Carro"
							+ "\n"; 
                                else
					data1 = "Tipo : Moto"
							+ "\n";
                                   
				String data2 
					= "Año : "
					+ "/" + (String)year.getSelectedItem() 
					+ "\n"; 

				String data3 = "Descripcion : " + tadd.getText(); 
				tout.setText(data + data1 + data2 + data3); 
				tout.setEditable(false); 
				res.setText("Registro completado.."); 
			} 
			else { 
				tout.setText(""); 
				resadd.setText(""); 
				res.setText("Please accept the"
							+ " terms & conditions.."); 
			} 
		} 

		else if (e.getSource() == reset) { 
			String def = ""; 
			tname.setText(def); 
			tadd.setText(def); 
			tmno.setText(def); 
			res.setText(def); 
			tout.setText(def); 
			term.setSelected(false); 
			date.setSelectedIndex(0); 
			month.setSelectedIndex(0); 
			year.setSelectedIndex(0); 
			resadd.setText(def); 
		} 
	} 
    
}

