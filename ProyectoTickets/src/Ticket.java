
public class Ticket {

	private int numero;
	private String dni;
	private String estado;
	
	public Ticket(int numero, String dni) {
		this.numero = numero;
		this.dni = dni;
		this.estado = "sin usar";
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.numero);
	}

	public boolean corroborarTicket(String dni) {
		if (this.estado.equals("sin usar") && dni.equals(this.dni)) {
			this.estado = "usado";
			return true;
		}
		return false;
	}
}
