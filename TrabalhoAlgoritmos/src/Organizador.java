
public class Organizador {
	private String nome;
	private String email;
	
	
	
	
	public Organizador(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public boolean hasNext() {
		return false;
	}
	
}
