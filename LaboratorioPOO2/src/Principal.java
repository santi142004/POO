
public class Principal {
	
	Flecha flecha1, flecha2, flecha3, flecha4;

	public static void main(String[] args) {
		Principal miPrincipal = new Principal();
	}
	
	public Principal() {
		flecha1=new Flecha();
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();
		
		flecha2=new Flecha();
		flecha2.longitud=15;
		flecha2.color="rojo";
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3=new Flecha();
		flecha3.longitud=8;
		flecha3.color="azul";
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
		
		flecha4=new Flecha();
		flecha4.longitud=20;
		flecha4.color="verde";
		flecha4.construirFlecha();
		flecha4.imprimirEspacio();
	}

}
