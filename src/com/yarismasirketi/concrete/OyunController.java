package com.yarismasirketi.concrete;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OyunController {
	private Yarismaci yarismaci;
	
	public void oyunuBaslat() {
		yarismaci = yarismaciYarat();
		soruCevap(yarismaci);
		sonuc(yarismaci);		
	}
	
	private void soruCevap(Yarismaci yarismaci) {
		Scanner keyboardInput = new Scanner(System.in);
		String cevap;
		
		for(int n = 0; n < SoruListesi.sorular.length; n++) {
			System.out.printf("%n%d. soru: %s%n", n+1, SoruListesi.sorular[n]);
			cevap = keyboardInput.nextLine();
			if(cevap.equals(SoruListesi.cevaplar[n])) {
				System.out.println("Dogru cevap!");
				yarismaci.puaniArtir();
			}
			else {
				System.out.println("Yanlis cevap!");				
			}			
		}
	}	
	
	private Yarismaci yarismaciYarat() {
		Scanner keyboardInput = new Scanner(System.in);		
		System.out.println("Isminizi, memleketinizi "
				+ "ve yasinizi sirayla girin(her giristen sonra enter'a basin):");
		Yarismaci yeniYarismaci = new Yarismaci(keyboardInput.nextLine()
				, keyboardInput.nextLine(), keyboardInput.nextInt());
		return yeniYarismaci;
	}
	
	private void sonuc(Yarismaci yarismaci) {
		System.out.println("\nYarisma bitti!");
		System.out.printf("Yarismaya %s ilinden katilan %d yasindaki sayin %s %d puanla yarismayi tamamladi.%n"
				,yarismaci.getMemleket(), yarismaci.getYas(), yarismaci.getIsim(), yarismaci.getPuan());
		System.out.printf("Tebrikler sayin %s!%n", yarismaci.getIsim());
	}

}
