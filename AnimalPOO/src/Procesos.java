import java.util.HashMap;

import javax.swing.JOptionPane;

import animales.Animal;

public class Procesos {
	HashMap<Integer, Animal> mapaAnimal;

	public Procesos() {
		mapaAnimal = new HashMap<Integer, Animal>();
		iniciar();
	}

	private void iniciar() {
		String menu = "MENU\n";
		menu =  "1. Registrar Animal.\n";
		menu += "2. Consulta de Animal\n";
		menu += "3. Mostrar lista de animales\n";
		menu += "4. Salir";

		int opc = 0;

		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
			crearMenu(opc);
		} while (opc != 4);

	}

	private void crearMenu(int opc) {

		switch (opc) {
		case 1:
			construirAnimal();
			break;
		case 2:
			consultarAnimal();
			break;
		case 3:
			listaAnimal();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Gracias y adios");
			break;

		default:
			JOptionPane.showMessageDialog(null, "No existe el codigo");
			break;
		}

	}
	private void listaAnimal() {
		for (Animal animal : mapaAnimal.values()) {
			animal.mostrarInformacion();
		}

	}

	private void imprimirAnimal() {
		for (Animal animal : mapaAnimal.values()) {
			System.out.println(animal);
			animal.mostrarInformacion();
			animal.dormir();
			animal.comida();
			animal.atacar();
		}
	}

	private void construirAnimal() {
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de animales"));
		Animal animal;
		for (int i = 0; i < cant; i++) {
			animal = new Animal();
			int codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del animal"));
			animal.setCodigo(codigo);
			String tipo= JOptionPane.showInputDialog("Ingrese tipo del animal");
			animal.setTipo(tipo);
			String especie=JOptionPane.showInputDialog("Ingrese la especie del animal");
			animal.setEspecie(especie);
			String color=JOptionPane.showInputDialog("Ingrese el color del animal");
			animal.setColor(color);
			mapaAnimal.put(animal.getCodigo(), animal);
			System.out.println(mapaAnimal);
		}
		imprimirAnimal();
	}

	private void consultarAnimal() {
		int preg = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la mascota que desea buscar"));
		for (Animal animal : mapaAnimal.values()) {

			if (animal.getCodigo() == preg) {
				animal.mostrarInformacion();
			}

		}
	}
}
