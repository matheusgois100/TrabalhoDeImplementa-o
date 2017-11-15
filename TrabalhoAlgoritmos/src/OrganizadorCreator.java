import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrganizadorCreator {
	public static void organizador() {
	Scanner c;
	try {
		c = new Scanner(new File("C:/Users/mathe/workspace/TrabalhoAlgoritmos/data/Organizador.csv"));
		c.useDelimiter("[,\n]");
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado.");
		return;
	}
	System.out.println("\nORGANIZADOR DO EVENTO");
	while (c.hasNext()) {
		Evento.organizador = new Organizador(c.next(),c.next());
		System.out.print("Nome: "+Evento.organizador.getNome()+" - Email: "+Evento.organizador.getEmail());
		System.out.println("");
	}
	
	c.close();
}
}
