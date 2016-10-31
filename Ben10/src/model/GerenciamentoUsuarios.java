package model;
import java.util.ArrayList;

public interface GerenciamentoUsuarios {
	ArrayList<Usuario> consultarUsuario();
	void editarUsuario();
	void excluirUsuario();
}
