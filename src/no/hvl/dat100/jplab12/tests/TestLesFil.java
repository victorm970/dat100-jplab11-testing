package no.hvl.dat100.jplab12.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;
import no.hvl.dat100.jplab12.oppgave3.Blogg;
import no.hvl.dat100.jplab12.oppgave5.LesFil;

public class TestLesFil {

	private static String FILNAVN = "bloggcorrect.dat";
	
	@Test
	public void testles() {
		
		Blogg samling = LesFil.les(FILNAVN);

		Tekst innlegg1 = new Tekst(1,"Ole Olsen","23-10-2019","en tekst");
		Bilde innlegg2 = new Bilde(2,"Oline Olsen","24-10-2019","http://www.picture.com/oo.jpg");
		
		assertEquals(samling.getAntall(),2);
		assertTrue(samling.finnes(innlegg1));
		assertTrue(samling.finnes(innlegg2));
		
		System.out.println(samling.toString());
	}
	
}