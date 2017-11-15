import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalestranteCreator {
	public static void palestrante() {

	Scanner c;
	try {
		c = new Scanner(new File("C:/Users/mathe/workspace/TrabalhoAlgoritmos/data/palestrantes.csv"));
		c.useDelimiter("[,\n]");
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado.");
		return;
	}
	System.out.println("\nPALESTRANTES");
	while (c.hasNext()) {
		Evento.palestrante = new Palestrante(c.next(),c.next(),c.next());
		
		System.out.println("Nome: "+Evento.palestrante.getNome()+" - Email: "+Evento.palestrante.getEmail()+" - Telefone: "+Evento.palestrante.getTelefone());
	}
	
	c.close();
}
}
