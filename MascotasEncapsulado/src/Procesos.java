import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	HashMap<Integer, Mascota> mapaMascota;

	public Procesos() {
		mapaMascota = new HashMap<Integer, Mascota>();
		iniciar();
	}

	private void iniciar() {
		String menu = "MENU\n";
		menu = "1. Registrar Mascotas.\n";
		menu += "2. Consulta de mascotas\n";
		menu += "3. Mostrar lista de mascotas\n";
		menu += "4. Actualizar mascota\n";
		menu += "5. Salir";

		int opc = 0;

		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
			crearMenu(opc);
		} while (opc != 5);

	}

	private void crearMenu(int opc) {

		switch (opc) {
		case 1:
			construirMascotas();
			break;
		case 2:
			consultarMascota();
			break;
		case 3:
			listaMascota();
			break;
		case 4:
			actualizar();

			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Gracias y adios");
			break;

		default:
			JOptionPane.showMessageDialog(null, "No existe el codigo");
			break;
		}

	}

	private void actualizar() {
		
		int cod =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la mascota que desea actualizar"));
		
		for (Mascota mascota : mapaMascota.values()) {

			if (mascota.getCodigo() == cod) {
				mascota.actualizar();
			}

		}
		
		
	}

	private void listaMascota() {
		for (Mascota mascota : mapaMascota.values()) {
			mascota.mostrarInformacion();
		}

	}

	private void imprimirMascotas() {
		for (Mascota mascota : mapaMascota.values()) {
			System.out.println(mascota);
			mascota.mostrarInformacion();
			mascota.hacerSonido();
			mascota.comida();
			mascota.atacar();
		}
	}

	private void construirMascotas() {
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de mascotas"));
		Mascota mascota;
		for (int i = 0; i < cant; i++) {
			mascota = new Mascota();
			int codigo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de su mascota"));
			mascota.setCodigo(codigo);
			String nombre= JOptionPane.showInputDialog("Ingrese nombre de la mascota");
			mascota.setNombre(nombre);
			String especie=JOptionPane.showInputDialog("Ingrese especie de la mascota");
			mascota.setEspecie(especie);
			int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad de la mascota"));
			mascota.setEdadi(edad);
			mapaMascota.put(mascota.getCodigo(), mascota);
			System.out.println(mapaMascota);
		}
		imprimirMascotas();
	}

	private void consultarMascota() {
		int preg = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la mascota que desea buscar"));
		for (Mascota mascota : mapaMascota.values()) {

			if (mascota.getCodigo() == preg) {
				mascota.mostrarInformacion();
			}

		}
	}

}