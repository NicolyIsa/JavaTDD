package javabanco.entidade;

import java.util.ArrayList;



public class ContaCorrente {
	private int _Numero;
	private String _Titular;
	private float _Saldo = 0;
	private ArrayList<Float> _operacoes = new ArrayList<Float>();
	
	
	
	public ContaCorrente(int Numero, String Titular) {
		_Numero = Numero;
		_Titular = Titular;
	}
	public float Saldo(){
		return _Saldo;
	}
	
	public float Credito(float valor) {
		if (valor <= 0) throw new IllegalArgumentException("O valor da operacao deve ser maior que zero");
		_Saldo += valor;
		_operacoes.add(valor);
		return _Saldo;
	}
	
	public float Debito(float valor) {
		if (valor <= 0) throw new IllegalArgumentException("O valor da operacao deve ser maior que zero");
		_Saldo -= valor;
		_operacoes.add(-valor);
		return _Saldo;
	}
	
	public ArrayList<Float> Extrato() {
		return _operacoes;
	}
	
	public int getNumero() {
		return _Numero;
	}
	
	public String getTitular(){
		return _Titular;
	}
	
	public float Transferencia (float valor , ContaCorrente ccDestino){
		this.Debito(valor);
		ccDestino.Credito(valor);
		return _Saldo;
	}
}