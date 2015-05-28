package model;

public class ModeloVendas {
	private int idVendas;
	private String data;
	private float valorVenda;
	private String nomeCliente;
	private String nomeProduto;
	private int quantidadeItem;
	public int getIdVendas() {
		return idVendas;
	}
	public void setIdVenda(int idVendas) {
	//	JOptionPane.showMessageDialog(null, idVendas);
		this.idVendas = idVendas;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidadeItem() {
		return quantidadeItem;
	}
	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	


}
