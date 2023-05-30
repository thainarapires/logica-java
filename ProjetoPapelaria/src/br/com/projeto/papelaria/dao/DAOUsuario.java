package br.com.projeto.papelaria.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.projeto.papelaria.dominio.Usuario;
import br.com.projeto.papelaria.repository.AtualizarApagar;

public class DAOUsuario extends Conexao implements AtualizarApagar<Usuario> {

	@Override
	public String cadastro(Usuario obj) {
		String msg = "";

		try {
			abrirBanco();
			String sql = "insert into usuario (nomeusuario, senha, nivelacesso) values (?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, obj.getNomeUsuario());
			pst.setString(2, obj.getSenha());
			pst.setString(3, obj.getNivelAcesso());

			int r = pst.executeUpdate();
			if (r > 0) {
				msg = "Usuário cadastrado";

			} else {
				msg = "Não foi possível cadastrar";
			}

		} catch (SQLException se) {
			msg = "Erro na consulta" + se.getMessage();
		} catch (Exception e) {
			msg = "Erro inesperado ->" + e.getMessage();

		} finally {
			fecharBanco();
		}
		return msg;

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
		
		try {
			abrirBanco();
			String sql = "Select * from usuario where nomeusuario=? and senha=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, usuario.getNomeUsuario());
			pst.setString(2, usuario.getSenha());		
			rs = pst.executeQuery();
				if(rs.next()) { 
					logou = true;
					System.out.println("logou");
				}
				else { 
					logou = false;
					System.out.println("nao logou");
				}
				
				} catch(SQLException se) {
					new Exception("Erro ao executar a consulta" + se.getMessage());
				}
			catch(Exception e) {
				new Exception("Erro inesperado" + e.getMessage());
			}
			finally {
				fecharBanco();
			}
		
		return logou;
	}

	public Boolean sair() {
		return true;
	}

}
