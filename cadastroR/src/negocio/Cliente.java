package negocio;

public class Cliente {
	private String nome;
	private String checkin;
	
	public Cliente(String nome, String checkin) {
		this.nome=nome;
		this.checkin=checkin;
	}
	
	public Cliente() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	
	
}
