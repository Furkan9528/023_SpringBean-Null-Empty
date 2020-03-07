package com.furkankara;

public class Personel {
	String adi,soyadi,telNo,adres;
	String anneAdi, babaAdi;
	int dogumYili,maasi;
	boolean ehliyet, medeniHali;
	
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getAnneAdi() {
		return anneAdi;
	}
	public void setAnneAdi(String anneAdi) {
		this.anneAdi = anneAdi;
	}
	public String getBabaAdi() {
		return babaAdi;
	}
	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}
	public int getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	public int getMaasi() {
		return maasi;
	}
	public void setMaasi(int maasi) {
		this.maasi = maasi;
	}
	public boolean isEhliyet() {
		return ehliyet;
	}
	public void setEhliyet(boolean ehliyet) {
		this.ehliyet = ehliyet;
	}
	public boolean isMedeniHali() {
		return medeniHali;
	}
	public void setMedeniHali(boolean medeniHali) {
		this.medeniHali = medeniHali;
	}
	@Override
	public String toString() {
		return "Personel adi=" + adi +"\n"+ " soyadi=" + soyadi +"\n"+ " telNo=" + telNo +"\n"+ " adres=" + adres +"\n"+ " anneAdi="
				+ anneAdi +"\n"+ " babaAdi=" + babaAdi +"\n"+ " dogumYili=" + dogumYili +"\n"+ " maasi=" + maasi +"\n"+ " ehliyet="
				+ ehliyet +"\n"+ " medeniHali=" + medeniHali +"\n"+ "]";
	}
	
	
	
}
