package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	 public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
	        super(nombre, edad, "Portero");
	        this.golesRecibidos = golesRecibidos;
	        this.dorsal = dorsal;
	 }
	 
	 public short getGolesRecibidos() {
		 return this.golesRecibidos;
	 }

	 public byte getDorsal() {
		 return this.dorsal;
	 }

	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	 
	public String toString() {
		String s= "El futbolista " + this.getNombre() + 
				" tiene " + this.getEdad() + 
				", y juega de " + this.getPosicion() +
				" con el dorsal " + this.getDorsal() +
				". Le han marcado " + this.getGolesRecibidos();
		return s;
	}
	
	@Override
	public int compareTo(Object o) {
	    return Math.abs(this.getGolesRecibidos() - ((Portero)o).getGolesRecibidos());
	}
}
