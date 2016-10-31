package model;

public class Alien {
	private String nome;
	private String descricao;
	private String[] vulnerabilidade;
	private String[] pontosFortes;
	
	public Alien(String nome, String descricao, String[] vulnerabilidade, String[] pontosFortes) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.vulnerabilidade = vulnerabilidade;
		this.pontosFortes = pontosFortes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String[] getVulnerabilidade() {
		return vulnerabilidade;
	}

	public void setVulnerabilidade(String[] vulnerabilidade) {
		this.vulnerabilidade = vulnerabilidade;
	}

	public String[] getPontosFortes() {
		return pontosFortes;
	}

	public void setPontosFortes(String[] pontosFortes) {
		this.pontosFortes = pontosFortes;
	}	
	
}
