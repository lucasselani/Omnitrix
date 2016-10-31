package model;
import java.util.ArrayList;

public class Gerenciador extends Usuario implements GerenciamentoAlienigenas{

	public Gerenciador(String nome, int idade, String sexo, int id, String senha) {
		super(nome, idade, sexo, id, senha);
	}

	@Override
	public ArrayList<Alien> consultarAlien() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarAlien() {
		// TODO Auto-generated method stub
		
	}	
	
	
}
