package Banco;

public abstract class Conta {
	
	private float saldo;
	private String numero;
	private String senha;
	private String titular;
	private String cpf;
	
	protected void setSaldo(float valor) {
		this.saldo = valor;
	}
	
	protected void setNumero(float numero) {
		this.saldo = numero;
	}
	
	
	protected void setSenha(String senha) {
		this.senha = senha;
	}
	
	protected void setTitular(String titular) {
		this.titular = titular;
	}
	
	protected void setCpf(String Cpf) {
		this.cpf = Cpf;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public abstract void depositar(float valor);
	
	public abstract void retirar(float valor);
	
	public void transferirPara(Conta outraConta, float valor) throws Exception{
		this.retirar(valor);
		outraConta.depositar(valor);
	}
}
