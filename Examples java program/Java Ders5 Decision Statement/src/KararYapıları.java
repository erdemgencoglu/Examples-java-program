import java.util.Scanner;
public class KararYap�lar� {

	public static void main(String[] args) {
		//Karar Yap�lar�
	@SuppressWarnings("resource")
	Scanner input= new Scanner(System.in);
	int sayi1;
	int sayi2;
		 System.out.printf("1. Say�y� giriniz:");
		 sayi1=input.nextInt();
		 System.out.printf("2. sayiyi giriniz:");
		 sayi2=input.nextInt();
	if(sayi1+sayi2>20){
		
		System.out.println("Sayiniz 20 den b�y�k");
	}else 
		System.out.printf("Sayiniz 20 den k���k");	 
	
	}
}
