
public class Main {

	public static void main(String[] args) {
		Evento evento1 = new Evento(1, "Barcelona vs Real Madrid", "2023-07-05", 5);
		
		Cliente cliente1 = new Cliente("Juan", "Fernandez", 20, "30321321");
		Cliente cliente2 = new Cliente("Maria", "Fernandez", 25, "31111222");
		Cliente cliente3 = new Cliente("Mariano", "Fernandez", 40, "32101101");		
		Cliente cliente4 = new Cliente("Jose", "Fernandez", 18, "29123123");		
		Cliente cliente5 = new Cliente("Ana", "Fernandez", 31, "32321321");
		Cliente cliente6 = new Cliente("Sebastian", "Fernandez", 20, "35122122");
		
		cliente1.comprarTicket(evento1);
		cliente2.comprarTicket(evento1);		
		cliente3.comprarTicket(evento1);
		cliente4.comprarTicket(evento1);
		cliente5.comprarTicket(evento1);
		cliente6.comprarTicket(evento1);
		
		cliente1.ingresarEvento(evento1);
		cliente2.ingresarEvento(evento1);
		cliente3.ingresarEvento(evento1);
		cliente4.ingresarEvento(evento1);
		cliente5.ingresarEvento(evento1);
		cliente6.ingresarEvento(evento1);
		
		
	}

}
