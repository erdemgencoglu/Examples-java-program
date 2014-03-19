import java.util.Scanner;
public class KararYapýlarý {

	public static void main(String[] args) {
		//Karar Yapýlarý
	@SuppressWarnings("resource")
	Scanner input= new Scanner(System.in);
	int sayi1;
	int sayi2;
		 System.out.printf("1. Sayýyý giriniz:");
		 sayi1=input.nextInt();
		 System.out.printf("2. sayiyi giriniz:");
		 sayi2=input.nextInt();
	if(sayi1+sayi2>20){
		
		System.out.println("Sayiniz 20 den büyük");
	}else 
		System.out.printf("Sayiniz 20 den küçük");	 
	
	}
}
