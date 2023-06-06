package animales;

import javax.swing.JOptionPane;

public class Animal {
	
	private int codigo;
	private String tipo;
	private String especie;
	private String color;
	
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setEspecie(String especie) {
		this.especie=especie;
	}

	public String getEspecie() {
		return especie;
	}
	
	public void setColor(String color) {
		this.color=color;
	}

	public String getColor() {
		return color;
	}
	
	public void mostrarInformacion() {
		String datos="<<<<<<<<<DATOS "+especie+">>>>>>>>>\n";
		datos+="Codigo: "+codigo+", Tipo: "+tipo+"\n";
		datos+="Especie: "+especie+", color: "+color+"\n";
		JOptionPane.showMessageDialog(null, datos);
	}
	public void comida() {
		if (tipo.equalsIgnoreCase("acuatico")) {
			JOptionPane.showMessageDialog(null, "El animal consume plantas, insectos, semillas");
		}else if(tipo.equalsIgnoreCase("volador")) {
			JOptionPane.showMessageDialog(null, "El animal consume frutas, semillas, insectos, nueces, cerelaes");
		}else {
			JOptionPane.showMessageDialog(null, "El animal consume carne, plantas o ambas");
		}
	}
	
	public void atacar() {
		if (tipo.equalsIgnoreCase("acuatico")) {
			JOptionPane.showMessageDialog(null, "El animal ataca por el agua");
		}else if(tipo.equalsIgnoreCase("volador")) {
			JOptionPane.showMessageDialog(null, "El animal ataca por los aires");
		}else {
			JOptionPane.showMessageDialog(null, "El animal ataca de forma terrestre");
		}
	}
	
	public void dormir() {
		if (tipo.equalsIgnoreCase("acuatico")) {
			JOptionPane.showMessageDialog(null, "El animal suele dormir abajo de las aguas");
		}else if(tipo.equalsIgnoreCase("volador")) {
			JOptionPane.showMessageDialog(null, "El animal suele dormir en nidos de los arboles");
		}else {
			JOptionPane.showMessageDialog(null, "El animal suele dormir en tierra");
		}
	}

}
