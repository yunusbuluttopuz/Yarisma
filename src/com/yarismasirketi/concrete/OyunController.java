package com.yarismasirketi.concrete;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OyunController {
	
	public void basla() {
		
		SoruYaratici mySoruYaratici = new SoruYaratici();
		Soru[] sorular = mySoruYaratici.sorulariYarat();
		
		YarismaciYaratici myYarismaciYaratici = new YarismaciYaratici();
		Yarismaci myYarismaci = myYarismaciYaratici.yarismaciYarat();
	}
	
	
	

}
