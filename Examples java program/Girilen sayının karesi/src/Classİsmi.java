import	javax.swing.*;;

public class Class�smi 
{

	public static double kare(double x) 
	{
		return x*x;	
		}
	public static void main(String[] args)
	{
	double sayi=Double.parseDouble(JOptionPane.showInputDialog("Bir ger�ek sayi giriniz:"));//parseDouble klavyeyi kullanmam�z� sa�lar
	JOptionPane.showMessageDialog(null, "girilen say�n�n karesi:"+kare(sayi));	
}}
