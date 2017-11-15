import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalestraCreator {
	public static void palestra() {
	Scanner c;
	
	try {
		c = new Scanner(new File("C:/Users/mathe/workspace/TrabalhoAlgoritmos/data/palestras.csv"));
		c.useDelimiter("[,\n]");
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado.");
		return;
	}
	System.out.println("\nPALESTRAS");
	while (c.hasNext()) {
		Evento.palestra = new Palestra(c.next(),c.next(),c.next(),c.next());
		System.out.print("Título: "+Evento.palestra.getTitulo()+
				"\nDescrição: "+Evento.palestra.getResumo()+
				"\nPalestrante: "+Evento.palestra.getPalestrante()+
				" - Sala: "+Evento.palestra.getSala());;
				System.out.println("");
	}
	
	c.close();
}
}
