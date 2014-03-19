import java.util.Scanner;
public class VoidMainMetod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		Square test1=new Square();
		Circle test2=new Circle();
while(true){		
		System.out.println("Welcome to Circle/Square Tester. Please select an entry from menu:");
		System.out.println("1 - Modify a circle object");
		System.out.println("2-  Modify a square object");
		System.out.println("3 - Compare square and circle");
		System.out.println("3 - Exit");
		int secim=input.nextInt();
		switch (secim) {
		case 1:
		System.out.println("enter radius");
		test2.setRadius(input.nextDouble());
			break;
		case 2:
		System.out.println("enter length");
		test1.setLength(input.nextDouble());
		
		case 3:
		System.out.println("Circle Area= "+test2.getArea()+"-Square area= "+test1.getArea());
		test1.setLength(input.nextDouble());
		
		int gelen=test2.compareArea(test1);
		if(gelen==0){
		System.out.println("Areas is equal");
		}
		else if (gelen==1) {
			System.out.println("Circle is bigger than square");
		}
		else
			System.out.println("Square is bigger than circle");
		}
	}
	}
}
