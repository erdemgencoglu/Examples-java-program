import	javax.swing.*;;

public class ClassÝsmi 
{

	public static double kare(double x) 
	{
		return x*x;	
		}
	public static void main(String[] args)
	{
	double sayi=Double.parseDouble(JOptionPane.showInputDialog("Bir gerçek sayi giriniz:"));//parseDouble klavyeyi kullanmamýzý saðlar
	JOptionPane.showMessageDialog(null, "girilen sayýnýn karesi:"+kare(sayi));	
}}
