
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ParticipanteCreator {
	public static void participante() {
	
	Scanner c;
	try {
		c = new Scanner(new File("C:/Users/mathe/workspace/TrabalhoAlgoritmos/data/participantes.csv"));
		c.useDelimiter("[,\n]");
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado.");
		return;
	}
	System.out.println("\nPARTICIPANTES");
	while (c.hasNext()) {
		Evento.participante = new Participante(c.next(),c.next());
		
		System.out.print("\nNome: "+Evento.participante.getNome()+" - Email: "+Evento.participante.getEmail());
		
	}
	
	c.close();
}

}
