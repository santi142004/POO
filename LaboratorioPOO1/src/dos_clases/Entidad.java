package dos_clases;

import javax.swing.JOptionPane;

public class Entidad {
	
	private double ladoA;
	private double ladoB;
	
	public void ingresarDatos() {
		String cadena;
		
		cadena= JOptionPane.showInputDialog("Ingrese la longitud del lado A");
		ladoA= Double.parseDouble(cadena);
		
		cadena= JOptionPane.showInputDialog("Ingrese la longitud del lado B");
		ladoB= Double.parseDouble(cadena);
	}
	
	public void calcularArea() {
		double resultado;
		
		resultado= ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "El resultado total es: "+resultado);
	}

}
