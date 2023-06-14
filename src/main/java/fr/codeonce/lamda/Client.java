package fr.codeonce.lamda;

import java.util.List;

public class Client {
	String name;
	List<Compte> comptes;
	public Client(String name, List<Compte> comptes) {
		super();
		this.name = name;
		this.comptes = comptes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	

}
