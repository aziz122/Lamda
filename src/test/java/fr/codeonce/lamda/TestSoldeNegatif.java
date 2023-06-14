package fr.codeonce.lamda;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;	
import org.junit.jupiter.api.Test;

public class TestSoldeNegatif {
	@Test
	public void testSolde() {
		Compte c1=new Compte(1,12);
		Compte c2=new Compte (2,13);
		Compte c3=new Compte(3, -12);
		clientexemple c=new clientexemple();
		List<Compte> lc=new ArrayList<>();
		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
		List<Client> lclient=new ArrayList<>();
		Client cc1=new Client("aziz",lc);
		Client cc2=new Client("brahim",lc);
		
		lclient.add(cc1);
		lclient.add(cc2);
		long testsize=c.soldenegatif(lclient);
		assertEquals(4,testsize);
	}

}
