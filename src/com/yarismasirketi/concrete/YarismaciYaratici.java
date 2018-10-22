package com.yarismasirketi.concrete;

import java.util.Scanner;

public class YarismaciYaratici {
	
	public Yarismaci yarismaciYarat() {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Yarismacinin ismini, memleketini ve yasini sirasiyla giriniz\n(Her giriden sonra enter'a basin)");		
		Yarismaci yeniYarismaci = new Yarismaci(keyboardInput.nextLine(), keyboardInput.nextLine(), keyboardInput.nextInt());
		return yeniYarismaci;		
	}	
}
