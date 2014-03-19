
public class Ortalama {

	public double Hesapla(double... Rakamlar){
	
	double toplam=0;
	double sayi=0;

	for (double d: Rakamlar) {
		toplam+=d;
		sayi++; 
	}
	return toplam/sayi;
	}
}
