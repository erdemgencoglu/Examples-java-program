import java.util.Scanner;
public class AlanHesaplama {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
	
		System.out.printf("Dairenin yarý çapýný giriniz:");
		int cap=input.nextInt();
		int alan=(cap*cap);
		System.out.println("Dairenin alaný="+alan*Math.PI+" dýr");
	}

}
