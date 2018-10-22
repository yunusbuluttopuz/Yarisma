package com.yarismasirketi.concrete;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OyunController {
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	private Yarismaci yarismaciYarat() {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Yarismacinin ismini, memleketini ve yasini sirasiyla giriniz\n(Her giriden sonra enter'a basin)");		
		Yarismaci yeniYarismaci = new Yarismaci(keyboardInput.nextLine(), keyboardInput.nextLine(), keyboardInput.nextInt());
		return yeniYarismaci;
		
	}	
	
	private Soru[] sorulariYarat() {
		Soru[] sorular = new Soru[SoruListesi.sorular.length];
		for(int i = 0; i < SoruListesi.sorular.length; i++) {
			sorular[i] = new Soru(SoruListesi.sorular[i], SoruListesi.siklar[i], SoruListesi.cevaplar[i]);
		}		
		return sorular;
	}

}
