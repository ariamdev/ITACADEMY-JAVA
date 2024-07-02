package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge {
	//implementi les interfícies "Camera" i "Rellotge".
	
	public Smartphone (String marca, String model) {
		super(marca,model);
	}
	
	public void fotografiar() {
		System.out.println("S'està fent una foto");
	}
	
	public void alarma() {
		System.out.println("Està sonant l'alarma");
	}
	
}
