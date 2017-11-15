import java.util.Scanner;

public class Evento {
	private static Scanner t = new Scanner(System.in);
	static Organizador organizador;
	static Salas sala;
	static Participante participante;
	static Palestrante palestrante;
	static Palestra palestra;
	
	public static void main(String[] args) {
		
		    OrganizadorCreator.organizador();
			PalestranteCreator.palestrante();
			ParticipanteCreator.participante();
			PalestraCreator.palestra();
		} 
	}
	
