package view;

import java.awt.*;
import javax.swing.*;

import controller.Controlador;
	
public class Interfaz extends JFrame{
	
	private Controlador controlador;

	private DefaultListModel datosPantalla;
	private JList pantalla;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
	private JButton bOpSuma, bOpResta, bOpDivision, bOpMultiplicacion;
	private JButton enter, ordenar, buscar;
	private JTextField ingresar;
	private JLabel numero;
	
	public Interfaz(Controlador controlador){
	
		this.controlador = controlador;
		
		JFrame ventana = new JFrame("Calculadora");
		ventana.setSize(350, 500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		ventana.add(panel);
		placeComponents(panel);
		panel.setBackground(Color.LIGHT_GRAY);
			
		ventana.setVisible(true);

	}

	public void placeComponents(JPanel panel) {
	
		panel.setLayout(null);
		
		ImageIcon fondo = new ImageIcon("src/fondo.jpg");
	    JLabel Fondo = new JLabel(fondo);
	    Fondo.setBounds(0, 0, 350, 500);
	    panel.add(Fondo);
			
	    b1 = new JButton("1");
	    b1.setBounds(130, 270, 45, 30);
	    Fondo.add(b1);
	         
	    b2 = new JButton("2");
	    b2.setBounds(190, 270, 45, 30);
	    Fondo.add(b2);
	     
	    b3 = new JButton("3");
	    b3.setBounds(250, 270, 45, 30);
	    Fondo.add(b3);
	     
	    b4 = new JButton("4");
	    b4.setBounds(130, 310, 45, 30);
	    Fondo.add(b4);
	     
	    b5 = new JButton("5");
	    b5.setBounds(190, 310, 45, 30);
	    Fondo.add(b5);
	     
	    b6 = new JButton("6");
	    b6.setBounds(250, 310, 45, 30);
	    Fondo.add(b6);
	     
	    b7 = new JButton("7");
	    b7.setBounds(130, 350, 45, 30);
	    Fondo.add(b7);
	     
	    b8 = new JButton("8");
	    b8.setBounds(190, 350, 45, 30);
	    Fondo.add(b8);
	     
	    b9 = new JButton("9");
	    b9.setBounds(250, 350, 45, 30);
	    Fondo.add(b9);
	     
	    b0 = new JButton("0");
	    b0.setBounds(190, 390, 45, 30);
	    Fondo.add(b0);
	     
	     
	    enter = new JButton("Enter");
	    enter.setBounds(20, 270, 90, 30);
	    Fondo.add(enter);
	     
	    ordenar = new JButton("Ordenar");
	    ordenar.setBounds(20, 310, 90, 30);
	    Fondo.add(ordenar);
	     
	    buscar = new JButton("Buscar");
	    buscar.setBounds(20, 350, 90, 30);
	    Fondo.add(buscar);
		
		bOpSuma = new JButton("+");
		bOpSuma.setBounds(20, 230, 90, 30);
		Fondo.add(bOpSuma);
		
		bOpResta = new JButton("-");
		bOpResta.setBounds(130, 230, 45, 30);
		Fondo.add(bOpResta);
		
		bOpDivision = new JButton("/");
		bOpDivision.setBounds(190, 230, 45, 30);
		Fondo.add(bOpDivision);
		
		bOpMultiplicacion = new JButton("*");
		bOpMultiplicacion.setBounds(250, 230, 45, 30);	
		Fondo.add(bOpMultiplicacion);
			
		datosPantalla = new DefaultListModel();
		pantalla = new JList(datosPantalla);
		DefaultListCellRenderer renderer = (DefaultListCellRenderer)pantalla.getCellRenderer();
		renderer.setHorizontalAlignment(JLabel.RIGHT);
		JScrollPane scrllPane = new JScrollPane(pantalla);
		scrllPane.setBounds(30, 50, 270, 150);
		Fondo.add(scrllPane);
		
		/*ingresar = new JTextField();
	    ingresar.setBounds(130, 230, 160, 30);
	    ingresar.setEditable(true);
	    Fondo.add(ingresar);
	     
	    numero = new JLabel("Numero:");
	    numero.setForeground(Color.white);
	    numero.setBounds(30, 230, 120, 30);
	    Fondo.add(numero);*/
	
	}
	
	public void cargarListeners() {
		b1.addActionListener(this.controlador);
		b2.addActionListener(this.controlador);
		b3.addActionListener(this.controlador);
		b4.addActionListener(this.controlador);
		b5.addActionListener(this.controlador);
		b6.addActionListener(this.controlador);
		b7.addActionListener(this.controlador);
		b8.addActionListener(this.controlador);
		b9.addActionListener(this.controlador);
		b0.addActionListener(this.controlador);
		bOpSuma.addActionListener(this.controlador);
		bOpResta.addActionListener(this.controlador);
		bOpDivision.addActionListener(this.controlador);
		bOpMultiplicacion.addActionListener(this.controlador);
		enter.addActionListener(this.controlador);
		ordenar.addActionListener(this.controlador);
		buscar.addActionListener(this.controlador);
	}
	
	public DefaultListModel getDatosPantalla() {
		return datosPantalla;
	}
	
	public JList getPantalla() {
		return pantalla;
	}
	
	public JButton getB1() {
		return b1;
	}

	public JButton getB2() {
		return b2;
	}

	public JButton getB3() {
		return b3;
	}

	public JButton getB4() {
		return b4;
	}

	public JButton getB5() {
		return b5;
	}

	public JButton getB6() {
		return b6;
	}

	public JButton getB7() {
		return b7;
	}

	public JButton getB8() {
		return b8;
	}

	public JButton getB9() {
		return b9;
	}

	public JButton getB0() {
		return b0;
	}

	public JButton getbOpSuma() {
		return bOpSuma;
	}

	public JButton getbOpResta() {
		return bOpResta;
	}

	public JButton getbOpDivision() {
		return bOpDivision;
	}

	public JButton getbOpMultiplicacion() {
		return bOpMultiplicacion;
	}

	public JButton getEnter() {
		return enter;
	}

	public JButton getOrdenar() {
		return ordenar;
	}

	public JButton getBuscar() {
		return buscar;
	}
	
	/*public JTextField getIngresar() {
		return ingresar;
	}*/

}