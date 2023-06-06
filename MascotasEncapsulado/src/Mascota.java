import java.util.HashMap;


import javax.swing.JOptionPane;

public class Mascota {
// Atributos
	private Integer codigo;
	private String nombre;
	private String especie;
	private int edad;


public void Mascota() {
	System.out.println("ingresa al constructor sin parametros");
}

public void setCodigo(Integer codigo) {
	this.codigo=codigo;
}

public Integer getCodigo() {
	return codigo;
}

public void setNombre(String nombre) {
	this.nombre=nombre;
}

public String getNombre() {
	return nombre;
}

public void setEspecie(String especie) {
	this.especie=especie;
}

public String getEspecie() {
	return especie;
}

public void setEdadi(int edad) {
	this.edad=edad;
}

public int getEdad() {
	return edad;
}



// Método para mostrar información de la mascota
	public void mostrarInformacion() {
		String datos="<<<<<<<<<DATOS "+nombre+">>>>>>>>>\n";
		datos+="Codigo: "+codigo+", Nombre: "+nombre+"\n";
		datos+="Especie: "+especie+", edad: "+edad+"\n";
		JOptionPane.showMessageDialog(null, datos);
	}

// Método para hacer que la mascota realice un sonido
	public void hacerSonido() {
		if (especie.equalsIgnoreCase("perro")) {
			JOptionPane.showMessageDialog(null, "¡Guau guau!"); 
		} else if (especie.equalsIgnoreCase("gato")) {
			JOptionPane.showMessageDialog(null, "¡Miau miau!");
		} else {
			JOptionPane.showMessageDialog(null, "La mascota no hace sonidos conocidos.");
		}
	}
	
	public void comida() {
		if (especie.equalsIgnoreCase("perro")|| especie.equalsIgnoreCase("gato")) {
			JOptionPane.showMessageDialog(null, "Tu mascota consume cuido");
		}else {
			JOptionPane.showMessageDialog(null, "Tu mascota tiene un tipo de alimentacion diferente");
		}
	}
	
	public void atacar() {
		if (especie.equalsIgnoreCase("perro")) {
			JOptionPane.showMessageDialog(null, "Tu mascota muerde");
		}else if(especie.equalsIgnoreCase("gato")) {
			JOptionPane.showMessageDialog(null, "Tu mascota araña");
		}else {
			JOptionPane.showMessageDialog(null, "Tu mascota ataca de otra forma");
		}
	}
	
	public void actualizar() {
		String cambio= JOptionPane.showInputDialog("Ingrese el atributo que desea cambiar");
		if (cambio.equalsIgnoreCase("nombre")) {
			nombre= JOptionPane.showInputDialog("Ingrese el nuevo nombre");
		}else if(cambio.equalsIgnoreCase("especie")) {
			especie=JOptionPane.showInputDialog("Ingrese la nueva especie");
		}else {
			edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad"));
		}
	}
	
}
