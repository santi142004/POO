package una_clase_sin_metodos;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		cadena= JOptionPane.showInputDialog("Ingrese la longitud del lado A: " );
		ladoA= Double.parseDouble(cadena);
		
		cadena= JOptionPane.showInputDialog("Ingrese longitud del lado B: " );
		ladoB= Double.parseDouble(cadena);
		
		resultado= ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "El resultado es: " +resultado );
		
	}

}
