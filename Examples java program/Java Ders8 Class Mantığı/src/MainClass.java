
public class MainClass {
	
	public static void main(String[] args) {
	
		Araba benimArabam=new Araba();//Nesnemi olu�turmu� oldum Class�m� olu�turmu� oldum b�ylece
		/*�lk durumu olu�turmu� oldum*/
		
		benimArabam.benzilli=false;
		benimArabam.�al���or=false;
		benimArabam.kapasite=4;
		benimArabam.renk="Beyaz";
		
		benimArabam.cal�st�r();
		benimArabam.h�zland�r(50);
		benimArabam.h�zland�r(60);
		benimArabam.bilgiAl();
		
		benimArabam.yavaslat(30);
		benimArabam.bilgiAl();
		benimArabam.yavaslat(20);
		benimArabam.bilgiAl();
		benimArabam.yavaslat(10);
		benimArabam.bilgiAl();
		benimArabam.durdur();
		benimArabam.bilgiAl();
	}
}
