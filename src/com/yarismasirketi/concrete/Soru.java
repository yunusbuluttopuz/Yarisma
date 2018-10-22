package com.yarismasirketi.concrete;

public class Soru {
	private final String soruCumlesi;
	private final String[] siklar;
	private final String cevap;
	
	public Soru(String soruCumlesi, String[] siklar, String cevap) {
		super();
		this.soruCumlesi = soruCumlesi;
		this.siklar = siklar;
		this.cevap = cevap;
	}

	public String getSoruCumlesi() {
		return soruCumlesi;
	}

	public String[] getSiklar() {
		return siklar;
	}

	public String getCevap() {
		return cevap;
	}

}
