package fr.codeonce.lamda;

import java.util.ArrayList;
import java.util.List;



public class clientexemple {
	
	public long soldenegatif(List<Client> lc) {
		List<compte> lcompte=new ArrayList<>();
		
		for (Client client : lc) {
			lcompte.add(client.getCompte());
		}
		
		lcompte.forEach(System.out::print);
		
	long listsize	=lcompte.stream().filter(c-> c.getSolde() >0).count();
		
		
		return listsize;
		
	}
	

}
