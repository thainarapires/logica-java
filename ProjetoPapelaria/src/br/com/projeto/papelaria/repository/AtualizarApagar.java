package br.com.projeto.papelaria.repository;

public interface AtualizarApagar<T> extends CadastroConsulta<T> {
	String atualizar(T obj);

	String apagar(T obj);

}
