package com.yarismasirketi.concrete;

public class Yarismaci {
	private String isim;
	private String memleket;
	private int yas;
	private int puan = 0;
	
	public Yarismaci(String isim, String memleket, int yas) {
		this.isim = isim;
		this.memleket = memleket;
		this.yas = yas;
	}
	
	public int getPuan() {
		return puan;
	}
	
	public void puaniArtir() {
		puan += 20;
	}
	
	public String getIsim() {
		return this.isim;
	}
	
	public String getMemleket() {
		return this.memleket;
	}
	
	public int getYas() {
		return this.yas;
	}
	
}
