package tr.edu.medipol.yazilimaraclari.AhmetDural;

import org.junit.*;

import tr.edu.medipol.yazilimaraclari.AhmetDural.MuhasebeProgrami.Ucret;

import static org.junit.Assert.*;

public class MuhasebeProgramiTest {

	@Test
	public void TestUcretHesapla() {
		
		int sure = 8;
		int saatlikUcret = 15;
		
		Ucret ucretSonuc = MuhasebeProgrami.ucretHesapla(sure, saatlikUcret);
	
		Assert.assertEquals(120, ucretSonuc);
	
	}

}
