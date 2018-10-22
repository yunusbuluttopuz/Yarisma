package com.yarismasirketi.concrete;

public class OyunController {
	
	public void basla() {
		
		SoruYaratici mySoruYaratici = new SoruYaratici();
		Soru[] mySorular = mySoruYaratici.sorulariYarat();
		
		YarismaciYaratici myYarismaciYaratici = new YarismaciYaratici();
		Yarismaci myYarismaci = myYarismaciYaratici.yarismaciYarat();
		
		SoruSorucu mySoruSorucu = new SoruSorucu();
		mySoruSorucu.sorulariSor(myYarismaci, mySorular);
		
		SonucAciklayici mySonucAciklayici = new SonucAciklayici();
		mySonucAciklayici.sonucuAcikla(myYarismaci);
		
	}
}
