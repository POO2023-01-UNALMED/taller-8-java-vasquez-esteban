package futbol;

public abstract class Futbolista implements Comparable<Object>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	@Override
	public String toString() {
		String s="El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion();
		return s;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}
	
	public boolean equals(Futbolista f) {
		boolean b = false;
		
		if (this==f) {
			b = true;
		}
		
		return b;
	}
	
	public abstract boolean jugarConLasManos();
	
	public abstract int compareTo(Object o);
}
