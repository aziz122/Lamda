package fr.codeonce.lamda;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;	
import org.junit.jupiter.api.Test;

public class TestSoldeNegatif {
	@Test
	public void testSolde() {
		compte c1=new compte(1,12);
		compte c2=new compte (2,13);
		compte c3=new compte(3, -12);
		clientexemple c=new clientexemple();
		List<compte> lc=new ArrayList<>();
		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
		List<Client> lclient=new ArrayList<>();
		Client cc1=new Client("aziz",c1);
		Client cc2=new Client("brahim",c2);
		Client cc3=new Client("ayoub",c3);
		lclient.add(cc1);
		lclient.add(cc2);
		lclient.add(cc3);
		long testsize=c.soldenegatif(lclient);
		assertEquals(2,testsize);
	}

}
