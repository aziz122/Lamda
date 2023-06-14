package fr.codeonce.lamda;

public class Compte {

	int id;
	int solde;
	public Compte(int id, int solde) {
		super();
		this.id = id;
		this.solde = solde;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "compte [id=" + id + ", solde=" + solde + "]";
	}
	
}
