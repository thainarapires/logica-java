package br.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Conexao {
	
	protected Connection con = null; 
	protected PreparedStatement pst = null; 
	protected ResultSet rs = null; 
	 
	@SuppressWarnings("deprecation")
	public void abrirConexao() { 
	 try { 
	 Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
	 
	 con =  DriverManager.getConnection("jdbc:mysql://10.26.44.221:6020/suportedb?usetimezone=true", "root",
						"123@senac");
	 } 
	 catch(SQLException se) { 
		 System.out.println("Erro ao estabelecer conexão -> " + se.getMessage());
	 se.printStackTrace(); 
	 } 
	 catch(Exception e) { 
		 System.out.println("Erro inesperado -> " + e.getMessage());
	 e.printStackTrace(); 
	 } 
	 } 
	 
	public void fecharConexao() { 
	 try { 
	 con.close(); 
	 } 
	 catch(SQLException se) { 
	 se.printStackTrace(); 
	 } 
	 catch(Exception e) { 
	 e.printStackTrace(); 
	 } 
	 } 
	} 
	

