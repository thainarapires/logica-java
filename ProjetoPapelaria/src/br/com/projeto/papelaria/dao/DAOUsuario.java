package br.com.projeto.papelaria.dao;

import java.util.List;

import br.com.projeto.papelaria.dominio.Usuario;
import br.com.projeto.papelaria.repository.AtualizarApagar;

public class DAOUsuario implements AtualizarApagar<Usuario> {

	@Override
	public String cadastro(Usuario obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> consulta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> consulta(Usuario obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualizar(Usuario obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apagar(Usuario obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Boolean logar(Usuario usuario) {
	Boolean logou = true;
	return logou;
}
	public Boolean sair() {
		return true;
	}

	
}
