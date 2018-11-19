package or.tiago.bancopoli.banco3;

import java.util.Collection;

public abstract class Conta {
	
	private float saldo;
	protected String numero;
	protected User titular;
	protected AccTipo tipo;
	
	private static Collection<Conta> accs;
	
	public static Conta search(String numero) {
		Conta x = null;
		for(Conta acc:accs) {
			if(acc.getNumero().equals(numero)) {
				x = acc;
			}
		}
		return x;
	}
	
	
	protected void setSaldo(float valor) {
		this.saldo = valor;
	}
	
	protected void setTitular(User titular) {
		this.titular = titular;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public User getTitular() {
		return this.titular;
	}
	
	public abstract void depositar(float valor);
	
	public void sacar(float valor){
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public void transferir(Conta recebedor, float valor) {
		this.sacar(valor);
		recebedor.depositar(valor);
	}

}
