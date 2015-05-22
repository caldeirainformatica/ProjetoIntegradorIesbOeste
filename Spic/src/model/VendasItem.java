package model;

import javax.swing.JOptionPane;

import view.FrmVendasItem;

public class VendasItem {

	private int quantidade;
	private double valorItem;
	private double valorTotal;

	public int getQuantidade() {
		return quantidade;
	}

	public double getValorItem() {
		FrmVendasItem vendas = new FrmVendasItem();
		vendas.setVisible(true);
		vendas.valorItem(valorItem);
		vendas.setResizable(false);

		return valorItem;
		
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setValorItem(double valorItem) {
		if (valorItem >=0){
		this.valorItem = valorItem;
		getValorItem();
		}
//	JOptionPane.showMessageDialog(null, this.valorItem);
	JOptionPane.showMessageDialog(null, "setvalor "+valorItem);
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
