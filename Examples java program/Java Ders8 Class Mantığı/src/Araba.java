
public class Araba {

	//instance variable
	
	String renk;
	int kapasite;
	boolean benzilli;
	boolean �al���or;
	
	int h�z;
	
	public void cal�st�r(){
		
		�al���or=true;
	}
	public void durdur(){
		
		�al���or=false;
		h�z=0;
	}
	public void h�zland�r(int kacKm/*kacKm burada parametredir.*/){
	
	h�z+=kacKm;
	}
	public void yavaslat(int kacKm){
		if (h�z>kacKm) {
		h�z-=kacKm;
		}else
		h�z=0;
	}
	public void bilgiAl(){
	System.out.println("Renk: "+renk);
	System.out.println("Kapasite: "+kapasite);
	System.out.println("�uanki h�z:"+h�z);
		if (benzilli) {
			System.out.println("Benzinli\n");
		}else System.out.println("Dizel\n");
	System.out.println("�al���or: "+�al���or);
	
	}
}
