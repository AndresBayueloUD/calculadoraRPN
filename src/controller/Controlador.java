package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.*;
import view.*;

public class Controlador implements ActionListener{
	
	private Pila pila;
	private Calculadora calculadora;
	private Interfaz interfaz;
	
	private int index; 
	
	public Controlador() {
		
		pila = new Pila();
		calculadora = new Calculadora();
		interfaz = new Interfaz(this);
		interfaz.cargarListeners();
		
		index = 0;
		interfaz.getDatosPantalla().addElement("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton boton;
        boton = (JButton)e.getSource();
        
        String number = (String)interfaz.getDatosPantalla().getElementAt(index);
        
        if( boton == interfaz.getB1() || boton == interfaz.getB2() || boton == interfaz.getB3() || boton == interfaz.getB4() || boton == interfaz.getB5() || boton == interfaz.getB6() || boton == interfaz.getB7() || boton == interfaz.getB8() || boton == interfaz.getB9() || boton == interfaz.getB0()) {
        	
        	if( (number.equals("") && !boton.getText().equals("0")) || !number.equals("")) {
        		interfaz.getDatosPantalla().removeElementAt(index);
        		interfaz.getDatosPantalla().add(index, number + boton.getText());
        	}
        	interfaz.getPantalla().ensureIndexIsVisible(interfaz.getDatosPantalla().getSize()-1);
        }
        
        if(boton == interfaz.getEnter()) {
        	
        	if(!number.equals("")) {
        		pila.agregar(number);
            	this.index++;
            	interfaz.getDatosPantalla().add(index, "");
        	}
        	
        }
        
        if(boton == interfaz.getbOpSuma() || boton == interfaz.getbOpResta() || boton == interfaz.getbOpMultiplicacion() || boton == interfaz.getbOpDivision()) {
        	
        	if(!number.equals("") && index>0) {
        		if(boton == interfaz.getbOpSuma())
        			pila.agregar(""+calculadora.sumar(Double.parseDouble((String)pila.remover()), Double.parseDouble(number)));
        		if(boton == interfaz.getbOpResta())
        			pila.agregar(""+calculadora.restar(Double.parseDouble((String)pila.remover()), Double.parseDouble(number)));
        		if(boton == interfaz.getbOpMultiplicacion())
        			pila.agregar(""+calculadora.multiplicar(Double.parseDouble((String)pila.remover()), Double.parseDouble(number)));
        		if(boton == interfaz.getbOpDivision())
        			pila.agregar(""+calculadora.dividir(Double.parseDouble((String)pila.remover()), Double.parseDouble(number)));
        		interfaz.getDatosPantalla().set(index-1, pila.obtener(index-1));
        		interfaz.getDatosPantalla().set(index, "");
        	}
        	
        }
        
        if(boton == interfaz.getBuscar()) {
        	
        	if(!number.equals("") && this.index>0) {
        		int indexSearch = pila.buscar(number);
        		System.out.println(indexSearch);
        		if(indexSearch!=pila.size())
        			interfaz.getPantalla().setSelectedIndex(indexSearch);
        	}
        	
        }
        
        if(boton == interfaz.getOrdenar()) {
        	
        	Cronometro cronometro = new Cronometro();
        	
            cronometro.iniciar();
        	pila.ordenarInsercion();
        	cronometro.parar();
        	
        	System.out.println("Algoritmo de ordenamiento");
            System.out.println(cronometro.getDuracionNs());
        	
        	interfaz.getDatosPantalla().clear();
        	for(int i=0; i<pila.tamanio(); i++) {
        		interfaz.getDatosPantalla().addElement(pila.get(i));
        	}
        	interfaz.getDatosPantalla().addElement("");
        	
        }
        
		
	}

}
