
public class Evento {

	private int numero;
	private String titulo;
	private String fecha;
	private int cupo;
	private int siguienteTicket = 1;
	
	public Evento(int numero, String titulo, String fecha, int cupo) {
		this.numero = numero;
		this.titulo = titulo;
		this.fecha = fecha;
		this.cupo = cupo;
	}
	
	public Ticket generarTicket(String dni) {
		if (this.siguienteTicket > this.cupo) {
			return null;
		} else {
			Ticket nuevoTicket = new Ticket(this.siguienteTicket, dni);
			this.siguienteTicket++;
			return nuevoTicket;
		}
	}

	public String bienvenida() {
		return "Bienvenid@ a " + this.titulo;
	}
	
	public String rechazo() {
		return "Usted no posee un ticket valido";
	}	
	
}
