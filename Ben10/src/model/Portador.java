package model;
import java.util.ArrayList;

public class Portador extends Usuario implements GerenciamentoUsuarios, GerenciamentoAlienigenas{

	public Portador(String nome, int idade, String sexo, int id, String senha) {
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

	@Override
	public ArrayList<Usuario> consultarUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarUsuario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirUsuario() {
		// TODO Auto-generated method stub
		
	}
	
	

}
