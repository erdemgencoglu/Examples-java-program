import java.util.Scanner;
public class AlanHesaplama {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
	
		System.out.printf("Dairenin yar� �ap�n� giriniz:");
		int cap=input.nextInt();
		int alan=(cap*cap);
		System.out.println("Dairenin alan�="+alan*Math.PI+" d�r");
	}

}
