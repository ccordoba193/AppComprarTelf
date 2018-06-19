package com.AppComprarTelf.misclases;

public class Cellphone {
	private String sMarca;
	private String sModelo;
	private String sCpu;
	private String sGpu;
	private Float fPantalla;
	private Float fCamfrontMP;
	private Float fCambackMP;
	private int iMahBat;
	private String sSo;
	
	//Constructors
	public Cellphone() {}
	
	public Cellphone(String sMarca, String sModelo,String sCpu,String sGpu,Float fPantalla,Float fCamfrontMP,Float fCambackMP, int iMahBat, String sSo) {
	
		this.sMarca = sMarca;
		this.sModelo = sModelo;
		this.sCpu = sCpu;
		this.sGpu = sGpu;
		this.fPantalla = fPantalla;
		this.fCamfrontMP = fCamfrontMP;
		this.fCambackMP = fCambackMP;
		this.iMahBat = iMahBat;
		this.sSo = sSo;
	}
	
	
	//================sMarca==================//
	public String get_sMarca() {
		return sMarca;
	}
	public void set_sMarca(String sMarca) {
		this.sMarca = sMarca;
	}
	
	//================sModelo==================//
	public String get_sModelo() {
		return sModelo;
	}
	public void set_sModelo(String sModelo) {
		this.sModelo = sModelo;
	}
	
	//================sCpu==================//
	public String get_sCpu() {
		return sCpu;
	}
	public void set_sCpu(String sCpu) {
		this.sCpu = sCpu;
	}
	
	//================sGpu==================//
	public String get_sGpu() {
		return sGpu;
	}
	public void set_sGpu(String sGpu) {
		this.sGpu = sGpu;
	}	
	
	//================fPantalla==================//
	public Float get_fPantalla() {
		return fPantalla;
	}
	public void set_fPantalla(Float fPantalla) {
		this.fPantalla = fPantalla;
	}
	
	//================fCamfrontMP==================//
	public Float get_fCamfrontMP() {
		return fCamfrontMP;
	}
	public void set_fCamfrontMP(Float fCamfrontMP) {
		this.fCamfrontMP = fCamfrontMP;
	}
	
	//================fCambackMP==================//
	public Float get_fCambackMP() {
		return fCambackMP;
	}
	public void set_fCambackMP(Float fCambackMP) {
		this.fCambackMP = fCambackMP;
	}
	
	//================iMahBat==================//
	public int get_iMahBat() {
		return iMahBat;
	}
	public void set_iMahBat(int iMahBat) {
		this.iMahBat = iMahBat;
	}
	
	//================sCpu==================//
	public String get_sSo() {
		return sSo;
	}
	public void set_sSo(String sSo) {
		this.sSo = sSo;
	}
}
