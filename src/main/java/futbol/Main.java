package futbol;

public class Main {

	public static void main(String[] args) {
		Portero f1 = new Portero("Antonio", 23, (short) 6, (byte) 1);
		Portero f2 = new Portero("Santiago", 23, (short) 15, (byte) 8);
		
		System.out.println(f1.compareTo(f2));
	}

}
