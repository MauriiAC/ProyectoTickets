
public class Cliente {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private Ticket ticket;
	
	public Cliente(String nombre, String apellido, int edad, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	public void comprarTicket(Evento evento) {
		this.ticket = evento.generarTicket(this.dni);
		if (ticket != null) {
			System.out.println("Su numero de ticket es " + ticket);
		} else {
			System.out.println("Ya no hay tickets disponibles");
		}
	}
	
	public void ingresarEvento(Evento evento) {
		if (ticket == null) {
			System.out.println("No posee ticket para el evento");
		} else {
			boolean ingreso = ticket.corroborarTicket(this.dni);
			if (ingreso) {
				System.out.println(evento.bienvenida());
			} else {
				System.out.println(evento.rechazo());
			}
		}
	}
}
