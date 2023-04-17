package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public short getGolesMarcados() {
	    return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
	    this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
	    return dorsal;
	}

	public void setDorsal(byte dorsal) {
	    this.dorsal = dorsal;
	}
	
	@Override
	public String toString() {
		String s="El futbolista " + this.getNombre() + " "
				+ "tiene " + this.getEdad() + 
				", y juega de " + this.getPosicion() + " con el dorsal " + this.getDorsal() + 
				". Ha marcado " + this.getGolesMarcados();
		return s;
	}
	
	@Override
	public int compareTo(Object o) {
	    return Math.abs(this.getEdad() - ((Futbolista)o).getEdad());
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}
}
