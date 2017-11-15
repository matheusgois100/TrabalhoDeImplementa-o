
public class Palestrante {
	private String nome;
	private String telefone;
	private String email;
	
	public Palestrante(String nome, String email,String telefone) {
		super();
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
	}

	String getTelefone() {
		return telefone;
	}

	String getEmail() {
		return email;
	}

	String getNome() {
		return nome;
	}

}
