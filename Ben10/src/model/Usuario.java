package model;

public class Usuario {
	private String nome;
	private int idade;
	private String sexo;
	private int id;
	private String senha;	
	
	public Usuario(String nome, int idade, String sexo, int id, String senha) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.id = id;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
