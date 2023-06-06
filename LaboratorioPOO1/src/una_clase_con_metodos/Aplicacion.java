package una_clase_con_metodos;

import javax.swing.JOptionPane;

public class Aplicacion {
	
	public static void main(String args[]) {
		double ladoA;
		double ladoB;
		
		ladoA= ingresarDatos("Ingrese la longitud del lado A: " );
		ladoB= ingresarDatos("Ingrese la longitud del lado B: " );
		
		calcularArea(ladoA, ladoB);	
	}
	
	public static double ingresarDatos(String mensaje) {
		
		String cadena;
		double valor;
		
		cadena = JOptionPane.showInputDialog(mensaje);
		valor= Double.parseDouble(cadena);
		
		return valor;
	}
	
	public static void calcularArea(double a, double b) {
		
		double resultado;
		
		resultado= a * b;
		
		JOptionPane.showMessageDialog(null, "El resultado es el siguiente: " +resultado);
	}

}
