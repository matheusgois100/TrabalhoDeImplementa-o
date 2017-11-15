import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SalaCreator {
	public static void salas() {
	Scanner c;
	try {
		c = new Scanner(new File("C:/Users/mathe/workspace/TrabalhoAlgoritmos/data/salas.csv"));
		c.useDelimiter("[,\n]");
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado.");
		return;
	}
	
	while (c.hasNext()) {
		Evento.sala = new Salas(c.next());
		System.out.print("Número da sala: "+Evento.sala.getNumeroSala());
	}
	
	c.close();
}
}


