
public class Otob�sTest {

	public static void main(String[] args) {
		Otob�s BursaAnkara=new Otob�s();
		
		BursaAnkara.aktif=true;
		BursaAnkara.kapasite=20;
		BursaAnkara.nereden="Bursa";
		BursaAnkara.nereye="Ankara";
		
		for(int i=0;i<30;i++){
			BursaAnkara.YolcuAl();
		}
		BursaAnkara.BilgiAl();
	
		BursaAnkara.Yolcu��kar();
		BursaAnkara.Yolcu��kar();
		BursaAnkara.BilgiAl();
	}
	
}
