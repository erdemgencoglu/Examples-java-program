
public class MainClass {
	
	public static void main(String[] args) {
	
		Araba benimArabam=new Araba();//Nesnemi oluþturmuþ oldum Classýmý oluþturmuþ oldum böylece
		/*Ýlk durumu oluþturmuþ oldum*/
		
		benimArabam.benzilli=false;
		benimArabam.çalýþýor=false;
		benimArabam.kapasite=4;
		benimArabam.renk="Beyaz";
		
		benimArabam.calýstýr();
		benimArabam.hýzlandýr(50);
		benimArabam.hýzlandýr(60);
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
