package br.com.projeto.papelaria.dominio;

public class ItensPedidos {

	private Long idItensPedidos;
	private Pedido pedido;
	private Produto produto;
	private Double desconto;
	private int quantidade;
	private Double precoTotal;
	
	
	public Long getIdItensPedidos() {
		return idItensPedidos;
	}
	public void setIdItensPedidos(Long idItensPedidos) {
		this.idItensPedidos = idItensPedidos;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}
}
	
	