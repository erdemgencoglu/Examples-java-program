
public class Araba {

	//instance variable
	
	String renk;
	int kapasite;
	boolean benzilli;
	boolean çalýþýor;
	
	int hýz;
	
	public void calýstýr(){
		
		çalýþýor=true;
	}
	public void durdur(){
		
		çalýþýor=false;
		hýz=0;
	}
	public void hýzlandýr(int kacKm/*kacKm burada parametredir.*/){
	
	hýz+=kacKm;
	}
	public void yavaslat(int kacKm){
		if (hýz>kacKm) {
		hýz-=kacKm;
		}else
		hýz=0;
	}
	public void bilgiAl(){
	System.out.println("Renk: "+renk);
	System.out.println("Kapasite: "+kapasite);
	System.out.println("Þuanki hýz:"+hýz);
		if (benzilli) {
			System.out.println("Benzinli\n");
		}else System.out.println("Dizel\n");
	System.out.println("Çalýþýor: "+çalýþýor);
	
	}
}
