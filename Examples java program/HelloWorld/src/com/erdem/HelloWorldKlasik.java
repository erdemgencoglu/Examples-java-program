package com.erdem;

public class HelloWorldKlasik {
	private String isim;//Global Değişken
	
	public HelloWorldKlasik(){
		
		
	}
	
	public void setisim(String isim){
		this.isim=isim;//Burda bir  class var daki isimi isime ata demek this.isim
	}
	public String getisim(){// tanımladıgımız değişkenimizi bize getiren get metodudur.
		return isim;
	}
}
