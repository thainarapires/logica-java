package br.com.projeto.papelaria.teste;

import br.com.projeto.papelaria.dao.DAOContato;
import br.com.projeto.papelaria.dominio.Contato;

public class TesteObjeto {

	public static void main(String[] args) {
		Contato ct = new Contato();

		ct.setTelefone("11959192569");
		ct.setEmail("exemplo@mail.com");

		DAOContato dc = new DAOContato();

		System.out.println(dc.cadastro(ct));
	}

}
