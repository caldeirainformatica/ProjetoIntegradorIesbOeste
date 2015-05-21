package model;

import javax.swing.JOptionPane;

public class VendasItem {

	private int quantidade;
	private double valorItem;
	private double valorTotal;

	public int getQuantidade() {
		return quantidade;
	}

	public double getValorItem() {
		return valorItem;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	JOptionPane.showMessageDialog(null, this.valorItem);
	JOptionPane.showMessageDialog(null, valorItem);
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
