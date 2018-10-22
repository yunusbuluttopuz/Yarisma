package com.yarismasirketi.concrete;

import java.util.Scanner;

public class SoruSorucu {
	public void sorulariSor(Yarismaci yarismaci, Soru[] sorular) {
		Scanner keyboardInput = new Scanner(System.in);
		for(int i = 0; i < sorular.length; i++) {
			System.out.printf("%nSayin %s %d. sorunuz: '%s'%n%n", yarismaci.getIsim(), i+1, sorular[i].getSoruCumlesi());
			System.out.printf("A)%s B)%s C)%s", sorular[i].getSiklar()[0], sorular[i].getSiklar()[1], sorular[i].getSiklar()[2]);
			System.out.println("\tDogru oldugunu dusundugunuz sikki buyuk harfle yazınız:");
			String cevap = keyboardInput.nextLine();
			if(cevap.equals(sorular[i].getCevap())) {yarismaci.puaniArtir();}
		}
	}
}
