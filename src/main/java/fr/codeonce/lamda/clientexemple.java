package fr.codeonce.lamda;


import java.util.List;



public class clientexemple {
	
	public long soldenegatif(List<Client> lc) {
		
		return lc.stream().flatMap(client-> client.getComptes().stream())
		
		.filter(compte->compte.getSolde()>0)
		.count();
		
		
	

}
}
