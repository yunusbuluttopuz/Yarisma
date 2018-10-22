package com.yarismasirketi.concrete;

public class SonucAciklayici {
	public void sonucuAcikla(Yarismaci yarismaci) {
		System.out.printf("%nYarismamiza %s ilinden katilan %d yasindaki sayın %s %d puanla yarismamizi tamamladi.%nTebrikler sayin %s!%n"
				, yarismaci.getMemleket(), yarismaci.getYas(), yarismaci.getIsim(), yarismaci.getPuan(), yarismaci.getIsim());
	}
}
