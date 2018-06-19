package com.AppComprarTelf.main;

import com.AppComprarTelf.misclases.Cellphone;

public class AppComprarTelf {
	
	//---------------------------------------------------------------------------------------------------------//
	
	
	public static void showStringln(String sCadenita) {
		System.out.println(sCadenita);
	}
	public static void showInt(int iEnterito) {
		System.out.println(iEnterito);
	}
	public static void showFloat(Float iFloatcito) {
		System.out.println(iFloatcito);
	}
	public static void main(String[] args) {
		
		//Cellphones objCellphone = new Cellphones();
		
		showStringln("Hello!");
		
		
		
		
		
		
		
		
		
		
		Cellphone telefonito = new Cellphone("Huawei", "hi6210sft", "Octa-core 1.2 Ghz", "Mali 400", 5.00f, 8.0f, 8.0f, 2500, "Jelly beam");
		
		
		showStringln("Marca: " +telefonito.get_sMarca());
		showStringln("Modelo: " +telefonito.get_sModelo());
		showStringln("CPU: " +telefonito.get_sCpu());
		showStringln("GPU: " +telefonito.get_sGpu());
		showFloat(telefonito.get_fCamfrontMP());
		showFloat(telefonito.get_fCambackMP());
		showInt(telefonito.get_iMahBat());
		showStringln("Sistema: " +telefonito.get_sSo());
		
	}

}
