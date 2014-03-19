
import java.util.Scanner;

public class OrtalamaMainMetod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		Ortalama hesapla=new Ortalama();
		System.out.println("Bir sayi giriniz: ");
		double al=input.nextDouble();	
		System.out.println("Bir sayi daha giriniz: ");
		double al1=input.nextDouble();	
		
		System.out.println(hesapla.Hesapla(al,al1));
	}

} 
