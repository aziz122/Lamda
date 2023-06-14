package fr.codeonce.lamda;

public class Client {
	String name;
	compte Compte;
	public Client(String name, compte compte) {
		super();
		this.name = name;
		Compte = compte;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public compte getCompte() {
		return Compte;
	}
	public void setCompte(compte compte) {
		Compte = compte;
	}
	
	

}
