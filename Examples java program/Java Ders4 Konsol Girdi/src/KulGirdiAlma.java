
import java.util.Scanner;

public class KulGirdiAlma {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner al=new Scanner(System.in);

	System.out.printf("L�tfen Kullanici adinizi giriniz:");
	String input=al.nextLine();
	System.out.println("Merhaba =" +input);
	
	System.out.printf("Ya��n�z nedir? :");
	int yas=al.nextInt();
	System.out.println("Ya��n�z:"+yas+" d�r");
	}

}
