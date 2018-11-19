package or.tiago.bancopoli.banco3;

import java.util.Random;

public class Gen {
	public static String generateCpf() {
		String cpf = "";
		Random r = new Random();
		int n;
		for(int i = 0; i < 12; i++) {
			n = r.nextInt(10);
			cpf += n;
		}
		return cpf;
	}
	
	public static String generateAccNum() {
		String num = "";
		Random r = new Random();
		int n;
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 4; i++) {
				n = r.nextInt(10);
				num = num + n;
			}
			num += " ";
		}
		num = num.substring(0, num.length() - 1);
		return num;
	}
	
	public static String generateName() {
	
		Random r = new Random();
		Fname[] names = Fname.values();
		Lname[] lastnames = Lname.values();
		Fname n = names[r.nextInt(names.length)];
		Lname s = lastnames[r.nextInt(lastnames.length)];
		String completename = n.toString() + s.toString();
		return completename;
	}
	
}
