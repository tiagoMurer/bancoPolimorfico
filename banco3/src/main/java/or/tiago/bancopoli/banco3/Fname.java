//LISTA DE NOMES PARA O GERADOR DE NOMES
package or.tiago.bancopoli.banco3;

public enum Fname {
	
	A("Joao"),
	B("Pedro"),
	C("Tiago"),
	D("Mariana"),
	E("Roberta"),
	F("Renato"),
	G("Rafaela"),
	H("Joana"),
	I("Ricardo"),
	J("Elza"),
	K("Jordana"),
	L("Rosangela"),
	M("Sidnei"),
	N("Gabriel"),
	O("Daniel"),
	P("Robson"),
	Q("Napoleao");
	
	public String name;
	
	Fname(String fn){
		this.name = fn;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}
