package or.tiago.bancopoli.banco3;

import java.util.Collection;


public class User {
	private String nome;
	private String cpf;
	private String contaC;
	private String contaI;
	private String contaP;
	
	public static Collection<User> users;
	
	public User() {
		this.nome = Gen.generateName();
		this.cpf = Gen.generateCpf();
		users.add(this);
	}
	public static User search(String cpf) {
		User x = null;
		for(User user:users) {
			if(user.getCpf().equals(cpf)) {
				x = user;
			}
		}
		return x;
	}
	
	public String getNome() {
        return this.nome;
    }
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
        return this.cpf;
    }
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getContaC() {
        return this.contaC;
    }
	
	public void setContaC(String contaC) {
		this.contaC = contaC;
	}
	
	public String getContaI() {
        return this.contaI;
    }
	
	public void setContaI(String contaI) {
		this.contaC = contaI;
	}
	
	public String getContaP() {
        return this.contaP;
    }
	
	public void setContaP(String contaP) {
		this.contaP = contaP;
	}
	
	
}
