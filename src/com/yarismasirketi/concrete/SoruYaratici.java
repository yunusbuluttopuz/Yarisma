package com.yarismasirketi.concrete;

public class SoruYaratici {
	
	public Soru[] sorulariYarat() {
		Soru[] sorular = new Soru[SoruListesi.sorular.length];
		for(int i = 0; i < SoruListesi.sorular.length; i++) {
			sorular[i] = new Soru(SoruListesi.sorular[i], SoruListesi.siklar[i], SoruListesi.cevaplar[i]);
		}		
		return sorular;
	}
}
